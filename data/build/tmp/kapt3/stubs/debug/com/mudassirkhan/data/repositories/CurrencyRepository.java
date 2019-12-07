package com.mudassirkhan.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/mudassirkhan/data/repositories/CurrencyRepository;", "", "remoteDataSource", "Lcom/mudassirkhan/data/remote/RemoteDataSource;", "mapper", "Lcom/mudassirkhan/data/mapper/DataToDomainMapper;", "(Lcom/mudassirkhan/data/remote/RemoteDataSource;Lcom/mudassirkhan/data/mapper/DataToDomainMapper;)V", "getCurrencyRateList", "Lio/reactivex/Single;", "Lcom/mudassirkhan/data/remote/entities/CurrencyRateResponse;", "data_debug"})
public final class CurrencyRepository {
    private final com.mudassirkhan.data.remote.RemoteDataSource remoteDataSource = null;
    private final com.mudassirkhan.data.mapper.DataToDomainMapper mapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.mudassirkhan.data.remote.entities.CurrencyRateResponse> getCurrencyRateList() {
        return null;
    }
    
    public CurrencyRepository(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.data.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.mudassirkhan.data.mapper.DataToDomainMapper mapper) {
        super();
    }
}