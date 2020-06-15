package com.example.primeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Chamando a outra tela pelo botao.
        val btnReaisPontos = findViewById<Button>(R.id.btnPontosReais)
            btnReaisPontos.setOnClickListener{
                val intent = Intent(this, Pontos_Reais::class.java)
                startActivity(intent)

                
            }
    }
}

