package com.mudassirkhan.paycurrencyrate.databinding;
import com.mudassirkhan.paycurrencyrate.R;
import com.mudassirkhan.paycurrencyrate.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleCurrencyItemBindingImpl extends SingleCurrencyItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleCurrencyItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private SingleCurrencyItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        this.txtName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.currency == variableId) {
            setCurrency((com.mudassirkhan.domain.entity.Quotes) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCurrency(@Nullable com.mudassirkhan.domain.entity.Quotes Currency) {
        this.mCurrency = Currency;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.currency);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String currencySymbol = null;
        float currencyRate = 0f;
        com.mudassirkhan.domain.entity.Quotes currency = mCurrency;
        java.lang.String currencySymbolJavaLangString = null;
        java.lang.String currencyRateJavaLangString = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (currency != null) {
                    // read currency.symbol
                    currencySymbol = currency.getSymbol();
                    // read currency.rate
                    currencyRate = currency.getRate();
                }


                // read (currency.symbol) + ("")
                currencySymbolJavaLangString = (currencySymbol) + ("");
                // read (currency.rate) + ("")
                currencyRateJavaLangString = (currencyRate) + ("");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, currencyRateJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtName, currencySymbolJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): currency
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}