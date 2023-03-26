package com.shirin.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
//**
class RecyclerAdapter (private val mList :List<QuoteList>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

   /* private var title = arrayOf("Chapter1","Chapter2","Chapter3","Chapter4","Chapter5","Chapter6","Chapter7" )
    private var details = arrayOf("item 1 details","item 2 1details","item 3 details","item 4 details","item 5 details","item 6 details","item 7 details")
    private var images = "https://rickandmortyapi.com/api/character"
*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val quoteList = mList[position]

        holder.itemTitle.text = quoteList.toString()
        holder.itemDetail.text = quoteList.toString()
        Glide.with(holder.itemView).load(quoteList).into(holder.itemImage)
    }

    override fun getItemCount(): Int {
        return mList.size
    }
   // val add = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemTitle: TextView
        var itemDetail: TextView
        var itemImage: ImageView

        init {
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemImage = itemView.findViewById(R.id.item_image)
            /*  if (itemImage !== null) {
                  Glide.with(this)
                      .load(itemImage)
                      .into(itemView.findViewById(R.id.item_image))
              }*/
        }

    }
}