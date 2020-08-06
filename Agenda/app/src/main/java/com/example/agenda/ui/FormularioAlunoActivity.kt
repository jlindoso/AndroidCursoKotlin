package com.example.agenda.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agenda.R

class FormularioAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Novo Aluno")
        setContentView(R.layout.activity_formulario_aluno)
    }
}