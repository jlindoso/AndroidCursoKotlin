package com.example.agenda

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity: Activity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //request api

        var alunos = mutableListOf<String>("Jorge Adriano Lindoso", "Anderson Felipe", "Bruno Ananias")


        var listaAlunos = findViewById<ListView>(R.id.activity_main_lista_alunos)

        var adapterAlunos = ArrayAdapter<String>(this,  android.R.layout.simple_expandable_list_item_1, alunos)
        
        listaAlunos.adapter = adapterAlunos


    }

}