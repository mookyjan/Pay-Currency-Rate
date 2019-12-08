package com.mudassirkhan.domain.interactor

import com.mudassirkhan.domain.Schedulers
import com.mudassirkhan.domain.UseCase
import com.mudassirkhan.domain.entity.CurrencyListEntity
import com.mudassirkhan.domain.gateway.CurrencyListGateway
import io.reactivex.Single

class GetCurrencyListUseCase constructor(private val schedulers: Schedulers,
                                         private val currencyListGateway: CurrencyListGateway) :
    UseCase<List<CurrencyListEntity>>(schedulers) {

    lateinit var engineerList: List<CurrencyListEntity>

    public fun setParam(engineers: List<CurrencyListEntity>) {
        this.engineerList = engineers
    }

    override fun buildObservable(): Single<List<CurrencyListEntity>> {
//        if (params == null) throw MissingUseCaseParameterException(javaClass)
        val result = currencyListGateway.getCurrencyList()
        return result
    }
}