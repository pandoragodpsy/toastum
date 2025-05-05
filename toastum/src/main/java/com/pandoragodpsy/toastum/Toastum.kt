package com.pandoragodpsy.toastum

import android.content.Context
import android.widget.Toast

class Toastum private constructor() {

    companion object {
        val instance: Toastum by lazy {
            Toastum();
        }
    }

    fun showToastum(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}