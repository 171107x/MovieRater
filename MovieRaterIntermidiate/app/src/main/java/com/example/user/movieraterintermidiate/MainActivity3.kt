package com.example.user.movieraterintermidiate

import com.example.user.movieraterintermidiate.MovieDetail
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView


class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar
        val movie = findViewById<TextView>(R.id.movie)
        val mtext:String = intent.extras.getString("moviename")
        val description = findViewById<TextView>(R.id.description)
        val otext:String = intent.extras.getString("description")
        val date = findViewById<TextView>(R.id.date)
        val dtext:String = intent.extras.getString("date")
        val language = findViewById<TextView>(R.id.language)
        val ltext:String = intent.extras.getString("language")
        val age = findViewById<TextView>(R.id.suitable)
        val atext:String = intent.extras.getString("age")
        var moviedesc = MovieDetail(mtext,otext,dtext,ltext,atext)

        movie.text = moviedesc.movie
        description.text = moviedesc.description
        date.text = moviedesc.date
        language.text = moviedesc.language
        age.text = moviedesc.age
    }
    override fun onCreateOptionsMenu(menu: Menu?):Boolean {
        return super.onCreateOptionsMenu(menu)
    }

}
