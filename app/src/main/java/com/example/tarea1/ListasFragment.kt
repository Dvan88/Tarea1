package com.example.tarea1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DividerItemDecoration

class ListasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_listas, container, false)


        val listView = view.findViewById<ListView>(R.id.listView)
        val deportes = listOf(
            Pair("Béisbol", "Deporte con bate y pelota"),
            Pair("Fútbol", "Deporte con balón"),
            Pair("Basquetbol", "Se encesta una pelota"),
            Pair("Tenis", "Se juega con raqueta")
        )
        val nombres = deportes.map { it.first }
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            nombres
        )
        listView.adapter = adapter
        listView.setOnItemClickListener { _, _, position, _ ->
            val deporte = deportes[position]
            Toast.makeText(
                requireContext(),
                deporte.first + ": " + deporte.second,
                Toast.LENGTH_SHORT
            ).show()
        }


        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        val lista = listOf(
            Pair("Béisbol", "Deporte con bate y pelota"),
            Pair("Fútbol", "Deporte con balón"),
            Pair("Basquetbol", "Se encesta una pelota"),
            Pair("Tenis", "Se juega con raqueta")
        )
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = SimpleAdapter(lista)
        val divider = DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL)
        recyclerView.addItemDecoration(divider)

        return view
    }
}