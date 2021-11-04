package com.ciceropinheiro.agenda.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ciceropinheiro.agenda.R
import com.ciceropinheiro.agenda.databinding.ActivityFormularioBinding
import com.ciceropinheiro.agenda.databinding.ActivityListaAlunosBinding

class FormularioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)
        val binding = DataBindingUtil
            .setContentView<ActivityFormularioBinding>( this, R.layout.activity_formulario)
    }
}