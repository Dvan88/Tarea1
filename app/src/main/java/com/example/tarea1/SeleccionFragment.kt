package com.example.tarea1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.Fragment

class SeleccionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_seleccion, container, false)

        val checkBox = view.findViewById<CheckBox>(R.id.checkBox1)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)
        val switch1 = view.findViewById<Switch>(R.id.switch1)

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(requireContext(), "Terminos aceptados", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Terminos no aceptados", Toast.LENGTH_SHORT).show()
            }
        }

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
        }

        switch1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                view.setBackgroundColor(resources.getColor(android.R.color.holo_blue_light))
            } else {
                view.setBackgroundColor(resources.getColor(android.R.color.white))
            }
        }

        return view
    }
}