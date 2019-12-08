package com.mudassirkhan.data.local

import com.mudassirkhan.data.local.dao.CurrencyListDao
import com.mudassirkhan.data.local.entity.CurrencyLocalModel
import io.reactivex.Single

class CurrencyListLocalDataSource(private val currencyListDao: CurrencyListDao) {

    fun getCurrenciesListFromDb(): Single<List<CurrencyLocalModel>> =
        currencyListDao.getAllCurrency()

    fun insertAll(currenciesList: List<CurrencyLocalModel>) =
        currencyListDao.insertAll(currenciesList)

    fun update(id: String, exchangeRate: Float) = currencyListDao.update(id, exchangeRate)
}