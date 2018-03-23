package com.first.vickimes.room.Models

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*

/**
 * Created by vicki mes on 3/23/2018.
 */
@Dao
interface QuoteDAO {
    @get:Query("Select * from quote")
    val quotes: LiveData<List<Quote>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertQuote(quote: Quote): Long

    @Update
    fun updateQuote(quote: Quote)
}