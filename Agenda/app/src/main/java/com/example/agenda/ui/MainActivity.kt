package com.example.agenda.ui

import android.annotation.SuppressLint
import android.content.Intent

import android.os.Bundle
import android.view.View

import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.agenda.DAO.AlunoDAO
import com.example.agenda.R
import com.example.agenda.model.Aluno
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Lista de Alunos")
        setContentView(R.layout.activity_main)

        var alunos = AlunoDAO.getDados()




        var adapterAlunos = ArrayAdapter<Aluno>(this,  android.R.layout.simple_expandable_list_item_1, alunos)

        activity_main_lista_alunos.adapter = adapterAlunos


        activity_main_fab_novo_aluno.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, FormularioAlunoActivity::class.java))
        })


    }

}