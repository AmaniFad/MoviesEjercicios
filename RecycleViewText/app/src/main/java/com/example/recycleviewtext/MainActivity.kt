package com.example.recycleviewtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
    }

    fun setUpRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.rvMoveList)
        recyclerView.adapter = RecyclerAdapter(getMoves())
        recyclerView.layoutManager = LinearLayoutManager(this)
    }


    fun getMoves(): MutableList<Moves>{
        var moveslist:MutableList<Moves> = ArrayList()
        moveslist.add(Moves("Titanic", null))
        moveslist.add(Moves("Cenicienta", null))
        moveslist.add(Moves("Mi primer beso", null))
        moveslist.add(Moves("Blancanieves", null))
        moveslist.add(Moves("El Guradaspaldas", null))
        moveslist.add(Moves("Oppenheimer", null))
        moveslist.add(Moves("Barbie", null))
        moveslist.add(Moves("La sirenita", null))
        moveslist.add(Moves("8 apellidos marroquis", null))
        moveslist.add(Moves("3aisha 9ondisha", null))

        return moveslist
    }

}