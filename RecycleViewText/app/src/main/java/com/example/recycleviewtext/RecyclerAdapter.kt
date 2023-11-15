package com.example.recycleviewtext


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter (private val mMovies: List<Moves>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameTextView: TextView = itemView.findViewById<TextView>(R.id.tvMove)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent?.context
        val inflater = LayoutInflater.from(context)
        val movieView = inflater.inflate(R.layout.item_move, parent, false)
        return ViewHolder(movieView)
    }
    override fun getItemCount(): Int {
        return mMovies.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie: Moves = mMovies.get(position)
        val textView = holder.nameTextView
        textView.text = movie.name
    }
}