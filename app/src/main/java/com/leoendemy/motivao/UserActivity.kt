package com.leoendemy.motivao

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.leoendemy.motivao.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSalvar.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_salvar){
            abraTela()
        }
    }

    private fun abraTela(){
        val nome = binding.editNome.text.toString()

        if (nome.isNotBlank()){
            SecurityPreferences(this).setNome("NOME_DO_USUARIO", nome)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        else binding.editNome.error = "Digite um nome!"

    }
}
