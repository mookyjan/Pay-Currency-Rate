package com.mudassirkhan.paycurrencyrate.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/mudassirkhan/paycurrencyrate/di/module/NetworkModule;", "", "()V", "getHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getHttpLoggingInterceptor$app_debug", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideOkHttpClient$app_debug", "provideWheelAPI", "Lcom/mudassirkhan/data/remote/api/CurrencyApiService;", "okHttpClient", "provideWheelAPI$app_debug", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mudassirkhan.data.remote.api.CurrencyApiService provideWheelAPI$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor getHttpLoggingInterceptor$app_debug() {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}