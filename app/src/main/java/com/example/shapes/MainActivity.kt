package com.example.shapes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myRec: RecyclerView
    lateinit var itemList: ArrayList<ShapeItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        itemList= ArrayList()
        itemList.add(ShapeItem(R.drawable.circle,R.drawable.square,"Circle","Square"))
        itemList.add(ShapeItem(R.drawable.pentagon,R.drawable.rectangle,"Pentagon","Rectangle"))
        itemList.add(ShapeItem(R.drawable.star,R.drawable.triangle,"Star","Triangle"))
        myRec = findViewById(R.id.rv)
        myRec.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        myRec.adapter=CustomAdapter(itemList)
    }
}