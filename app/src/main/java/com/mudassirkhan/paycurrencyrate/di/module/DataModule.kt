package com.mudassirkhan.paycurrencyrate.di.module

import android.content.Context
import com.mudassirkhan.data.local.CurrencyListLocalDataSource
import com.mudassirkhan.data.local.dao.CurrencyListDao
import com.mudassirkhan.data.local.database.PayCurrencyDatabase
import com.mudassirkhan.data.mapper.DataToDomainMapper
import com.mudassirkhan.data.remote.RemoteDataSource
import com.mudassirkhan.data.remote.api.CurrencyApiService
import com.mudassirkhan.data.repositories.CurrencyRateListRepositoryImpl
import com.mudassirkhan.data.repositories.CurrencyRepository
import com.mudassirkhan.domain.gateway.CurrencyListGateway
import com.mudassirkhan.domain.gateway.CurrencyRateGateway
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {


    @Provides
    @Singleton
    internal fun provideRemoteDataSource(currencyApiService: CurrencyApiService):RemoteDataSource{
        return RemoteDataSource(currencyApiService)
    }

    @Provides
    @Singleton
    internal fun providePayCurrencyDatabase(context: Context): PayCurrencyDatabase {

        return PayCurrencyDatabase.newInstance(context)
    }

    @Provides
    @Singleton
    internal fun provideDao(payCurrencyDatabase: PayCurrencyDatabase): CurrencyListDao {
        return payCurrencyDatabase.currencyDao()
    }

    @Provides
    @Singleton
    internal fun provideLocalDataSource(currencyListDao: CurrencyListDao): CurrencyListLocalDataSource {
        return CurrencyListLocalDataSource(currencyListDao)
    }

    @Provides
    @Singleton
    internal fun provideCurrencyRateRepository(
        remoteDataSource: RemoteDataSource,
        localDataSource: CurrencyListLocalDataSource
    ): CurrencyRepository {
        return CurrencyRepository(remoteDataSource, localDataSource, DataToDomainMapper())
    }

    @Provides
    @Singleton
    internal fun provideCurrencyListGateWay(currencyRepository: CurrencyRepository): CurrencyListGateway {

        return CurrencyRateListRepositoryImpl(currencyRepository)
    }

    @Provides
    @Singleton
    internal fun provideCurrencyRateGateway(currencyRepository: CurrencyRepository): CurrencyRateGateway{
        return CurrencyRateListRepositoryImpl(currencyRepository)
    }
}