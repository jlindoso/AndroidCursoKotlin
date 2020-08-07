package com.example.agenda.model

import android.text.Editable



class Aluno(val nome: String,val telefone: String,val email: String){
    override fun toString(): String {
        return nome.capitalize()
    }
}


