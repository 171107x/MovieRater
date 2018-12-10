package user.example.com.movierateradvance

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.BaseAdapter
import android.widget.*
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val movieList = applicationContext as MovieArray
        if (movieList.getMovie().isNotEmpty())
        {
            val adapter = MovieAdapter(applicationContext, movieList.getMovie())
            list_view.adapter = adapter
        }
    }


    class MovieAdapter(private val context: Context, private val dataSource: ArrayList<MovieDetail>) : BaseAdapter() {
        private val inflater: LayoutInflater
                = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        override fun getCount(): Int {
            return dataSource.size
        }

        //2
        override fun getItem(position: Int): Any {
            return dataSource[position]
        }

        //3
        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        /* 4 */
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            // Get view for row item
            val rowView = inflater.inflate(R.layout.list_movie, parent, false)
            val movietest = getItem(position) as MovieDetail
            val movieName = rowView.findViewById(R.id.list1) as TextView
            movieName.text = movietest.movie
            return rowView
        }
    }




    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.add,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.miAdd)
        {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
//    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
//        super.onCreateContextMenu(menu, v, menuInfo)
//        if(v?.id == R.id.movieText) {
//            menu?.add(1, 1001, 1, "Add")
//        }
//
//    }
//    override fun onContextItemSelected(item: MenuItem?): Boolean {
//        if(item?.itemId == 1001)
//        {
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//        }
//        return super.onContextItemSelected(item)
//    }
}
