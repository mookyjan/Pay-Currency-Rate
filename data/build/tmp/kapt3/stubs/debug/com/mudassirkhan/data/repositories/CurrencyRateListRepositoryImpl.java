package com.mudassirkhan.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/mudassirkhan/data/repositories/CurrencyRateListRepositoryImpl;", "Lcom/mudassirkhan/domain/gateway/CurrencyRateGateway;", "currencyRepository", "Lcom/mudassirkhan/data/repositories/CurrencyRepository;", "(Lcom/mudassirkhan/data/repositories/CurrencyRepository;)V", "mapperEngineer", "Lcom/mudassirkhan/data/mapper/DataToDomainMapper;", "getCurrencyRateList", "Lio/reactivex/Single;", "", "Lcom/mudassirkhan/domain/entity/Quotes;", "data_debug"})
public final class CurrencyRateListRepositoryImpl implements com.mudassirkhan.domain.gateway.CurrencyRateGateway {
    private final com.mudassirkhan.data.mapper.DataToDomainMapper mapperEngineer = null;
    private final com.mudassirkhan.data.repositories.CurrencyRepository currencyRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.mudassirkhan.domain.entity.Quotes>> getCurrencyRateList() {
        return null;
    }
    
    public CurrencyRateListRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.data.repositories.CurrencyRepository currencyRepository) {
        super();
    }
}