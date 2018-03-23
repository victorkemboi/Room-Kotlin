package com.first.vickimes.room.Repo

import android.arch.lifecycle.LiveData
import com.first.vickimes.room.Models.Quote
import com.first.vickimes.room.Models.QuoteDAO

/**
 * Created by vicki mes on 3/23/2018.
 */
class QuoteDataSource
constructor(private val quoteDAO: QuoteDAO): QuoteRepo{
    override fun findAll(): LiveData<List<Quote>> {
        return quoteDAO.quotes
    }

    override fun insert(quote: Quote): Long {
        return quoteDAO.insertQuote(quote)
    }

    override fun update(quote: Quote){
         quoteDAO.updateQuote(quote)
    }

}