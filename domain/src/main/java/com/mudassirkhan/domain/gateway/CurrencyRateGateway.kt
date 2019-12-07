package com.mudassirkhan.domain.gateway

import com.mudassirkhan.domain.entity.Quotes
import io.reactivex.Single

interface CurrencyRateGateway {

    fun getCurrencyRateList(): Single<List<Quotes>>
}