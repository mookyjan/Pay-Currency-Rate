package com.mudassirkhan.paycurrencyrate.ui.currencyratelist

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.ajalt.timberkt.Timber
import com.mudassirkhan.domain.entity.Quotes
import com.mudassirkhan.domain.interactor.GetCurrencyRateListUseCase
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class CurrencyRateListViewModel @Inject constructor(private val currencyRateListUseCase: GetCurrencyRateListUseCase
                                               ) : ViewModel() {

     var currencyList = ObservableArrayList<Quotes>()

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()
    val loading = MutableLiveData<Boolean>()
    val error = ObservableField<String>()
    val empty = ObservableBoolean()

    fun getCurrencyRateList(){
        loading.value = true
        currencyRateListUseCase.execute(object : DisposableSingleObserver<List<Quotes>>(){

            override fun onError(e: Throwable) {
                Timber.e { "currency api error $e" }
                loading.value=false
                error.set(e.localizedMessage ?: e.message ?: "Unkown error")
            }

            override fun onSuccess(t: List<Quotes>) {
                Timber.d { "currency list api response success $t" }
                loading.postValue(false)
                currencyList.clear()
                t.let {
                    currencyList.addAll(t)
                }
//                empty.set(t.isEmpty())
            }

        })
//            .subscribeBy(onSuccess = {
//
//            },onError = {
//
//            }).addTo(compositeDisposable)
    }
}
