package com.mudassirkhan.paycurrencyrate.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.github.ajalt.timberkt.Timber
import com.mudassirkhan.domain.entity.Quotes
import com.mudassirkhan.paycurrencyrate.R
import com.mudassirkhan.paycurrencyrate.databinding.SingleCurrencyItemBinding

class CurrencyRateListAdapter (private val quotesList : List<Quotes>):RecyclerView.Adapter<CurrencyRateListAdapter.ViewHolder>() {


    inner class ViewHolder(val binding: SingleCurrencyItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Timber.d { "currency list $quotesList" }
        val inflater = LayoutInflater.from(parent.context)
        val binding: SingleCurrencyItemBinding = DataBindingUtil.inflate(inflater, R.layout.single_currency_item, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return quotesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     holder.binding.currency = quotesList.get(position)
        holder.binding.executePendingBindings()
    }

    interface Callbacks {
        fun onItemClick(view: View, item: Quotes)
    }
}