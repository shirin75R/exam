package com.shirin.myapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    lateinit var recyclerRick: RecyclerView

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recyclerRick = findViewById(R.id.recyclerView)


        layoutManager = LinearLayoutManager(this)
        recyclerRick.layoutManager = layoutManager // better only define once recycler view in class similar adapter
        adapter = RecyclerAdapter()
        recyclerRick.adapter = adapter

    }
}