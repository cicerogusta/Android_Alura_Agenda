package com.ciceropinheiro.agenda.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ciceropinheiro.agenda.R
import com.ciceropinheiro.agenda.databinding.ActivityListaAlunosBinding
import com.ciceropinheiro.agenda.util.UtilActivity

class ListaAlunosActivity : UtilActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)
        val binding = DataBindingUtil
            .setContentView<ActivityListaAlunosBinding>( this, R.layout.activity_lista_alunos)


       setListView(binding.listaDeAlunos)

    }

}