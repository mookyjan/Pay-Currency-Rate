package com.mudassirkhan.data.repositories

import com.mudassirkhan.data.mapper.DataToDomainMapper
import com.mudassirkhan.data.remote.RemoteDataSource
import com.mudassirkhan.data.remote.entities.CurrencyRateResponse

import io.reactivex.Single

class CurrencyRepository (private val remoteDataSource: RemoteDataSource,
                          private val mapper: DataToDomainMapper) {

    fun getCurrencyRateList() : Single<CurrencyRateResponse>{

//        var useCaseResult = UseCaseResult<T>
     return   remoteDataSource.getCurrencyRateList()
            .map {

                val rates = arrayListOf<com.mudassirkhan.data.remote.entities.Quotes>()
                rates.addAll(it.quotes!!.map { com.mudassirkhan.data.remote.entities.Quotes(it.key,it.value)})

              it?.let {
                  mapper.mapDataToDomainQuotes(rates)
              }
//                it.quotes?.let {
//
//                    mapper.mapDataToDomainQuotes(it)
//                }
                it
//                UseCaseResult.Success(it)
            }



    }

}