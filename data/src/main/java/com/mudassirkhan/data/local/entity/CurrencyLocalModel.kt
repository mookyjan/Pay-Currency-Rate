package com.mudassirkhan.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Currency")
data class CurrencyLocalModel(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val symbol: String,
    val unit: String = "",
    val exchangeRate: Float = 1.0f
)