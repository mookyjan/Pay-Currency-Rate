package com.mudassirkhan.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mudassirkhan.data.local.dao.CurrencyListDao
import com.mudassirkhan.data.local.entity.CurrencyLocalModel

@Database(entities = [CurrencyLocalModel::class], version = 1, exportSchema = false)
abstract class PayCurrencyDatabase : RoomDatabase() {

    abstract fun currencyDao(): CurrencyListDao

    companion object {

        fun newInstance(context: Context): PayCurrencyDatabase {
            return Room.databaseBuilder(
                context, PayCurrencyDatabase::class.java,
                "pay_currency.db"
            )
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}