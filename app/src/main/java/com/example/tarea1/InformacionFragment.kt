package com.example.tarea1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Button

class InformacionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_informacion, container, false)

        val txtEstado = view.findViewById<TextView>(R.id.txtEstado)
        val imgEstado = view.findViewById<ImageView>(R.id.imgEstado)
        val progreso = view.findViewById<ProgressBar>(R.id.progreso)
        val btnCargar = view.findViewById<Button>(R.id.btnCargar)

        btnCargar.setOnClickListener {

            var valor = progreso.progress + 20
            if (valor > 100) valor = 0

            progreso.progress = valor

            if (valor <= 30) {
                txtEstado.text = "Energía baja"
                imgEstado.setImageResource(android.R.drawable.ic_dialog_alert)
            }
            else if (valor <= 70) {
                txtEstado.text = "Energía media"
                imgEstado.setImageResource(android.R.drawable.ic_dialog_info)
            }
            else {
                txtEstado.text = "Energía alta"
                imgEstado.setImageResource(android.R.drawable.ic_dialog_map)
            }
        }
        return view
    }
}