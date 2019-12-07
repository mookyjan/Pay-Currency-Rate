package com.mudassirkhan.domain.gateway

import com.mudassirkhan.domain.entity.Quotes
import com.mudassirkhan.domain.entity.CurrencyListEntity
import io.reactivex.Single

interface CurrencyListGateway {

    fun getCurrencyList(quotesList: List<Quotes>): Single<List<CurrencyListEntity>>
}