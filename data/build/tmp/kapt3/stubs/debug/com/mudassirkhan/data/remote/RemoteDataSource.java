package com.mudassirkhan.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/mudassirkhan/data/remote/RemoteDataSource;", "", "apiService", "Lcom/mudassirkhan/data/remote/api/CurrencyApiService;", "(Lcom/mudassirkhan/data/remote/api/CurrencyApiService;)V", "getCurrencyRateList", "Lio/reactivex/Single;", "Lcom/mudassirkhan/data/remote/entities/CurrencyRateResponse;", "data_debug"})
public final class RemoteDataSource {
    private final com.mudassirkhan.data.remote.api.CurrencyApiService apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.mudassirkhan.data.remote.entities.CurrencyRateResponse> getCurrencyRateList() {
        return null;
    }
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.data.remote.api.CurrencyApiService apiService) {
        super();
    }
}