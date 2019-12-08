package com.mudassirkhan.data.mapper

import com.mudassirkhan.data.local.entity.CurrencyLocalModel
import com.mudassirkhan.data.remote.entities.Quotes

class DataToDomainMapper {

    fun mapDataToDomainQuotes(dataQuotes: Quotes) = com.mudassirkhan.domain.entity.Quotes(
        symbol  = dataQuotes.symbol,
        rate = dataQuotes.rate,
        unit = dataQuotes.symbol
    )

    fun mapDataToDomainQuotes(items: List<Quotes>) = items.map { mapDataToDomainQuotes(it) }

//    fun mapDataToDomainCurrency(currencyList: Currency) = com.mudassirkhan.domain.entity.CurrencyListEntity(
//        key  = currencyList.symbol,
//        value = currencyList.rate,
//        unit = currencyList.uni
//    )
//
//    fun mapDataToDomainCurrency(items: List<Currency>) = items.map { mapDataToDomainCurrency(it) }


    fun mapLocalToDomainCurrency(currencyList: CurrencyLocalModel) =
        com.mudassirkhan.domain.entity.CurrencyListEntity(
            key = currencyList.symbol,
            value = currencyList.exchangeRate,
            unit = currencyList.unit
        )

    fun mapLocalToDomainCurrency(items: List<CurrencyLocalModel>) =
        items.map { mapLocalToDomainCurrency(it) }

//    fun toLocal(currencyList: CurrencyListResponse) = CurrencyLocalModel(
//        symbol  = currencyList.currencies.fi,
//        exchangeRate = currencyList.rate
//    )
//
//    fun toLocal(items: List<Currency>) = items.map { toLocal(it) }

//    fun toLocal(list: List<CurrencyListResponse>): List<Currency> {
//        list.cu
//        return list..map {
//            Currency(
//                symbol = it.symbol,
//                rate = it.exchangeRate
//            )
//        }
//    }
}