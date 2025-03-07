package com.leoendemy.motivao.activitys

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.leoendemy.motivao.Keys
import com.leoendemy.motivao.R
import com.leoendemy.motivao.SecurityPreferences
import com.leoendemy.motivao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setNome()
        botaoClicado(R.id.image_infinito)
        binding.buttonNovaFrase.setOnClickListener(this)
        binding.imageInfinito.setOnClickListener(this)
        binding.imageSol.setOnClickListener(this)
        binding.imageFeliz.setOnClickListener(this)
        }

    override fun onClick(click: View) {
        if (click.id == R.id.button_nova_frase){

        } else if (click.id in listOf(R.id.image_infinito, R.id.image_sol, R.id.image_feliz)) botaoClicado(click.id)
    }

    fun botaoClicado(id: Int){
        binding.imageInfinito.setColorFilter(ContextCompat.getColor(this, R.color.texts))
        binding.imageSol.setColorFilter((ContextCompat.getColor(this, R.color.texts)))
        binding.imageFeliz.setColorFilter(ContextCompat.getColor(this, R.color.texts))

        when (id) {
            R.id.image_infinito -> {
                binding.imageInfinito.setColorFilter(ContextCompat.getColor(this, R.color.buttons_select))
            }
            R.id.image_sol -> {
                binding.imageSol.setColorFilter((ContextCompat.getColor(this, R.color.buttons_select)))
            }
            R.id.image_feliz -> {
                binding.imageFeliz.setColorFilter(ContextCompat.getColor(this, R.color.buttons_select))
            }
        }
    }

    private fun setNome(){
        val nome = SecurityPreferences(this).getNome(Keys.KEY.USER_NAME)
        binding.textNome.text = "Olá, $nome!"
    }
}