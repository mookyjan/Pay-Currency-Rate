// Generated by Dagger (https://dagger.dev).
package com.mudassirkhan.paycurrencyrate.di.module;

import com.mudassirkhan.data.remote.RemoteDataSource;
import com.mudassirkhan.data.repositories.CurrencyRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvideCurrencyRateRepository$app_debugFactory implements Factory<CurrencyRepository> {
  private final DataModule module;

  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  public DataModule_ProvideCurrencyRateRepository$app_debugFactory(DataModule module,
      Provider<RemoteDataSource> remoteDataSourceProvider) {
    this.module = module;
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public CurrencyRepository get() {
    return provideCurrencyRateRepository$app_debug(module, remoteDataSourceProvider.get());
  }

  public static DataModule_ProvideCurrencyRateRepository$app_debugFactory create(DataModule module,
      Provider<RemoteDataSource> remoteDataSourceProvider) {
    return new DataModule_ProvideCurrencyRateRepository$app_debugFactory(module, remoteDataSourceProvider);
  }

  public static CurrencyRepository provideCurrencyRateRepository$app_debug(DataModule instance,
      RemoteDataSource remoteDataSource) {
    return Preconditions.checkNotNull(instance.provideCurrencyRateRepository$app_debug(remoteDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
