package com.mudassirkhan.paycurrencyrate.ui.currencyratelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2 = {"Lcom/mudassirkhan/paycurrencyrate/ui/currencyratelist/CurrencyRateListViewModel;", "Landroidx/lifecycle/ViewModel;", "currencyRateListUseCase", "Lcom/mudassirkhan/domain/interactor/GetCurrencyRateListUseCase;", "(Lcom/mudassirkhan/domain/interactor/GetCurrencyRateListUseCase;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currencyList", "Landroidx/databinding/ObservableArrayList;", "Lcom/mudassirkhan/domain/entity/Quotes;", "getCurrencyList", "()Landroidx/databinding/ObservableArrayList;", "setCurrencyList", "(Landroidx/databinding/ObservableArrayList;)V", "empty", "Landroidx/databinding/ObservableBoolean;", "getEmpty", "()Landroidx/databinding/ObservableBoolean;", "error", "Landroidx/databinding/ObservableField;", "", "getError", "()Landroidx/databinding/ObservableField;", "loading", "Landroidx/lifecycle/MutableLiveData;", "", "getLoading", "()Landroidx/lifecycle/MutableLiveData;", "getCurrencyRateList", "", "app_debug"})
public final class CurrencyRateListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableArrayList<com.mudassirkhan.domain.entity.Quotes> currencyList;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> error = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean empty = null;
    private final com.mudassirkhan.domain.interactor.GetCurrencyRateListUseCase currencyRateListUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableArrayList<com.mudassirkhan.domain.entity.Quotes> getCurrencyList() {
        return null;
    }
    
    public final void setCurrencyList(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableArrayList<com.mudassirkhan.domain.entity.Quotes> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getEmpty() {
        return null;
    }
    
    public final void getCurrencyRateList() {
    }
    
    @javax.inject.Inject()
    public CurrencyRateListViewModel(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.domain.interactor.GetCurrencyRateListUseCase currencyRateListUseCase) {
        super();
    }
}