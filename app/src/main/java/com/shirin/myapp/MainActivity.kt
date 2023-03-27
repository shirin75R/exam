package com.shirin.myapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Path

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    lateinit var recyclerRick: RecyclerView

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerRick = findViewById(R.id.recyclerView)

        layoutManager = LinearLayoutManager(this)
        recyclerRick.layoutManager = layoutManager // better only define once recycler view in class similar adapter
//        adapter = RecyclerAdapter()
//        recyclerRick.adapter = adapter



        val  apiInterface= ApiInterface.create().getCharacter()
        apiInterface.enqueue(object : Callback<QuoteList>{

            override fun onResponse(call: Call<QuoteList>, response: Response<QuoteList>) {
                val a= 4
            }

            override fun onFailure(call: Call<QuoteList>, t: Throwable) {
            val e= 3
            }
        })

    }
}