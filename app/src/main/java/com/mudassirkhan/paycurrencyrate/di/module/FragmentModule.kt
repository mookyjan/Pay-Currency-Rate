package com.mudassirkhan.paycurrencyrate.di.module

import com.mudassirkhan.paycurrencyrate.ui.currencyratelist.CurrencyRateListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    internal abstract fun engineerListFragment(): CurrencyRateListFragment


}