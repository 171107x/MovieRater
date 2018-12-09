package user.example.com.movierateradvance

import android.app.Application

class MovieArray: Application() {
    var movieList : ArrayList<MovieDetail>
    init{
        this.movieList = arrayListOf()
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