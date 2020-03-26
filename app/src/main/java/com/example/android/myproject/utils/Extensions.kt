package com.example.android.myproject.utils

import android.widget.EditText
import android.widget.TextView

fun CharSequence.minLength(): Boolean =
    length >= 3

fun TextView.getString() = text.toString().trim()

fun EditText.clearText() {
    text?.clear()
}