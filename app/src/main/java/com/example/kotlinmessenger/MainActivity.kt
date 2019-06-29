package com.example.kotlinmessenger

import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.nav_header_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
    fun nav_Header_onClick (view: View) { // add channel \ bio change
        when (view) {
            user_bio_nav_header -> {
                Toast.makeText(this,"bio", Toast.LENGTH_SHORT).show()

            }
            user_image_nav_header -> {
                Toast.makeText(this,"image",Toast.LENGTH_SHORT).show()

            }
            add_channel_nav_header ->{
                Toast.makeText(this,"channel",Toast.LENGTH_SHORT).show()


            }
        }
    }
    fun sendMessageButtononClick(view: View)
    { // send message

        Toast.makeText(this,"send",Toast.LENGTH_SHORT).show()

        }


    }

