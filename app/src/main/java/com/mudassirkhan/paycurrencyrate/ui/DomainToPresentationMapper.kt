package com.mudassirkhan.paycurrencyrate.ui


import com.mudassirkhan.domain.entity.Quotes
import com.mudassirkhan.paycurrencyrate.ui.model.Currency

class DomainToPresentationMapper {

    fun mapDataToPresentationQuotes(dataQuotes: Quotes) = Currency(
        symbol = dataQuotes.symbol,
        exchangeRate = dataQuotes.rate.toDouble(),
        unit = ""
    )

    fun mapDataToPresentationQuotes(items: List<Quotes>) =
        items.map { mapDataToPresentationQuotes(it) }


    fun mapQuotesToPresentationCurrency(currinces: Currency) = Quotes(
        symbol = currinces.symbol,
        rate = currinces.exchangeRate!!.toFloat(),
        unit = currinces.unit
    )

    fun mapQuotesToPresentationCurrency(items: List<Currency>) =
        items.map { mapQuotesToPresentationCurrency(it) }
}