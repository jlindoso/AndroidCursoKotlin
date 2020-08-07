package com.example.agenda.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.agenda.R
import com.example.agenda.model.Aluno
import kotlinx.android.synthetic.main.activity_formulario_aluno.*

class FormularioAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Novo Aluno")
        setContentView(R.layout.activity_formulario_aluno)

        activity_formulario_aluno_botao_salvar.setOnClickListener(View.OnClickListener {
            var nome = activity_formulario_aluno_nome.text
            var telefone = activity_formulario_aluno_telefone.text
            var email = activity_formulario_aluno_email.text

            var aluno = Aluno(nome.toString().capitalize(), telefone.toString(), email.toString())

            Toast.makeText(this, "Aluno ${aluno.nome}  ${aluno.telefone} ${aluno.email} Salvo com sucesso!", Toast.LENGTH_SHORT).show()
        })

    }
}