package com.first.vickimes.room.Models

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by vicki mes on 3/23/2018.
 */
@Database(entities = arrayOf(Quote::class), version = 1, exportSchema = false)
abstract class QuoteDataBase : RoomDatabase(){

    abstract fun quoteDao(): QuoteDAO
}