package com.example.shapes


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var list: ArrayList<ShapeItem>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val image: ImageView = itemview.findViewById(R.id.Img1)
        val image2: ImageView = itemview.findViewById(R.id.Img2)
        val name: TextView = itemview.findViewById(R.id.Txt1)
        val name2: TextView = itemview.findViewById(R.id.Txt2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycle_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(list[position].shapeImg1)
        holder.image2.setImageResource(list[position].shapeImg2)
        holder.image.setOnClickListener {
            holder.name.text = list[position].shapeName1
        }
        holder.image2.setOnClickListener {
            holder.name2.text = list[position].shapeName2
        }
    }

}