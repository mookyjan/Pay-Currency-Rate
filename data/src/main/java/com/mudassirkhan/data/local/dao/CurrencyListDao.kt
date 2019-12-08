package com.mudassirkhan.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mudassirkhan.data.local.entity.CurrencyLocalModel
import io.reactivex.Single

@Dao
interface CurrencyListDao {

    @Query("select * from currency")
    fun getAllCurrency(): Single<List<CurrencyLocalModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list: List<CurrencyLocalModel>)

    @Query("update currency set exchangeRate = :exchangeRate where id=:id")
    fun update(id: String, exchangeRate: Float)
}