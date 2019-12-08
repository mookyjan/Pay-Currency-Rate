package com.mudassirkhan.paycurrencyrate.util

import android.widget.EditText
import androidx.databinding.BindingAdapter

@BindingAdapter("android:text")
fun setText(view: EditText, text: String?) {
    if (text != null && !text.equals(view.text)) {
        view.setText(text)
    }
}