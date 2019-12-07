package com.mudassirkhan.paycurrencyrate.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/mudassirkhan/paycurrencyrate/di/module/DataModule;", "", "()V", "provideCurrencyRateGateway", "Lcom/mudassirkhan/domain/gateway/CurrencyRateGateway;", "currencyRepository", "Lcom/mudassirkhan/data/repositories/CurrencyRepository;", "provideCurrencyRateGateway$app_debug", "provideCurrencyRateRepository", "remoteDataSource", "Lcom/mudassirkhan/data/remote/RemoteDataSource;", "provideCurrencyRateRepository$app_debug", "provideRemoteDataSource", "currencyApiService", "Lcom/mudassirkhan/data/remote/api/CurrencyApiService;", "provideRemoteDataSource$app_debug", "app_debug"})
@dagger.Module()
public final class DataModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mudassirkhan.data.remote.RemoteDataSource provideRemoteDataSource$app_debug(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.data.remote.api.CurrencyApiService currencyApiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mudassirkhan.data.repositories.CurrencyRepository provideCurrencyRateRepository$app_debug(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.data.remote.RemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mudassirkhan.domain.gateway.CurrencyRateGateway provideCurrencyRateGateway$app_debug(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.data.repositories.CurrencyRepository currencyRepository) {
        return null;
    }
    
    public DataModule() {
        super();
    }
}