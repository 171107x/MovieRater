package com.example.user.movieraterintermidiate

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    var ids = intArrayOf(R.id.movie, R.id.description, R.id.editText)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val check = findViewById<CheckBox>(R.id.checkBox)
        check.setOnCheckedChangeListener { buttonView, isChecked ->
            if (checkBox.isChecked) {
                checkBox1.visibility = View.VISIBLE
                checkBox2.visibility = View.VISIBLE
            } else {
                checkBox1.visibility = View.INVISIBLE
                checkBox1.isChecked = false
                checkBox2.visibility = View.INVISIBLE
                checkBox2.isChecked = false
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?):Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item?.itemId == R.id.miRegister) {
                for (id in ids) {
                    val lol = findViewById<View>(id) as EditText

                    if (lol.text.toString().isEmpty()) {
                        lol.setError("Must enter Value")
                    } else {
                        var rc = findViewById<RadioGroup>(R.id.rg)
                        var radioid: Int = rc.checkedRadioButtonId
                        if (radioid != -1) {
                            val radio1: RadioButton = findViewById(radioid)
                            if (checkBox.isChecked) {
                                if (checkBox1.isChecked && checkBox2.isChecked) {
                                    Toast.makeText(
                                        this@MainActivity2,
                                        "Title = " + movie.text + "\nOverview = " + description.text + "\nLanguage= " + radio1.text + "\nRelease Date = " + editText.text + "\nNot Suitable for all ages" + "\nReason: " + checkBox1.text + "\n" + checkBox2.text,
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else if (checkBox2.isChecked) {
                                    Toast.makeText(
                                        this@MainActivity2,
                                        "Title = " + movie.text + "\nOverview = " + description.text + "\nLanguage= " + radio1.text + "\nRelease Date = " + editText.text + "\nNot Suitable for all ages" + "\nReason: " + checkBox2.text,
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else if (checkBox1.isChecked) {
                                    Toast.makeText(
                                        this@MainActivity2,
                                        "Title = " + movie.text + "\nOverview = " + description.text + "\nLanguage= " + radio1.text + "\nRelease Date = " + editText.text + "\nNot Suitable for all ages" + "\nReason: " + checkBox1.text,
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            } else {
                                Toast.makeText(
                                    this@MainActivity2,
                                    "Title = " + movie.text + "\nOverview = " + description.text + "\nLanguage= " + radio1.text + "\nRelease Date = " + editText.text,
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }

                    }
                }

        } else if(item?.itemId == R.id.miClear){
            for (id in ids) {
                val lol = findViewById<View>(id) as EditText
                lol.text.clear().toString()
            }
            checkBox.isChecked = false;

        }
            return super.onOptionsItemSelected(item)
        }
    }

