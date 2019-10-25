package com.example.ceknilai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ETnim: EditText = findViewById(R.id.ETNim)
        val ETnama: EditText = findViewById(R.id.ETNama)
        val ETnilai: EditText = findViewById(R.id.ETNilai)

        BProses.setOnClickListener(){
            intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Nim", ETnim.getText().toString())
            intent.putExtra("Nama", ETnama.getText().toString())
            intent.putExtra("Nilai", ETnilai.getText().toString())
            startActivity(intent)
        }
    }
}
