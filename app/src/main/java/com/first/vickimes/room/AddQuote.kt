package com.first.vickimes.room

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.first.vickimes.room.Repo.AddQuoteViewMOdel
import com.first.vickimes.room.Repo.QuoteDataSource
import kotlinx.android.synthetic.main.activity_add_quote.*
class AddQuote : AppCompatActivity() {

    val quoteRepo = QuoteDataSource(App.INSTANCE.quoteDB.quoteDao())
    val addQuoteViewModel = AddQuoteViewMOdel(quoteRepo)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_quote)
        btnAdd.setOnClickListener {
            if (eTQuote.text.toString() != ""){
                addQuoteViewModel.quote.quote = eTQuote.text.toString()
                addQuoteViewModel.addQuote()
                finish()
            }


        }
    }

}
