package user.example.com.movierateradvance

import android.app.Application

class MovieDetail{

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
class MovieArray: Application() {
    var movieList : ArrayList<MovieDetail>
    init{
        this.movieList = ArrayList()
    }

    fun addMovie(movie: MovieDetail){
        this.movieList.add(movie)
    }

    fun getMovie():ArrayList<MovieDetail>{
        return this.movieList
    }

    private var singleton : MovieArray? = null

    fun getInstance() : MovieArray?{
        return singleton
    }

    override fun onCreate() {
        super.onCreate()
        singleton = this
    }

}