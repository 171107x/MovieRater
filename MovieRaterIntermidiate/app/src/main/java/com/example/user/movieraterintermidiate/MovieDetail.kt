package com.example.user.movieraterintermidiate

class MovieDetail(movie : String, description : String, language: String, date: String, age: String){

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