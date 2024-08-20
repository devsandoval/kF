package com.cesarsandovaldev.kf.bootcamp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.cesarsandovaldev.kf.R

class jsonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_json)

        val recurso : JSONArray = JSONArray(resources.openRawResource(R.raw.datos).bufferedReader().use { it.readText() })
        val elemento : JSONObject = JSONObject(recurso.get(0).toString())
        print(elemento.get("tarea"))
        println(recurso.get(0))
    }
}