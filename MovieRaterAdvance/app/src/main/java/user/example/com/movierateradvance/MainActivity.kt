package user.example.com.movierateradvance

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        listView = findViewById(R.id.list_view)
//        val listMovie = applicationContext as MovieArray
//
//        val recipeList = listMovie.getMovie()
        registerForContextMenu(movieText)
//        val listItems = arrayOfNulls<String>(recipeList.size)
//
//        for (i in 0 until recipeList.size) {
//            val recipe = recipeList[i]
//            listItems[i] = recipe.movie
//        }
//
//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
//        listView.adapter = adapter


    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menu?.add(2, 2001, 1, "Add")
//
//        return super.onCreateOptionsMenu(menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        if(item?.itemId == 2001)
//        {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//        }
//        return super.onOptionsItemSelected(item)
//    }
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        if(v?.id == R.id.movieText) {
            menu?.add(1, 1001, 1, "Add")
        }

    }
    override fun onContextItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == 1001)
        {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        return super.onContextItemSelected(item)
    }
}
