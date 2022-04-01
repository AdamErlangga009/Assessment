package org.d3if4033.hitungbalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import org.d3if4033.hitungbalok.databinding.ActivityMainBinding
import android.util.Log
import android.widget.Button
import android.util.TimeUtils
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener{Hasil()}
    }
    private fun Hasil(){
        //Log.d("MainActivity","Tombol diklik")
        val panjang = binding.editPanjang.text.toString()
        if(TextUtils.isEmpty(panjang)){
            Toast.makeText(this, R.string.panjang_kosong, Toast.LENGTH_LONG).show()
            return
        }

        val lebar = binding.editLebar.text.toString()
        if(TextUtils.isEmpty(lebar)){
            Toast.makeText(this, R.string.lebar_kosong, Toast.LENGTH_LONG).show()
            return
        }

        val tinggi = binding.editTinggi.text.toString()
        if(TextUtils.isEmpty(tinggi)){
            Toast.makeText(this, R.string.tinggi_kosong, Toast.LENGTH_LONG).show()
            return
        }

        val hasil = panjang.toFloat() * lebar.toFloat() * tinggi.toFloat()


        binding.hasil.text = getString(R.string.jadi, hasil)
    }
}