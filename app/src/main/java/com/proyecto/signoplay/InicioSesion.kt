package com.proyecto.signoplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class InicioSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSiguiente = findViewById<Button>(R.id.btn_siguiente)
        val ptUsuario = findViewById<EditText>(R.id.edit_usuario)
        val ptContrasenia = findViewById<EditText>(R.id.edit_contrasenia)

        btnSiguiente.setOnClickListener{
            val usuario = ptUsuario.text.toString()
            val contrasenia = ptContrasenia.text.toString()

            if (usuario == "usuario"){
                if (contrasenia == "123456"){
                    val intent = Intent(this, VerProgreso::class.java)
                    intent.putExtra("usuario", usuario)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Contraseña Incorrecta", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}