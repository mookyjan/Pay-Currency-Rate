// Generated by Dagger (https://dagger.dev).
package com.mudassirkhan.paycurrencyrate.di.module;

import com.mudassirkhan.domain.Schedulers;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSchedulers$app_debugFactory implements Factory<Schedulers> {
  private final AppModule module;

  public AppModule_ProvideSchedulers$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Schedulers get() {
    return provideSchedulers$app_debug(module);
  }

  public static AppModule_ProvideSchedulers$app_debugFactory create(AppModule module) {
    return new AppModule_ProvideSchedulers$app_debugFactory(module);
  }

  public static Schedulers provideSchedulers$app_debug(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideSchedulers$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
