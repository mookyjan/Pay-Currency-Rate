package com.mudassirkhan.data.mapper

import com.mudassirkhan.data.remote.entities.Quotes

class DataToDomainMapper {

    fun mapDataToDomainQuotes(dataQuotes: Quotes) = com.mudassirkhan.domain.entity.Quotes(
        symbol  = dataQuotes.symbol,
        rate = dataQuotes.rate
    )

    fun mapDataToDomainQuotes(items: List<Quotes>) = items.map { mapDataToDomainQuotes(it) }

}