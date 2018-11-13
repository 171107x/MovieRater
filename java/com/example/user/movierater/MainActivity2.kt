package com.example.user.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var moviedesc = MovieDetail("Venom", "When Eddie Brock acquires the powers of a symbiote, he will have to release his alter-ego 'Venom' to save his life.", "English","03-12-18", "Yes")
        val movie = findViewById<TextView>(R.id.movie)
        val desc = findViewById<TextView>(R.id.description)
        val date = findViewById<TextView>(R.id.date)
        val language = findViewById<TextView>(R.id.language)
        val age = findViewById<TextView>(R.id.textView14)

        movie.text = moviedesc.movie
        desc.text = moviedesc.description
        date.text = moviedesc.date
        language.text = moviedesc.language
        age.text = moviedesc.date
    }
    class MovieDetail (movie : String, description : String, language: String, date: String, age: String) {
        var movie: String
        var description: String
        var language: String
        var date: String
        var age: String
        init {
            this.movie = movie
            this.description = description
            this.language = language
            this.date = date
            this.age = age
        }
    }

}
