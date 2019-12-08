package com.mudassirkhan.paycurrencyrate.ui.currencyratelist

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.ajalt.timberkt.Timber
import com.mudassirkhan.domain.entity.CurrencyListEntity
import com.mudassirkhan.domain.entity.Quotes
import com.mudassirkhan.domain.interactor.GetCurrencyListUseCase
import com.mudassirkhan.domain.interactor.GetCurrencyRateListUseCase
import com.mudassirkhan.paycurrencyrate.ui.DomainToPresentationMapper
import com.mudassirkhan.paycurrencyrate.ui.model.Currency
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class CurrencyRateListViewModel @Inject constructor(
    private val currencyListUseCase: GetCurrencyListUseCase,
    private val currencyRateListUseCase: GetCurrencyRateListUseCase
                                               ) : ViewModel() {

    var currencyRateList = ObservableArrayList<Currency>()

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()
    val loading = MutableLiveData<Boolean>()
    val error = ObservableField<String>()
    val empty = ObservableBoolean()
    var amountValue = MutableLiveData<String>()
    private var currentBase: String = ""
    private var defaultSource: Currency
    private lateinit var viewModelReference: List<Currency>
    private lateinit var listDataForCalculation: List<Currency>
    private val _source = MutableLiveData<Currency>()
    val source: LiveData<Currency> = _source
    val mapper = DomainToPresentationMapper()

    init {

        defaultSource = Currency("USD", 0.0, "United States Dollar")
        amountValue.value = defaultSource.exchangeRate!!.toString()
        getCurrencyList()
    }

    fun getCurrencyList() {
        loading.value = true
        currencyListUseCase.execute(object : DisposableSingleObserver<List<CurrencyListEntity>>() {
            override fun onSuccess(t: List<CurrencyListEntity>) {
                Timber.d { "currency list api response success $t" }
                loading.postValue(false)
                getCurrencyRateList()
            }

            override fun onError(e: Throwable) {
                Timber.e { "currency api error $e" }
                loading.value = false
                error.set(e.localizedMessage ?: e.message ?: "Unkown error")
            }

        })
    }

    fun getCurrencyRateList() {
        loading.value = true
        currencyRateListUseCase.execute(object : DisposableSingleObserver<List<Quotes>>() {

            override fun onError(e: Throwable) {
                Timber.e { "currency rate api error $e" }
                loading.value = false
                error.set(e.localizedMessage ?: e.message ?: "Unkown error")
            }

            override fun onSuccess(t: List<Quotes>) {
                Timber.d { "currency rate list api response success $t" }
                loading.postValue(false)
                currencyRateList.clear()
                t.let {
                    currencyRateList.addAll(mapper.mapDataToPresentationQuotes(it))
                }

                setDataInsideViewModel(mapper.mapDataToPresentationQuotes(t))
//                empty.set(t.isEmpty())
            }

        })
//            .subscribeBy(onSuccess = {
//
//            },onError = {
//
//            }).addTo(compositeDisposable)
    }


    fun clickedOnCurrency(selectedCurrency: Currency) {

        val symbol = selectedCurrency.symbol
        val currency = viewModelReference.first {
            it.symbol == symbol
        }
        defaultSource = currency
        val divider = currency.exchangeRate
        amountValue.value = divider?.let { currency.exchangeRate!!.div(it).toString() }
        _source.value = currency
//        currencyRateList.value =
//            divider?.let { viewModelReference.asCalculatedCurrenciesList(divider = it) }

        currencyRateList.addAll(
            divider?.let { viewModelReference.asCalculatedCurrenciesList(divider = it) }!!
        )

        listDataForCalculation = currencyRateList.toList()!!
    }


    fun List<Currency>.asCalculatedCurrenciesList(divider: Double): List<Currency> {
        return map {
            Currency(
                symbol = it.symbol,
                exchangeRate = it.exchangeRate?.div(divider),
                unit = it.unit
            )
        }
    }

    fun List<Currency>.asTimesCurrenciesList(times: Double): List<Currency> {
        return map {
            Currency(
                symbol = it.symbol,
                exchangeRate = it.exchangeRate?.times(times),
                unit = it.unit
            )
        }
    }


    fun calculateCurrenciesList(times: Double) {
        currencyRateList.addAll(listDataForCalculation.asTimesCurrenciesList(times).toList())
    }


    fun setDataInsideViewModel(list: List<Currency>) {
        _source.value = defaultSource
        currencyRateList.addAll(list)
        viewModelReference = list
        listDataForCalculation = list
    }
}
