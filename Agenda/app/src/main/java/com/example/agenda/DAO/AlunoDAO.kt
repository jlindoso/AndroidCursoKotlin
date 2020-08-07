package com.example.agenda.DAO

import com.example.agenda.model.Aluno


class AlunoDAO {

    companion object {
        val repoAluno = mutableListOf<Aluno>()
        fun getDados() = repoAluno
    }

    fun salvar(aluno: Aluno) {
        repoAluno.add(aluno)
    }




}
