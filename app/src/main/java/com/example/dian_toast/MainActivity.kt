package com.example.dian_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Aplikasi Berjalan",Toast.LENGTH_SHORT).show()

        val nama=findViewById<Button>(R.id.nama)
        val kelas=findViewById<Button>(R.id.kelas)
        val NIS=findViewById<Button>(R.id.NIS)


        nama.setOnClickListener {
            Toast.makeText(this, "Dian Pratiwi", Toast.LENGTH_SHORT).show()
        }
        kelas.setOnClickListener {
            Toast.makeText(this, "XI PPLG 2", Toast.LENGTH_SHORT).show()
        }
        NIS.setOnClickListener {
            Toast.makeText(this, "2233283", Toast.LENGTH_SHORT).show()
        }
    }
}