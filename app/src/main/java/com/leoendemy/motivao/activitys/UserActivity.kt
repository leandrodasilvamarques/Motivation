package com.leoendemy.motivao.activitys

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.leoendemy.motivao.itens.Keys
import com.leoendemy.motivao.R
import com.leoendemy.motivao.itens.SecurityPreferences
import com.leoendemy.motivao.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSalvar.setOnClickListener(this)
        verificaNome()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_salvar) {
            abraTela()
        }
    }

    private fun verificaNome() {
        val nome = SecurityPreferences(this).getNome(Keys.KEY.USER_NAME)
        if (nome.isNotBlank()) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun abraTela() {
        val nome = binding.editNome.text.toString()
        if (nome.isNotBlank()) {
            SecurityPreferences(this).setNome(Keys.KEY.USER_NAME, nome)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else binding.editNome.error = "Digite um nome!"

    }
}
