package com.example.tarea1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton


class BotonesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_botones, container, false)

        val btnToast = view.findViewById<Button>(R.id.btnToast)
        btnToast.setOnClickListener {
            Toast.makeText(requireContext(), "¡Botón presionado!", Toast.LENGTH_SHORT).show()
        }

        val imageButton = view.findViewById<ImageButton>(R.id.imageButton)
        imageButton.setOnClickListener {
            Toast.makeText(requireContext(), "Esto es un árbol", Toast.LENGTH_SHORT).show()
        }

        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            Toast.makeText(requireContext(), "FloatingActionButton preisonado", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}