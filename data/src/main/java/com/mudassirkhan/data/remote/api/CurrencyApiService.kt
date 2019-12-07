package com.mudassirkhan.data.remote.api

import com.mudassirkhan.data.remote.entities.CurrencyRateResponse

import io.reactivex.Single
import retrofit2.http.GET

interface CurrencyApiService {

    @GET("live?access_key=c3e3d769904df94547dc93f09f9017fe")
    fun getCurrenciesRateList(): Single<CurrencyRateResponse>
}