package com.first.vickimes.room

import android.arch.lifecycle.Observer
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.first.vickimes.room.Models.Quote
import com.first.vickimes.room.Repo.MainActivityViewModel
import com.first.vickimes.room.Repo.QuoteAdapter
import com.first.vickimes.room.Repo.QuoteDataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val quoteRepo = QuoteDataSource(App.INSTANCE.quoteDB.quoteDao())
    val mainActivityViewModel  = MainActivityViewModel(quoteRepo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvQuotes.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        mainActivityViewModel.quotes.observe(this, Observer<List<Quote>> { quotes->
            run {
                if (quotes != null) {
                    val adapter = QuoteAdapter(quotes)
                    rvQuotes.adapter = adapter
                }
            }
        })
        add_quote.setOnClickListener {
            val intent = Intent(this, AddQuote::class.java)
            startActivity(intent)
        }
    }
}
