package br.unipar.atividade_2_calculadora_simples

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val numero1 = findViewById<TextView>(R.id.txtNum1)
        val numero2 = findViewById<TextView>(R.id.txtNum2)
        val btnSoma = findViewById<Button>(R.id.btnSomar)
        val btnSubtracao = findViewById<Button>(R.id.btnSubtrair)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        btnSoma.setOnClickListener {

            val numeroInformado1 = numero1.text.toString();
            val numeroInformado2 = numero2.text.toString()

            if (numeroInformado1.isNotEmpty() && numeroInformado2.isNotEmpty()) {

                val num1 = numeroInformado1.toInt()
                val num2 = numeroInformado2.toInt()

                val somaTotal = num1 + num2

                resultado.setText("O valor da soma é $somaTotal")

            } else {
                resultado.setText("Informe um valor")
            }

        }

        btnSubtracao.setOnClickListener {

            val numeroInformado1 = numero1.text.toString();
            val numeroInformado2 = numero2.text.toString()

            if (numeroInformado1.isNotEmpty() && numeroInformado2.isNotEmpty()) {

                val num1 = numeroInformado1.toInt()
                val num2 = numeroInformado2.toInt()

                val subtracaoTotal = num1 - num2

                resultado.setText("O valor da subtração é $subtracaoTotal")

            } else {
                resultado.setText("Informe um valor")
            }

        }


    }

    fun limparValores(view: View) {
        val limpar1 = findViewById<TextView>(R.id.txtNum1)
        val limpar2 = findViewById<TextView>(R.id.txtNum2)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        resultado.setText("")
        limpar1.setText("")
        limpar2.setText("")


    }

}