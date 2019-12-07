package com.mudassirkhan.domain

import com.mudassirkhan.domain.entity.Quotes
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.disposables.Disposables
import io.reactivex.observers.DefaultObserver
import io.reactivex.observers.DisposableSingleObserver

/**
 * A base class for an use case that will be executed by presentation layer
 */
abstract class UseCase<T> internal constructor(private val schedulers: Schedulers) {

    internal abstract fun buildObservable(): Single<T>

    private val disposables: CompositeDisposable

    protected var disposable = Disposables.empty()

    init {
        this.disposables = CompositeDisposable()
    }

    fun execute(observer: DisposableSingleObserver<T>) {
        val observable = this.buildObservable()
            .subscribeOn(schedulers.subscribeOn)
            // Unfortunately RxJava had a bug that if any Exceptions were being thrown later
            // in the stream they would incorrectly cut ahead of the successful emissions
            // and break the flow.
            // In order to fix this, an overload was added in version 1.1.1
            // for observeOn(Scheduler scheduler, boolean delayError)
            // in order to signal the Scheduler to respect the delaying of errors.
            // https://medium.com/yammer-engineering/chaining-multiple-sources-with-rxjava-20eb6850e5d9
            .observeOn(schedulers.observeOn)
        addDisposable(observable.subscribeWith(observer))

    }

    /**
     * Dispose from current [CompositeDisposable].
     */
    fun dispose() {
        if (!disposables.isDisposed) {
            disposables.dispose()
        }
    }

    /**
     * Dispose from current [CompositeDisposable].
     */
    private fun addDisposable(disposable: Disposable?) {
        if (disposable != null)
            disposables.add(disposable)
    }
}