package com.shirin.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var title = arrayOf("Chapter1","Chapter2","Chapter3","Chapter4","Chapter5","Chapter6","Chapter7","Chapter8")
    private var details = arrayOf("item 1 details","item 2 1details","item 3 details","item 4 details","item 5 details","item 6 details","item 7 details","item 8 details")
    //private var images = intArrayOf(R.drawable.download,R.drawable.download,R.drawable.download,R.drawable.download,R.drawable.download,R.drawable.download,R.drawable.download,R.drawable.download,R.drawable.download,R.drawable.download,)
    private var images ="https://rickandmortyapi.com/api/character"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return title.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text=title[position]
        holder.itemDetail.text=details[position]
      //  holder.itemImage.setImageResource(images[position])

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage = "https://rickandmortyapi.com/api/character"
     //   var itemImage : ImageView
        var itemTitle : TextView
        var itemDetail : TextView
        init {
         //   itemImage=itemView.findViewById(R.id.item_image)
            itemTitle=itemView.findViewById(R.id.item_title)
            itemDetail=itemView.findViewById(R.id.item_detail)

          /*  if (itemImage !== null) {
                Glide.with(this)
                    .load(itemImage)
                    .into(itemView.findViewById(R.id.item_image))
            }
*/


        }

    }
}