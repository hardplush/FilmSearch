package com.hardplush.filmsearch

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//В конструктор класс передается layout, который мы создали(film_item.xml)
class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    // Bind views from the layout to variables
    private val title: TextView = itemView.findViewById(R.id.title)
    private val poster: ImageView = itemView.findViewById(R.id.poster)
    private val description: TextView = itemView.findViewById(R.id.description)

    // In this method, we place data from film into our views
    fun bind(film: Film) {
        // Set the title
        title.text = film.title
        // Set the poster
        poster.setImageResource(film.poster)
        // Set the description
        description.text = film.description
    }
}