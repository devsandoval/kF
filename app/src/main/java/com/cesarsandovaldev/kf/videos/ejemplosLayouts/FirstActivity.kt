package com.cesarsandoval.app_para_pruebas.firstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.cesarsandoval.app_para_pruebas.R

class FirstActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)
        val b1 = findViewById<AppCompatButton>(R.id.btn1)
        b1.setOnClickListener{
            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
        }
    }
}