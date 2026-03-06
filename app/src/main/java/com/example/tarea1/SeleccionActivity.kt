package com.example.tarea1

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SeleccionActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, SeleccionFragment())
                .commit()
        }

        val spinner = findViewById<Spinner>(R.id.spinnerNavegacion)
        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)

        tvTitulo.text = "Elementos de selección"

        val opciones = arrayOf("Selecciona una actividad", "Main", "Textfields", "Botones", "Elementos de seleccion", "Listas", "Elementos de Informacion")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.setOnItemSelectedListener(object : android.widget.AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: android.widget.AdapterView<*>, view: android.view.View?, position: Int, id: Long) {
                when (position) {
                    1 -> {
                        startActivity(Intent(this@SeleccionActivity, MainActivity::class.java))
                        spinner.setSelection(0)
                    }
                    2 -> {
                        startActivity(Intent(this@SeleccionActivity, TextfieldsActivity::class.java))
                        spinner.setSelection(0)
                    }
                    3 -> {
                        startActivity(Intent(this@SeleccionActivity, BotonesActivity::class.java))
                        spinner.setSelection(0)
                    }
                    4 -> {
                        spinner.setSelection(0)
                    }
                    5 -> {
                        startActivity(Intent(this@SeleccionActivity, ListasActivity::class.java))
                        spinner.setSelection(0)
                    }
                    6 -> {
                        startActivity(Intent(this@SeleccionActivity, InformacionActivity::class.java))
                        spinner.setSelection(0)
                    }
                }
            }

            override fun onNothingSelected(parent: android.widget.AdapterView<*>) {
            }
        })
    }
}