package com.mudassirkhan.paycurrencyrate.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mudassirkhan.paycurrencyrate.ui.currencyratelist.CurrencyRateListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory):
            ViewModelProvider.Factory


    @Binds
    @IntoMap
    @ViewModelKey(CurrencyRateListViewModel::class)
    internal abstract fun provideEngineerListViewModel(viewModel: CurrencyRateListViewModel): ViewModel


}