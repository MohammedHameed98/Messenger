package com.example.kotlinmessenger

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }


fun login_button_onClick (view: View)
{
    when (view){
        login_button -> {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}
}

