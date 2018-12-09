package user.example.com.movierateradvance

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar

        registerForContextMenu(review)
        val movieDesc = applicationContext as MovieDetail

        val movie = findViewById<TextView>(R.id.movie)
        val description = findViewById<TextView>(R.id.description)
        val date = findViewById<TextView>(R.id.date)
        val language = findViewById<TextView>(R.id.language)
        val age = findViewById<TextView>(R.id.suitable)

        movie.text = movieDesc.movie
        description.text = movieDesc.description
        date.text = movieDesc.language
        language.text = movieDesc.date
        age.text = movieDesc.age

        if(movieDesc.rating>0F)
        {
            ratingBar.layoutParams.height= ActionBar.LayoutParams.WRAP_CONTENT
            ratingBar.rating = movieDesc.rating
            ratingBar.visibility = View.VISIBLE
            review.text = movieDesc.review
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toedit, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.miEdit){
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        if(v?.id == R.id.review) {
            menu?.add(2, 2001, 1, "Add")
        }

    }
    override fun onContextItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == 2001)
        {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        return super.onContextItemSelected(item)
    }
}
