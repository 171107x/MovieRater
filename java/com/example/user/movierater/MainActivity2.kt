package com.example.user.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val movie = findViewById<TextView>(R.id.movie)
        val movietext:String = intent.getStringExtra("movie")
        val desc = findViewById<TextView>(R.id.description)
        val desctext:String = intent.getStringExtra("description")
        val date = findViewById<TextView>(R.id.date)
        val datetext:String = intent.getStringExtra("date")
        val language = findViewById<TextView>(R.id.language)
        val langtext:String = intent.getStringExtra("language")
        val age = findViewById<TextView>(R.id.textView14)
        val agetext:String = intent.getStringExtra("age")

        movie.text = movietext
        desc.text = desctext
        date.text = datetext
        language.text = langtext
        age.text = agetext
    }

}
