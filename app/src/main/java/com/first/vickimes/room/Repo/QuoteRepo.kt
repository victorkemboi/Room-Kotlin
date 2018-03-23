package com.first.vickimes.room.Repo

import android.arch.lifecycle.LiveData
import com.first.vickimes.room.Models.Quote

/**
 * Created by vicki mes on 3/23/2018.
 */
interface QuoteRepo {
    fun findAll(): LiveData<List<Quote>>

    fun insert(quote: Quote): Long

    fun update(quote: Quote)
}