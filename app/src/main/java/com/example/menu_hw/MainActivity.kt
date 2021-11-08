package com.example.menu_hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.layout_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

//        val item33 = R.id.item3
//        val item44 = R.id.item4

        if (id == R.id.item1) {

            val intent = Intent(this, fourthActivity::class.java)
            this.startActivity(intent)

        }

        if (id == R.id.item2) {

            val intent = Intent(this, thirdActivity::class.java)
            this.startActivity(intent)
        }

        if (id == R.id.item3) {

//            item33.visibility = View.GONE
//            item44.visibility = View.VISIBLE

            //val intent = Intent(this, secondActivity::class.java)
            //this.startActivity(intent)
        }

        if (id == R.id.item4) {

         if (item.title == "login"){

             item.title = "logout"

         } else item.title = "login" }


//            item33.visibility = View.VISIBLE
//            item44.visibility = View.GONE

           //val intent = Intent(this, secondActivity::class.java)
          //this.startActivity(intent)

        return super.onOptionsItemSelected(item)

}}



