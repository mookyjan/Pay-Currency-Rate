package com.mudassirkhan.data.repositories

import com.mudassirkhan.data.mapper.DataToDomainMapper
import com.mudassirkhan.domain.entity.CurrencyListEntity
import com.mudassirkhan.domain.entity.Quotes
import com.mudassirkhan.domain.gateway.CurrencyListGateway
import com.mudassirkhan.domain.gateway.CurrencyRateGateway
import io.reactivex.Single

class CurrencyRateListRepositoryImpl(private val currencyRepository: CurrencyRepository) :
    CurrencyRateGateway, CurrencyListGateway {


    private val mapperEngineer = DataToDomainMapper()


    override fun getCurrencyList(): Single<List<CurrencyListEntity>> {

        return currencyRepository.getCurrecnyList()
            .map {
                //                val currencies = arrayListOf<com.mudassirkhan.data.remote.entities.Currency>()
//                currencies.addAll(it.currencies!!.map { com.mudassirkhan.data.remote.entities.Currency(it.key,it.value)})
                mapperEngineer.mapLocalToDomainCurrency(it)
            }
    }

    override fun getCurrencyRateList(): Single<List<Quotes>> {

        return currencyRepository.getCurrencyRateList()
            .doOnError {
                println("Currency list error")
            }
//            .map {
//                UseCaseResult.Success(it)
//
//            }
            .map {

                val rates = arrayListOf<com.mudassirkhan.data.remote.entities.Quotes>()
                rates.addAll(it.quotes!!.map { com.mudassirkhan.data.remote.entities.Quotes(it.key,it.value)})

              mapperEngineer.mapDataToDomainQuotes(rates.toList())

//                it.quotes.let {
//                    mapperEngineer.mapDataToDomainQuotes(it!!.map { Quotes(it.key,it.value) }!!)
//                }
//                it.quotes?.map {
//                    mapperEngineer.mapDataToDomainQuotes(it)
//                }
            }

    }


}