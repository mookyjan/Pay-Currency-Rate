package com.mudassirkhan.paycurrencyrate

import android.app.Application
import com.github.ajalt.timberkt.Timber
import com.mudassirkhan.paycurrencyrate.di.component.AppComponent
import com.mudassirkhan.paycurrencyrate.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

open class PayCurrencyRateApp :Application(),HasAndroidInjector {

    @Inject
    lateinit var activityDispatcher: DispatchingAndroidInjector<Any>
    lateinit var component : AppComponent

    override fun androidInjector(): AndroidInjector<Any> {
        return  activityDispatcher
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
//        ProcessLifecycleOwner.get().lifecycle.addObserver(this);
       component = DaggerAppComponent
            .builder()
            .application(this)
            .context(this)
            .build()
       component.inject(this)
    }

//    http://www.apilayer.net/api/live?access_key=c3e3d769904df94547dc93f09f9017fe
}