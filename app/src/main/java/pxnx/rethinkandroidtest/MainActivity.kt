package pxnx.rethinkandroidtest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rethinkdb.RethinkDB
import com.rethinkdb.gen.exc.ReqlError
import com.rethinkdb.net.Connection
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    val r = RethinkDB()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Log.w(TAG, "--------- CLICK ---------")

     //       try {
                val conn: Connection =
                    r.connection()
                        .hostname("pentexnyx-test.ddns.net")
                        .port(28015)
                        .connect()

                /*    r.db("test")
                    .tableCreate("tv_shows")
                    .run<Any>(conn) //Any added

                r.table("tv_shows")
                    .insert(r.hashMap("name", "Star Trek TNG"))
                    .run(conn)

             */

        /*    } catch (e: ReqlError) {
                Log.w(TAG, "ERR: $e")
            }

         */
        }

    }


}