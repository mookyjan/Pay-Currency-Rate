package com.mudassirkhan.domain.interactor

import com.mudassirkhan.domain.Schedulers
import com.mudassirkhan.domain.UseCase
import com.mudassirkhan.domain.entity.Quotes
import com.mudassirkhan.domain.gateway.CurrencyRateGateway
import io.reactivex.Single

class GetCurrencyRateListUseCase(private val schedulers: Schedulers,
                                 private val currencyRateGateway: CurrencyRateGateway) : UseCase<List<Quotes>>(schedulers) {

    override fun buildObservable(): Single<List<Quotes>> {
        val result = currencyRateGateway.getCurrencyRateList()
        return result
    }

}