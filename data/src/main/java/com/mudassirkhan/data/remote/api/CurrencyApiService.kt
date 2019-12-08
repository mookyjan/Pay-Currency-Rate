package com.mudassirkhan.data.remote.api

import com.mudassirkhan.data.remote.entities.CurrencyListResponse
import com.mudassirkhan.data.remote.entities.CurrencyRateResponse

import io.reactivex.Single
import retrofit2.http.GET

interface CurrencyApiService {

    @GET("live")
    fun getCurrenciesRateList(): Single<CurrencyRateResponse>


    @GET("list")
    fun getCurrencyList(): Single<CurrencyListResponse>
}