package com.mudassirkhan.paycurrencyrate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/mudassirkhan/paycurrencyrate/PayCurrencyRateApp;", "Landroid/app/Application;", "Ldagger/android/HasAndroidInjector;", "()V", "activityDispatcher", "Ldagger/android/DispatchingAndroidInjector;", "", "getActivityDispatcher", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityDispatcher", "(Ldagger/android/DispatchingAndroidInjector;)V", "component", "Lcom/mudassirkhan/paycurrencyrate/di/component/AppComponent;", "getComponent", "()Lcom/mudassirkhan/paycurrencyrate/di/component/AppComponent;", "setComponent", "(Lcom/mudassirkhan/paycurrencyrate/di/component/AppComponent;)V", "androidInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "app_debug"})
public class PayCurrencyRateApp extends android.app.Application implements dagger.android.HasAndroidInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> activityDispatcher;
    @org.jetbrains.annotations.NotNull()
    public com.mudassirkhan.paycurrencyrate.di.component.AppComponent component;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getActivityDispatcher() {
        return null;
    }
    
    public final void setActivityDispatcher(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mudassirkhan.paycurrencyrate.di.component.AppComponent getComponent() {
        return null;
    }
    
    public final void setComponent(@org.jetbrains.annotations.NotNull()
    com.mudassirkhan.paycurrencyrate.di.component.AppComponent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public PayCurrencyRateApp() {
        super();
    }
}