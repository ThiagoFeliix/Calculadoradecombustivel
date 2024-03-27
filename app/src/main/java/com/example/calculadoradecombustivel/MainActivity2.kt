package com.example.calculadoradecombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val edtComb = findViewById<TextInputEditText>(R.id.preço)
        val edtDist = findViewById<TextInputEditText>(R.id.distancia)
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {

            val combStr: String = edtComb.text.toString()
            val distStr: String = edtDist.text.toString()

            if (combStr == "" || distStr == "") {

            }else {
            val comb =  combStr.toFloat()
            val dist = distStr.toFloat()

            val preco =  comb * dist
            val resultado = preco

            val intent = Intent(this, MainActivity3::class.java )
                intent.putExtra(KEY_RESULT, resultado)
            startActivity(intent)
             println("Thiago$resultado")


            }

        }

    }
}