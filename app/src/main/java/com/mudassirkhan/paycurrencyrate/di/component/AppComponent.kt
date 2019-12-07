package com.mudassirkhan.paycurrencyrate.di.component

import android.app.Application
import android.content.Context
import com.mudassirkhan.paycurrencyrate.PayCurrencyRateApp
import com.mudassirkhan.paycurrencyrate.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
    AppModule::class,
    AndroidInjectionModule::class,
    ViewModelFactoryModule::class,
    FragmentModule::class,
    NetworkModule::class,
    DataModule::class,
    DomainModule::class
))
interface AppComponent {

    fun inject(application: PayCurrencyRateApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}