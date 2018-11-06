package com.example.user.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*
import android.text.TextUtils
import android.content.Intent


class MainActivity : AppCompatActivity() {
    var ids = intArrayOf(R.id.movie, R.id.description, R.id.editText)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val check = findViewById<CheckBox>(R.id.checkBox)
        check.setOnCheckedChangeListener { buttonView, isChecked ->
            if (checkBox.isChecked) {
                checkBox1.visibility = View.VISIBLE
                checkBox2.visibility = View.VISIBLE
            } else {
                checkBox1.visibility = View.GONE
                checkBox1.isChecked = false
                checkBox2.visibility = View.GONE
                checkBox2.isChecked = false
            }
        }
        button.setOnClickListener {
            for (id in ids) {
                val lol = findViewById<View>(id) as EditText

                if (TextUtils.isEmpty(lol.text.toString())) {
                    lol.setError("Must enter Value")
                } else {
                    var rc = findViewById<RadioGroup>(R.id.rg)
                    var radioid:Int = rc.checkedRadioButtonId
                    if(radioid != -1) {
                        val radio1: RadioButton = findViewById(radioid)
                        if(checkBox.isChecked){
                            if(checkBox1.isChecked && checkBox2.isChecked) {
                                Toast.makeText(
                                    this@MainActivity,
                                    "Title = " + movie.text + "\nOverview = " + description.text + "\nLanguage= " + radio1.text + "\nRelease Date = " + editText.text + "\nNot Suitable for all ages" + "\nReason: " + checkBox1.text + "\n" + checkBox2.text,
                                    Toast.LENGTH_SHORT
                                ).show()
                            } else if (checkBox2.isChecked){
                                Toast.makeText(
                                    this@MainActivity,
                                    "Title = " + movie.text + "\nOverview = " + description.text + "\nLanguage= " + radio1.text + "\nRelease Date = " + editText.text + "\nNot Suitable for all ages" + "\nReason: " + checkBox2.text,
                                    Toast.LENGTH_SHORT
                                ).show()
                            }   else if (checkBox1.isChecked){
                                Toast.makeText(
                                    this@MainActivity,
                                    "Title = " + movie.text + "\nOverview = " + description.text + "\nLanguage= " + radio1.text + "\nRelease Date = " + editText.text + "\nNot Suitable for all ages" + "\nReason: " + checkBox1.text,
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        } else {
                            Toast.makeText(this@MainActivity, "Title = " + movie.text +  "\nOverview = " + description.text + "\nLanguage= " + radio1.text + "\nRelease Date = " + editText.text, Toast.LENGTH_SHORT).show()
                        }
                    }

                }
            }
        }
        viewButton.setOnClickListener {
            val movie = findViewById<EditText>(R.id.movie)
            var description = findViewById<EditText>(R.id.description)
            var date = findViewById<EditText>(R.id.editText)
            var language = findViewById<RadioGroup>(R.id.rg)
            var radioid:Int = language.checkedRadioButtonId
            val radio1: RadioButton = findViewById(radioid)
            if(check.isChecked) {
                val no = "No"
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("movie", movie.text.toString())
                intent.putExtra("description", description.text.toString())
                intent.putExtra("date", date.text.toString())
                intent.putExtra("language", radio1.text.toString())
                intent.putExtra("age", no)
                startActivity(intent)
            }
            else if (check.isChecked == false)
            {
                val yes = "Yes"
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("moviename", movie.text.toString())
                intent.putExtra("description", description.text.toString())
                intent.putExtra("date", date.text.toString())
                intent.putExtra("language", radio1.text.toString())
                intent.putExtra("age", yes)
                startActivity(intent)
            }
        }
    }
}