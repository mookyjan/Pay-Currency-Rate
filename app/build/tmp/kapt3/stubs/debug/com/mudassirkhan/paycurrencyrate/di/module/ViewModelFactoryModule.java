package com.mudassirkhan.paycurrencyrate.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH!\u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/mudassirkhan/paycurrencyrate/di/module/ViewModelFactoryModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lcom/mudassirkhan/paycurrencyrate/di/module/ViewModelFactory;", "provideEngineerListViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/mudassirkhan/paycurrencyrate/ui/currencyratelist/CurrencyRateListViewModel;", "provideEngineerListViewModel$app_debug", "app_debug"})
@dagger.Module()
public abstract class ViewModelFactoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.paycurrencyrate.di.module.ViewModelFactory viewModelFactory);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.mudassirkhan.paycurrencyrate.ui.currencyratelist.CurrencyRateListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel provideEngineerListViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.paycurrencyrate.ui.currencyratelist.CurrencyRateListViewModel viewModel);
    
    public ViewModelFactoryModule() {
        super();
    }
}