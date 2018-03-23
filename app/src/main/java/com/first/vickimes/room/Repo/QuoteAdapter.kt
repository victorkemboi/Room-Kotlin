package com.first.vickimes.room.Repo

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.first.vickimes.room.Models.Quote
import com.first.vickimes.room.R


/**
 * Created by vicki mes on 3/23/2018.
 */
class QuoteAdapter(val quoteList: List<Quote>): RecyclerView.Adapter<QuoteAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tvQuote?.text = quoteList[position].quote

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_quote, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return quoteList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvQuote = itemView.findViewById<TextView>(R.id.tvQuote)
        val btnDelete = itemView.findViewById<TextView>(R.id.btnDelete)

    }
}