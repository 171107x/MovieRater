package user.example.com.movierateradvance

import android.app.Application

class MovieDetail: Application(){

    var movie: String = ""
    var description: String = ""
    var language: String = ""
    var date: String = ""
    var age: String = ""
    var rating : Float = 0F
    var review : String = ""
    init {
        this.movie = movie
        this.description = description
        this.language = language
        this.date = date
        this.age = age
        this.rating = rating
        this.review = review
    }
}