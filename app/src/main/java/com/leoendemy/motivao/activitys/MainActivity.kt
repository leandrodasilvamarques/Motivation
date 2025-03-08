package com.leoendemy.motivao.activitys

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.leoendemy.motivao.itens.Keys
import com.leoendemy.motivao.R
import com.leoendemy.motivao.dados.Frase
import com.leoendemy.motivao.dados.Mock
import com.leoendemy.motivao.itens.SecurityPreferences
import com.leoendemy.motivao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private var botaoSelecionadoId = Keys.VALOR_DOS_BOTOES.INICIAL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setNome()
        binding.buttonNovaFrase.setOnClickListener(this)
        binding.imageAnsiedade.setOnClickListener(this)
        binding.imageSabedoria.setOnClickListener(this)
        binding.imageAmor.setOnClickListener(this)
    }

    override fun onClick(click: View) {
        if (click.id == R.id.button_nova_frase) {
            exibirFrase()
        } else if (click.id in listOf(
                R.id.image_ansiedade,
                R.id.image_sabedoria,
                R.id.image_amor
            )
        ) botaoClicado(click.id)
    }

    fun exibirFrase() {
        if (botaoSelecionadoId != Keys.VALOR_DOS_BOTOES.INICIAL) binding.textFrases.text = Mock().getFrase(botaoSelecionadoId)
        else exibirMensagemFlutuante()
    }

    fun botaoClicado(id: Int) {
        binding.imageAnsiedade.setColorFilter(ContextCompat.getColor(this, R.color.texts))
        binding.imageSabedoria.setColorFilter((ContextCompat.getColor(this, R.color.texts)))
        binding.imageAmor.setColorFilter(ContextCompat.getColor(this, R.color.texts))

        when (id) {
            R.id.image_ansiedade -> {
                binding.imageAnsiedade.setColorFilter(
                    ContextCompat.getColor(
                        this,
                        R.color.buttons_select
                    )
                )
                botaoSelecionadoId = Keys.VALOR_DOS_BOTOES.ANSIEDADE
                Toast.makeText(this, "Ansiedade", Toast.LENGTH_SHORT).show()
            }

            R.id.image_sabedoria -> {
                binding.imageSabedoria.setColorFilter(
                    (ContextCompat.getColor(
                        this,
                        R.color.buttons_select
                    ))
                )
                botaoSelecionadoId = Keys.VALOR_DOS_BOTOES.SABEDORIA
                Toast.makeText(this, "Sabedoria", Toast.LENGTH_SHORT).show()
            }

            R.id.image_amor -> {
                binding.imageAmor.setColorFilter(
                    ContextCompat.getColor(
                        this,
                        R.color.buttons_select
                    )
                )
                botaoSelecionadoId = Keys.VALOR_DOS_BOTOES.AMOR
                Toast.makeText(this, "Amor", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun exibirMensagemFlutuante() {
        Toast.makeText(
            this,
            "Selecione o tipo de versiculo que deseja ler abaixo!",
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun setNome() {
        val nome = SecurityPreferences(this).getNome(Keys.KEY.USER_NAME)
        binding.textNome.text = "Olá, $nome!"
    }
}