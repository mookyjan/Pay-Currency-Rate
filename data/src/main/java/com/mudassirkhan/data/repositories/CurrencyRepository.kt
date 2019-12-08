package com.mudassirkhan.data.repositories

import com.mudassirkhan.data.local.CurrencyListLocalDataSource
import com.mudassirkhan.data.local.entity.CurrencyLocalModel
import com.mudassirkhan.data.mapper.DataToDomainMapper
import com.mudassirkhan.data.remote.RemoteDataSource
import com.mudassirkhan.data.remote.entities.CurrencyRateResponse
import com.mudassirkhan.data.remote.entities.asDatabaseModel
import io.reactivex.Observable
import io.reactivex.Single

class CurrencyRepository (private val remoteDataSource: RemoteDataSource,
                          private val localDataSource: CurrencyListLocalDataSource,
                          private val mapper: DataToDomainMapper) {


    fun getCurrecnyList(): Single<List<CurrencyLocalModel>> {
        val local = localDataSource.getCurrenciesListFromDb()
            .filter { !it.isEmpty() }
        val remote = remoteDataSource.getCurrencyList()
            .toObservable()
            .map { it.asDatabaseModel() }
            .doOnNext { localDataSource.insertAll(it) }
        return Observable.concat(local.toObservable(), remote)
            .firstElement()
            .toSingle()
    }

    fun getCurrencyRateList() : Single<CurrencyRateResponse>{
//        var useCaseResult = UseCaseResult<T>

        return remoteDataSource.getCurrencyRateList().map {
            it.asDatabaseModel()
                .forEach {
                    localDataSource.update(it.symbol, it.exchangeRate)
                }
            it
        }
//     return   remoteDataSource.getCurrencyRateList()
//            .map {
//
//                val rates = arrayListOf<com.mudassirkhan.data.remote.entities.Quotes>()
//                rates.addAll(it.quotes!!.map { com.mudassirkhan.data.remote.entities.Quotes(it.key,it.value)})
//
//              it?.let {
//                  mapper.mapDataToDomainQuotes(rates)
//              }
//                it
//            }

    }

}