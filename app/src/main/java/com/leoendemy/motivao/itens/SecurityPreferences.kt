package com.leoendemy.motivao.itens

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences (context: Context) {
    private val seguranca: SharedPreferences = context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun setNome(chave: String, string: String){
        seguranca.edit().putString(chave, string).apply()
    }

    fun getNome(chave: String) : String{
        return seguranca.getString(chave, "") ?: ""
    }
}