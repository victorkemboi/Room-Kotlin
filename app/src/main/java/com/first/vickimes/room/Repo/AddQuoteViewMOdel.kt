package com.first.vickimes.room.Repo

import android.arch.lifecycle.ViewModel
import com.first.vickimes.room.Models.Quote

/**
 * Created by vicki mes on 3/23/2018.
 */
class AddQuoteViewMOdel
constructor(private val quoteRepo: QuoteRepo) : ViewModel() {
    val quote = Quote("")
    fun addQuote () {
        object : Thread() {
            override fun run() {
                quoteRepo.insert(quote )
            }
        }.start()
    }
}