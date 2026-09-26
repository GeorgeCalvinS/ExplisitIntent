package com.example.explisitintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    companion object {
        const val dataTerima = "extra_dataTerima"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val data = intent.getStringExtra(dataTerima)
        val _showData = findViewById<TextView>(R.id.showData)

        _showData.text = data?.toString()
    }
}
