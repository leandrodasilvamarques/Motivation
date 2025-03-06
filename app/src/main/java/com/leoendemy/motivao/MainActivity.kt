package com.leoendemy.motivao

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.leoendemy.motivao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setNome()
        binding.buttonNovaFrase.setOnClickListener(this)
        }

    override fun onClick(v: View) {
        if (v.id == R.id.button_nova_frase){

        }
    }

    private fun setNome(){
        val nome = SecurityPreferences(this).getNome("NOME_DO_USUARIO")
        binding.textNome.text = "Olá, $nome!"
    }
}