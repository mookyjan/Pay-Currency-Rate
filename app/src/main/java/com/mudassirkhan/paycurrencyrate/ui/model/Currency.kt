package com.mudassirkhan.paycurrencyrate.ui.model

data class Currency(
    val symbol: String,
    var exchangeRate: Double?,
    val unit: String?
)