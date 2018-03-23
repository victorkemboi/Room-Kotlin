package com.first.vickimes.room

import android.app.Application
import android.arch.persistence.room.Room
import com.first.vickimes.room.Models.QuoteDataBase

/**
 * Created by vicki mes on 3/23/2018.
 */
class App: Application() {
    val quoteDB = Room.databaseBuilder(this, QuoteDataBase::class.java, "QuoteDb")
            .build()
    override fun onCreate() {

        super.onCreate()
        INSTANCE = this


    }

    companion object {
        lateinit var INSTANCE: App
    }
}