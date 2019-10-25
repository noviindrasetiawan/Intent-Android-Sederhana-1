package com.example.ceknilai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val TVnim2: TextView = findViewById(R.id.tvnim)
        val TVnama2: TextView = findViewById(R.id.tvnama)
        val TVnilai2: TextView = findViewById(R.id.tvnilai)
        val TVketerangan: TextView = findViewById(R.id.tvketerangan)

        TVnim2.setText(intent.getStringExtra("Nim"))
        TVnama2.setText(intent.getStringExtra("Nama"))
        TVnilai2.setText(intent.getStringExtra("Nilai"))

        val nilai: Int = (intent.getStringExtra("Nilai").toInt())

        if (nilai <= 100 && nilai >= 80){
            TVketerangan.setText("A")
        } else if (nilai < 80 && nilai >= 60){
            TVketerangan.setText("B")
        } else if (nilai < 60 && nilai >= 40){
            TVketerangan.setText("C")
        } else if (nilai < 40 && nilai >= 20){
            TVketerangan.setText("D")
        } else if (nilai < 20 && nilai >= 0){
            TVketerangan.setText("E")
        }else {
            TVketerangan.setText("Nilai Yang Anda Masukkan Salah")
        }

        BKembali.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
