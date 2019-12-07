package com.mudassirkhan.paycurrencyrate;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.mudassirkhan.paycurrencyrate.databinding.CurrencyRateListFragmentBindingImpl;
import com.mudassirkhan.paycurrencyrate.databinding.SingleCurrencyItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CURRENCYRATELISTFRAGMENT = 1;

  private static final int LAYOUT_SINGLECURRENCYITEM = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mudassirkhan.paycurrencyrate.R.layout.currency_rate_list_fragment, LAYOUT_CURRENCYRATELISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mudassirkhan.paycurrencyrate.R.layout.single_currency_item, LAYOUT_SINGLECURRENCYITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CURRENCYRATELISTFRAGMENT: {
          if ("layout/currency_rate_list_fragment_0".equals(tag)) {
            return new CurrencyRateListFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for currency_rate_list_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLECURRENCYITEM: {
          if ("layout/single_currency_item_0".equals(tag)) {
            return new SingleCurrencyItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_currency_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
      sKeys.put(2, "currency");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(2);

    static {
      sKeys.put("layout/currency_rate_list_fragment_0", com.mudassirkhan.paycurrencyrate.R.layout.currency_rate_list_fragment);
      sKeys.put("layout/single_currency_item_0", com.mudassirkhan.paycurrencyrate.R.layout.single_currency_item);
    }
  }
}
