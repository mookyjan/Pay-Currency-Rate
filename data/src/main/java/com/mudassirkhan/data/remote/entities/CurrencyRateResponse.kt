package com.mudassirkhan.data.remote.entities

import com.mudassirkhan.data.local.entity.CurrencyLocalModel
import com.squareup.moshi.Json

data class CurrencyRateResponse (
    @Json(name = "success")
    var success: Boolean? = null,
    @Json(name = "terms")
    var terms: String? = null,
    @Json(name = "privacy")
    var privacy: String? = null,
    @Json(name = "timestamp")
    var timestamp: Int? = null,
    @Json(name = "source")
    var source: String? = null,
    @Json(name = "quotes")
    var quotes: Map<String,Float>? = null
){
    val quotesList = quotes!!.toList()
}

fun CurrencyRateResponse.asDatabaseModel(): List<CurrencyLocalModel> {
    return quotesList.map {
        val symbol = it.first.substring(3..5)
        CurrencyLocalModel(symbol = symbol, exchangeRate = it.second)
    }
}