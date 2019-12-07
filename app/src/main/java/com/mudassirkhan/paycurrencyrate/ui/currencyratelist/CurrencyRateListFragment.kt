package com.mudassirkhan.paycurrencyrate.ui.currencyratelist

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import com.mudassirkhan.paycurrencyrate.R
import com.mudassirkhan.paycurrencyrate.databinding.CurrencyRateListFragmentBinding
import com.mudassirkhan.paycurrencyrate.databinding.CurrencyRateListFragmentBindingImpl
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CurrencyRateListFragment : Fragment() {

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

        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(EngineerListViewModel::class.java)
        viewModel.getCurrencyRateList()
        observeEvents()
    }

    fun observeEvents(){
        viewModel.loading.observe(this, Observer {
//            (activity as MainActivity).showLoading(it)
        })
    }

}
