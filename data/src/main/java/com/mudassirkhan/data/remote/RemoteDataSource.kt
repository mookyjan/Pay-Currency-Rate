package com.mudassirkhan.data.remote

import com.mudassirkhan.data.remote.api.CurrencyApiService

class RemoteDataSource (private val apiService: CurrencyApiService) {


      fun getCurrencyRateList() = apiService.getCurrenciesRateList()

}