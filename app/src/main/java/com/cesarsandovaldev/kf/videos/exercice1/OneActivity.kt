package com.cesarsandovaldev.kf.videos.exercice1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cesarsandovaldev.kf.R

class OneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_one)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //declar componentes
        val edText1 = findViewById<EditText>(R.id.edText)
        val btnEnviar1 = findViewById<Button>(R.id.btnEnviar)

        //accion enviar
        btnEnviar1.setOnClickListener {
            val capture = edText1.text.toString()
            if (capture.isNotEmpty()){
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("PASO", capture)
                startActivity(intent)
            }
        }

    }
}