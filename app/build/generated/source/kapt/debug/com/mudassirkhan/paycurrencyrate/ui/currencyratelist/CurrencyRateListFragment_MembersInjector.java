// Generated by Dagger (https://dagger.dev).
package com.mudassirkhan.paycurrencyrate.ui.currencyratelist;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyRateListFragment_MembersInjector implements MembersInjector<CurrencyRateListFragment> {
  private final Provider<ViewModelProvider.Factory> viewModeFactoryProvider;

  public CurrencyRateListFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModeFactoryProvider) {
    this.viewModeFactoryProvider = viewModeFactoryProvider;
  }

  public static MembersInjector<CurrencyRateListFragment> create(
      Provider<ViewModelProvider.Factory> viewModeFactoryProvider) {
    return new CurrencyRateListFragment_MembersInjector(viewModeFactoryProvider);}

  @Override
  public void injectMembers(CurrencyRateListFragment instance) {
    injectViewModeFactory(instance, viewModeFactoryProvider.get());
  }

  public static void injectViewModeFactory(CurrencyRateListFragment instance,
      ViewModelProvider.Factory viewModeFactory) {
    instance.viewModeFactory = viewModeFactory;
  }
}
