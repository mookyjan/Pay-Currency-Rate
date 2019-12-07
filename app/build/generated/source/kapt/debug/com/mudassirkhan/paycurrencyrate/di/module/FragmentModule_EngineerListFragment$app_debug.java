package com.mudassirkhan.paycurrencyrate.di.module;

import com.mudassirkhan.paycurrencyrate.ui.currencyratelist.CurrencyRateListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentModule_EngineerListFragment$app_debug.CurrencyRateListFragmentSubcomponent.class
)
public abstract class FragmentModule_EngineerListFragment$app_debug {
  private FragmentModule_EngineerListFragment$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(CurrencyRateListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CurrencyRateListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface CurrencyRateListFragmentSubcomponent
      extends AndroidInjector<CurrencyRateListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CurrencyRateListFragment> {}
  }
}
