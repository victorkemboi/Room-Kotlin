package com.first.vickimes.room.Repo

import android.arch.lifecycle.ViewModel

/**
 * Created by vicki mes on 3/23/2018.
 */
class MainActivityViewModel
constructor(private val quoteRepo: QuoteRepo) : ViewModel() {
    val quotes = quoteRepo.findAll()
}