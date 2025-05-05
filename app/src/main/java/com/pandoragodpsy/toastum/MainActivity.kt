package com.pandoragodpsy.toastum

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pandoragodpsy.toastum.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root);
        }

        init();
    }

    private fun init() {
        binding.btnShowToast.setOnClickListener {
            Toastum.instance.showToastum(this, "Toastum");
        }
    }
}