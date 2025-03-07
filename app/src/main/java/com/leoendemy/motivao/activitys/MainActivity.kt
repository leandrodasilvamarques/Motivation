package com.leoendemy.motivao.activitys

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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
        binding.buttonNovaFrase.setOnClickListener(this)
        binding.imageInfinito.setOnClickListener(this)
        binding.imageSol.setOnClickListener(this)
        binding.imageFeliz.setOnClickListener(this)
        }

    override fun onClick(click: View) {
        if (click.id == R.id.button_nova_frase){
            TODO()
        }else if(click.id == R.id.image_infinito){

        }else if(click.id == R.id.image_sol){

        }else if (click.id == R.id.image_feliz){

        }

    }

    private fun setNome(){
        val nome = SecurityPreferences(this).getNome(Keys.KEY.USER_NAME)
        binding.textNome.text = "Olá, $nome!"
    }
}