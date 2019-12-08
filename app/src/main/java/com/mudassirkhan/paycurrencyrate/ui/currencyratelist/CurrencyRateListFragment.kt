package com.mudassirkhan.paycurrencyrate.ui.currencyratelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.mudassirkhan.paycurrencyrate.R
import com.mudassirkhan.paycurrencyrate.databinding.CurrencyRateListFragmentBinding
import com.mudassirkhan.paycurrencyrate.ui.adapter.CurrencyRateListAdapter
import com.mudassirkhan.paycurrencyrate.ui.model.Currency
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CurrencyRateListFragment : Fragment(), CurrencyRateListAdapter.Callbacks {

    companion object {
        fun newInstance() =
            CurrencyRateListFragment()
    }

    @Inject
    lateinit var viewModeFactory: ViewModelProvider.Factory
    private lateinit var viewModel: CurrencyRateListViewModel
   private lateinit var mBinding : CurrencyRateListFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
        viewModel=   ViewModelProviders.of(this, this.viewModeFactory).get(CurrencyRateListViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        mBinding = DataBindingUtil.inflate(inflater,R.layout.currency_rate_list_fragment, container, false)
        mBinding.viewModel = viewModel
        mBinding.callback = this
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(EngineerListViewModel::class.java)
//        viewModel.getCurrencyList()

        observeEvents()
    }

    fun observeEvents(){
        viewModel.loading.observe(this, Observer {
//            (activity as MainActivity).showLoading(it)
        })

        viewModel.amountValue.observe(this, Observer {
            it?.let {
                if (!it.isBlank() && it.toDouble() > 0.0) {
                    viewModel.calculateCurrenciesList(it.toDouble())
                }
            }
        })

    }

    override fun onItemClick(view: View, item: Currency) {
        Toast.makeText(activity!!, "you click on ${item.symbol}", Toast.LENGTH_SHORT).show()
        viewModel.clickedOnCurrency(item)
    }

}
