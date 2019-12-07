package com.mudassirkhan.data.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/mudassirkhan/data/remote/api/CurrencyApiService;", "", "getCurrenciesRateList", "Lio/reactivex/Single;", "Lcom/mudassirkhan/data/remote/entities/CurrencyRateResponse;", "data_debug"})
public abstract interface CurrencyApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "live?access_key=c3e3d769904df94547dc93f09f9017fe")
    public abstract io.reactivex.Single<com.mudassirkhan.data.remote.entities.CurrencyRateResponse> getCurrenciesRateList();
}