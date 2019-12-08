package com.mudassirkhan.paycurrencyrate.di.module

import com.mudassirkhan.domain.Schedulers
import com.mudassirkhan.domain.gateway.CurrencyListGateway
import com.mudassirkhan.domain.gateway.CurrencyRateGateway
import com.mudassirkhan.domain.interactor.GetCurrencyListUseCase
import com.mudassirkhan.domain.interactor.GetCurrencyRateListUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideCurrencyRateUseCase(schedulers: Schedulers, currencyRateGateway: CurrencyRateGateway): GetCurrencyRateListUseCase{
        return  GetCurrencyRateListUseCase(schedulers,currencyRateGateway)
    }

    @Provides
    fun provideCurrencyListUseCase(
        schedulers: Schedulers,
        currencyListGateway: CurrencyListGateway
    ): GetCurrencyListUseCase {
        return GetCurrencyListUseCase(schedulers, currencyListGateway)
    }
}