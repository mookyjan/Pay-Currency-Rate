package com.mudassirkhan.paycurrencyrate.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/mudassirkhan/paycurrencyrate/ui/adapter/ViewBindingAdapters;", "", "()V", "setProductAdapter", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "items", "", "Lcom/mudassirkhan/domain/entity/Quotes;", "callbacks", "Lcom/mudassirkhan/paycurrencyrate/ui/adapter/CurrencyRateListAdapter$Callbacks;", "app_debug"})
public final class ViewBindingAdapters {
    public static final com.mudassirkhan.paycurrencyrate.ui.adapter.ViewBindingAdapters INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"currencyAdapter", "currencyCallbacks"})
    public static final void setProductAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.mudassirkhan.domain.entity.Quotes> items, @org.jetbrains.annotations.Nullable()
    com.mudassirkhan.paycurrencyrate.ui.adapter.CurrencyRateListAdapter.Callbacks callbacks) {
    }
    
    private ViewBindingAdapters() {
        super();
    }
}