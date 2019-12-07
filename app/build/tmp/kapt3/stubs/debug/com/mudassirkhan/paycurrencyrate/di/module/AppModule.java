package com.mudassirkhan.paycurrencyrate.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/mudassirkhan/paycurrencyrate/di/module/AppModule;", "", "()V", "provideSchedulers", "Lcom/mudassirkhan/domain/Schedulers;", "provideSchedulers$app_debug", "providesContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "providesContext$app_debug", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context providesContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mudassirkhan.domain.Schedulers provideSchedulers$app_debug() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}