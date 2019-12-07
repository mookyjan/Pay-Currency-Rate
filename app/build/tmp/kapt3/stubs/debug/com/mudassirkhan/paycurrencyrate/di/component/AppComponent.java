package com.mudassirkhan.paycurrencyrate.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/mudassirkhan/paycurrencyrate/di/component/AppComponent;", "", "inject", "", "application", "Lcom/mudassirkhan/paycurrencyrate/PayCurrencyRateApp;", "Builder", "app_debug"})
@dagger.Component(modules = {com.mudassirkhan.paycurrencyrate.di.module.AppModule.class, dagger.android.AndroidInjectionModule.class, com.mudassirkhan.paycurrencyrate.di.module.ViewModelFactoryModule.class, com.mudassirkhan.paycurrencyrate.di.module.FragmentModule.class, com.mudassirkhan.paycurrencyrate.di.module.NetworkModule.class, com.mudassirkhan.paycurrencyrate.di.module.DataModule.class, com.mudassirkhan.paycurrencyrate.di.module.DomainModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.paycurrencyrate.PayCurrencyRateApp application);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/mudassirkhan/paycurrencyrate/di/component/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/mudassirkhan/paycurrencyrate/di/component/AppComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.mudassirkhan.paycurrencyrate.di.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.mudassirkhan.paycurrencyrate.di.component.AppComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.mudassirkhan.paycurrencyrate.di.component.AppComponent build();
    }
}