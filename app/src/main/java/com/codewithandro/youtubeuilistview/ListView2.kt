package com.codewithandro.youtubeuilistview

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ListView2 : AppCompatActivity() {

    //intilize the userArrayList
    lateinit var userArrayList: ArrayList<UserYT>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view2)

        //create data

        val imageId= intArrayOf(R.drawable.tum1,R.drawable.tum2,R.drawable.tum3,
            R.drawable.tum4,R.drawable.tum5,R.drawable.tum6,R.drawable.tum7,R.drawable.lll222,
            R.drawable.tum99)

        val vTitle = arrayOf(
            "List View with 2 Projects | Adapter |Imp Topic | Android Devlopment Series",
            "Learn English with Podcast Conversation | How to Get Success Quickly |Ep 19",
            "Android Charts | Android Chart Example | How to Create Chart In Android",
            "Learn English with JOE ROGEN PODCAST - Elon Musk",
            "All About Freelancing | Roadmap for Beginners | Earn in Lakhs",
            "Complate C++ DSA Course | Data Structure & Algoritham Ep 21",
            "Naruto the Movie : Legend of the Stone of Gelel || #naruto #narutoshippuden ",
            "Spring Boot Tutorial with CRUD Project | by Coding Wallah Sir [ Spring Boot ONE SHOT ]",
            "Spring boot | Creating REST API using spring boot in one video in Hindi"
        )

        val channelLogo= intArrayOf(R.drawable.lll1,R.drawable.lll2,R.drawable.logo3,
            R.drawable.logo4,R.drawable.logo5,R.drawable.logo6,R.drawable.logo7,R.drawable.tum8,R.drawable.tum9)

        val channelName = arrayOf("Saumya Singh","Podvoice Studio","Md Jamal","Learn English with TV Series",
            "Aman Dhatarval","Apana Collage","Naruto Offical Channel","Codding Wallah Sir","Learn Code With Durgesh")

        val videoViews = arrayOf("1.5M Views 9 months ago","227K Views 3 months ago","560K Views 1 months ago",
            "87K Views 6 days ago","998K Views 2 years ago","590K Views 7 months ago","700K Views 7 days ago",
            "113K Views 12 days ago","1.6M Views 11 months ago")


        //up the intilize userArrayList Are the Pass
        userArrayList =ArrayList()

        //push data in the -> UserYT data class
        for(eachIdx in  channelName.indices){

            //eachIndex auto increment by 1
            val userYtData = UserYT( imageId[eachIdx],vTitle[eachIdx],channelLogo[eachIdx],
                channelName[eachIdx],videoViews[eachIdx])

            //add in UserArrayList Class
            userArrayList.add(userYtData)
        }
        //data add ho gaya

        //find list view
        val ytListView=findViewById<ListView>(R.id.ytListView)
        ytListView.isClickable=true

        //create own adapter -> MyAdapter pass (context,dataArray)
        ytListView.adapter = MyAdapter(this,userArrayList)


    }

}