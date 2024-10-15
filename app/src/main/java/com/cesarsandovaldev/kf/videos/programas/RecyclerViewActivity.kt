 package com.cesarsandovaldev.kf.videos.programas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cesarsandovaldev.kf.R
import com.cesarsandovaldev.kf.clases.CustomAdapter
import com.cesarsandovaldev.kf.dataclases.Item

 class RecyclerViewActivity : AppCompatActivity() {

     private lateinit var recyclerView: RecyclerView
     private lateinit var adapter: CustomAdapter

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         supportActionBar?.hide()
         setContentView(R.layout.activity_recycler_view)

         recyclerView = findViewById(R.id.recyclerView)

         // Preparar los datos
         val items = listOf(
             Item(1, "Item 1", "Este es el primer item"),
             Item(2, "Item 2", "Este es el segundo item"),
             Item(3, "Item 3", "Este es el tercer item"),
             Item(4, "Item 4", "Este es el primer item"),
             Item(5, "Item 5", "Este es el segundo item"),
             Item(6, "Item 6", "Este es el tercer item"),
             Item(7, "Item 7", "Este es el primer item"),
             Item(8, "Item 8", "Este es el segundo item"),
             Item(9, "Item 9", "Este es el tercer item"),
             Item(10, "Item 10", "Este es el primer item"),
             Item(11, "Item 11", "Este es el segundo item"),
             Item(12, "Item 12", "Este es el tercer item"),
             Item(13, "Item 13", "Este es el primer item"),
             Item(14, "Item 14", "Este es el segundo item"),
             Item(15, "Item 15", "Este es el tercer item"),
             Item(16, "Item 16", "Este es el primer item"),
             Item(17, "Item 17", "Este es el segundo item"),
             Item(18, "Item 18", "Este es el tercer item"),
             Item(19, "Item 19", "Este es el primer item"),
             Item(20, "Item 20", "Este es el segundo item"),
             Item(21, "Item 21", "Este es el tercer item"),
             Item(22, "Item 22", "Este es el primer item"),
             Item(23, "Item 23", "Este es el segundo item"),
             Item(24, "Item 24", "Este es el tercer item")
         )

         // Configurar el adaptador
         adapter = CustomAdapter(items)
         recyclerView.adapter = adapter
         recyclerView.layoutManager = LinearLayoutManager(this)
     }
 }
