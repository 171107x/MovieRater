package user.example.com.movierateradvance

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main5.*
class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        supportActionBar
        val movieDesc = applicationContext as MovieArray
        val movieDetails = movieDesc.getMovie().last()

        val movie = findViewById<EditText>(R.id.movie)
        val description = findViewById<EditText>(R.id.description)
        val date = findViewById<EditText>(R.id.editText)
        movie.setText(movieDetails.movie)
        description.setText(movieDetails.description)
        date.setText(movieDetails.date)
        when {
            movieDetails.language=="English" -> english.isChecked
            movieDetails.language=="Chinese" -> chinese.isChecked
            movieDetails.language=="Malay" -> malay.isChecked
            movieDetails.language=="Tamil" -> tamil.isChecked
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.edit, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item?.itemId == R.id.miSave)
        {
            val movie = findViewById<EditText>(R.id.movie)
            val description = findViewById<EditText>(R.id.description)
            val date = findViewById<EditText>(R.id.editText)
            val check2 = findViewById<CheckBox>(R.id.checkBox1)
            check2.visibility = View.GONE
            val check3 = findViewById<CheckBox>(R.id.checkBox2)
            check3.visibility = View.GONE
            if(movie.text.isEmpty())
            {
                movie.error
            }
            if(description.text.isEmpty())
            {
                description.error
            }
            if(date.text.isEmpty())
            {
                date.error
            }
            var radiocheck = findViewById<RadioGroup>(R.id.rg)
            var radioid:Int = radiocheck.checkedRadioButtonId
            if(radioid != -1) {
                val radio1: RadioButton = findViewById(radioid)
                if(checkBox.isChecked) {
                    val movieDesc = applicationContext as MovieArray
                    val movieDetails = movieDesc.getMovie().last()
                    val intent = Intent(applicationContext, MainActivity3::class.java)
                    movieDetails.movie = movie.text.toString()
                    movieDetails.description = description.text.toString()
                    movieDetails.date = date.text.toString()
                    movieDetails.language=radio1.text.toString()
                    movieDetails.age = "No"
                    startActivity(intent)
                }

                else if(!checkBox.isChecked)
                {
                    val movieDesc = applicationContext as MovieArray
                    val movieDetails = movieDesc.getMovie().last()
                    val intent = Intent(applicationContext, MainActivity3::class.java)
                    movieDetails.movie = movie.text.toString()
                    movieDetails.description = description.text.toString()
                    movieDetails.date = date.text.toString()
                    movieDetails.language=radio1.text.toString()
                    movieDetails.age = "Yes"
                    startActivity(intent)
                }
            }
        } else if(item?.itemId == R.id.miCancel)
        {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}
