package com.mudassirkhan.data.remote.entities

import com.mudassirkhan.data.local.entity.CurrencyLocalModel
import com.squareup.moshi.Json

data class CurrencyListResponse(
    @Json(name = "currencies")
    val currencies: Map<String, String> = mutableMapOf()
) {
    val currenciesList = currencies.toList()
}


fun CurrencyListResponse.asDatabaseModel(): List<CurrencyLocalModel> {
    return currenciesList.map {
        CurrencyLocalModel(symbol = it.first, unit = it.second)
    }
}
