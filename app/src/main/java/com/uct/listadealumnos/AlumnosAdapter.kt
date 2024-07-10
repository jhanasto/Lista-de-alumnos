package com.uct.listadealumnos

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlumnosAdapter(private val listaAlumnos: List<Alumno>) :
    RecyclerView.Adapter<AlumnosAdapter.AlumnoViewHolder>() {

    inner class AlumnoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreTextView: TextView = itemView.findViewById(R.id.text_nombre)
        val edadTextView: TextView = itemView.findViewById(R.id.text_edad)
        val fotoImageView: ImageView = itemView.findViewById(R.id.image_alumno)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)
        return AlumnoViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumnoActual = listaAlumnos[position]
        holder.nombreTextView.text = alumnoActual.nombre
        holder.edadTextView.text = "Edad: ${alumnoActual.edad}"
        holder.fotoImageView.setImageResource(alumnoActual.fotoResId)
    }

    override fun getItemCount(): Int {
        return listaAlumnos.size
    }
}
