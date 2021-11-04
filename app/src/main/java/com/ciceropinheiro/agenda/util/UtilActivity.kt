package com.ciceropinheiro.agenda.util

import android.app.Activity
import android.widget.ArrayAdapter
import android.widget.ListView

open class UtilActivity: Activity() {


    fun createArrayList() = ArrayList(listOf( "Junior", "Tavares", "Clécio", "Toinho", "Teteu"))


    fun setListView(listView: ListView){
        val listaAlunos = createArrayList()
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaAlunos )

    }


}