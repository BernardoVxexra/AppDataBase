package com.example.databaseapp.ViewModel

import com.example.databaseapp.roomDB.Pessoa
import com.example.databaseapp.roomDB.PessoaDataBase

class Repository(private val db : PessoaDataBase) {
    suspend fun upsertPessoa(pessoa: Pessoa) {
        db.pessoaDao().upsertPessoa(Pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa) {
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoa() = db.pessoaDao().getAllPessoa()
}