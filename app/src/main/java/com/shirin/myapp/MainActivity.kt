package com.shirin.myapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? =null
    private var adapter :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null


    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        layoutManager=LinearLayoutManager(this)
        findViewById<RecyclerView>(R.id.recyclerView).layoutManager=layoutManager
        adapter=RecyclerAdapter()
        findViewById<RecyclerView>(R.id.recyclerView).adapter = adapter

    }
}