package com.example.agenda.ui

import android.annotation.SuppressLint

import android.os.Bundle

import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.agenda.R

class MainActivity: AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Lista de Alunos")
        setContentView(R.layout.activity_main)

        var alunos = mutableListOf<String>("Jorge Adriano Lindoso", "Anderson Felipe", "Bruno Ananias")


        var listaAlunos = findViewById<ListView>(R.id.activity_main_lista_alunos)

        var adapterAlunos = ArrayAdapter<String>(this,  android.R.layout.simple_expandable_list_item_1, alunos)
        
        listaAlunos.adapter = adapterAlunos


    }

}