package com.cesarsandovaldev.kf

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth


class firebaseActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_firebase)
        auth = Firebase.auth

        //autentica un usuario
        var username: String = "cesar@sandoval.com"
        var password: String = "12345678"
        auth.signInWithEmailAndPassword(username,password).addOnCompleteListener(this) {
            task ->
            if(task.isSuccessful){
                Toast.makeText(this, "ingreso exitoso", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "ingreso fallido", Toast.LENGTH_SHORT).show()
            }
        }

        //crea un usuario
        auth.createUserWithEmailAndPassword("abril@abril.com", "12345678").addOnCompleteListener(this){
                task ->
            if(task.isSuccessful){
                Toast.makeText(this, "Creacion exitosa", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Creacion fallida", Toast.LENGTH_SHORT).show()
            }
        }

    }

}
