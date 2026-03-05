package com.example.tarea1

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listas)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, ListasFragment())
                .commit()
        }

        val spinner = findViewById<Spinner>(R.id.spinnerNavegacion)
        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)

        tvTitulo.text = "Listas"

        val opciones = arrayOf("Selecciona una actividad", "Main", "Textfields", "Botones", "Seleccion", "Listas", "Informacion")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.setOnItemSelectedListener(object : android.widget.AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: android.widget.AdapterView<*>, view: android.view.View?, position: Int, id: Long) {
                when (position) {
                    1 -> {
                        startActivity(Intent(this@ListasActivity, MainActivity::class.java))
                        spinner.setSelection(0)
                    }
                    2 -> {
                        startActivity(Intent(this@ListasActivity, TextfieldsActivity::class.java))
                        spinner.setSelection(0)
                    }
                    3 -> {
                        startActivity(Intent(this@ListasActivity, BotonesActivity::class.java))
                        spinner.setSelection(0)
                    }
                    4 -> {
                        startActivity(Intent(this@ListasActivity, SeleccionActivity::class.java))
                        spinner.setSelection(0)
                    }
                    5 -> {
                        spinner.setSelection(0)
                    }
                    6 -> {
                        startActivity(Intent(this@ListasActivity, InformacionActivity::class.java))
                        spinner.setSelection(0)
                    }
                }
            }

            override fun onNothingSelected(parent: android.widget.AdapterView<*>) {
            }
        })
    }
}