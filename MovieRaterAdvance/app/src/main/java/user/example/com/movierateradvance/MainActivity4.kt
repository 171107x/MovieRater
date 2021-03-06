package user.example.com.movierateradvance

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main4.*


class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        supportActionBar

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.review, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val movieDesc = applicationContext as MovieArray
        val movieDetails = movieDesc.getMovie().last()

        movieDetails.rating = ratingBar.rating
        movieDetails.review= review.text.toString()
        val intent = Intent(applicationContext,MainActivity3::class.java)
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}