package com.uct.listadealumnos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerAlumnos: RecyclerView
    private lateinit var adapter: AlumnosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerAlumnos = findViewById(R.id.recycler_alumnos)
        recyclerAlumnos.layoutManager = LinearLayoutManager(this)

        // Crear lista de alumnos (datos hardcodeados)
        val listaAlumnos = mutableListOf(
            Alumno("Julio Azabache", 20, R.drawable.img),
            Alumno("Leandro Alama", 22, R.drawable.img_1),
            Alumno("Noe Florian", 21, R.drawable.img_2),
            Alumno("Jhan Asto", 19, R.drawable.img_4),
            Alumno("Mia Khalifa", 19, R.drawable.img_5),
        )

        adapter = AlumnosAdapter(listaAlumnos)
        recyclerAlumnos.adapter = adapter
    }
}
