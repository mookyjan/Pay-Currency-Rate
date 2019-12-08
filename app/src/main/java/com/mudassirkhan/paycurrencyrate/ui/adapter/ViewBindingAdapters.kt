package com.mudassirkhan.paycurrencyrate.ui.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mudassirkhan.paycurrencyrate.ui.model.Currency

object ViewBindingAdapters {

    @JvmStatic
    @BindingAdapter("currencyAdapter", "currencyCallbacks", requireAll = false)
    fun setProductAdapter(
        recyclerView: RecyclerView,
        items: List<Currency>?,
        callbacks: CurrencyRateListAdapter.Callbacks?
    ) {
        items?.let {
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = CurrencyRateListAdapter(it, callbacks)
        }
    }
}