package com.mudassirkhan.paycurrencyrate.di.module

import com.mudassirkhan.data.mapper.DataToDomainMapper
import com.mudassirkhan.data.remote.RemoteDataSource
import com.mudassirkhan.data.remote.api.CurrencyApiService
import com.mudassirkhan.data.repositories.CurrencyRateListRepositoryImpl
import com.mudassirkhan.data.repositories.CurrencyRepository
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
    internal fun provideCurrencyRateRepository(remoteDataSource: RemoteDataSource):CurrencyRepository{
        return CurrencyRepository(remoteDataSource, DataToDomainMapper())
    }

    @Provides
    @Singleton
    internal fun provideCurrencyRateGateway(currencyRepository: CurrencyRepository): CurrencyRateGateway{
        return CurrencyRateListRepositoryImpl(currencyRepository)
    }
}