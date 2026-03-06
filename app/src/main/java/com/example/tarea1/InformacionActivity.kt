package com.example.tarea1

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InformacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, InformacionFragment())
                .commit()
        }

        val spinner = findViewById<Spinner>(R.id.spinnerNavegacion)
        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)

        tvTitulo.text = "Elementos de información"

        val opciones = arrayOf("Selecciona una actividad", "Main", "Textfields", "Botones", "Elementos de seleccion", "Listas", "Elementos de Informacion")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.setOnItemSelectedListener(object : android.widget.AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: android.widget.AdapterView<*>, view: android.view.View?, position: Int, id: Long) {
                when (position) {
                    1 -> {
                        startActivity(Intent(this@InformacionActivity, MainActivity::class.java))
                        spinner.setSelection(0)
                    }
                    2 -> {
                        startActivity(Intent(this@InformacionActivity, TextfieldsActivity::class.java))
                        spinner.setSelection(0)
                    }
                    3 -> {
                        startActivity(Intent(this@InformacionActivity, BotonesActivity::class.java))
                        spinner.setSelection(0)
                    }
                    4 -> {
                        startActivity(Intent(this@InformacionActivity, SeleccionActivity::class.java))
                        spinner.setSelection(0)
                    }
                    5 -> {
                        startActivity(Intent(this@InformacionActivity, ListasActivity::class.java))
                        spinner.setSelection(0)
                    }
                    6 -> {
                        spinner.setSelection(0)
                    }
                }
            }

            override fun onNothingSelected(parent: android.widget.AdapterView<*>) {
            }
        })
    }
}