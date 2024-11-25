package com.codewithandro.youtubeuilistview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(val Context:Activity,val arrayList: ArrayList<UserYT>) :
      ArrayAdapter<UserYT>( Context, R.layout.each_row , arrayList)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        //create Inflater
        val inflater =LayoutInflater.from(Context)//main activity ka
        val view =inflater.inflate(R.layout.each_row,null) //pass the created component xml

        //featch the view in xml -> using view

        val imageId = view.findViewById<ImageView>(R.id.imageId)
        val vTitle =  view.findViewById<TextView>(R.id.vTitle)
        val channelLogo = view.findViewById<ImageView>(R.id.channelLogo)
        val channelName = view.findViewById<TextView>(R.id.channelName)
        val videoViews = view.findViewById<TextView>(R.id.videoViews)

        //position change the increass by 1
        //assign the position

        imageId.setImageResource(arrayList[position].imageId)
        vTitle.text = arrayList[position].vTitle
        channelLogo.setImageResource(arrayList[position].channelLogo)
        channelName.text = arrayList[position].channelName
        videoViews.text = arrayList[position].videoViews


        //return the view
        return view

        //ready the adapter
    }
}