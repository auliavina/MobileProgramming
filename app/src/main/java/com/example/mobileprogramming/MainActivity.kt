package com.example.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // deklarasi variable
    private lateinit var inputPanjang: EditText
    private lateinit var inputLebar: EditText
    private lateinit var inputTinggi: EditText
    private lateinit var btn: Button
    private lateinit var hasil: TextView

    companion object{
        private const val STATE_RESULT ="state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi variable
        inputPanjang = findViewById(R.id.edit_panjang)
        inputLebar = findViewById(R.id.edit_lebar)
        inputTinggi = findViewById(R.id.edit_tinggi)
        btn = findViewById(R.id.hasil)
        hasil = findViewById(R.id.hasil)
        btn.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if (v?.id==R.id.btn_hasil){
            var tinggi = inputTinggi.text.toString().trim()
            var panjang = inputPanjang.text.toString().trim()
            var lebar = inputLebar.text.toString().trim()
            var volume = tinggi.toDouble() * panjang.toDouble() * lebar.toDouble()
            hasil.text = volume.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT,hasil.text.toString())
    }

}