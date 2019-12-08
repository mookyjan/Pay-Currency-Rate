package com.mudassirkhan.domain.gateway

import com.mudassirkhan.domain.entity.CurrencyListEntity
import io.reactivex.Single

interface CurrencyListGateway {

    fun getCurrencyList(): Single<List<CurrencyListEntity>>
}