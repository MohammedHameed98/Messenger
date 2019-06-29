package com.example.kotlinmessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }


    fun login_button_onClick (view: View) {
        when(view){

            login_button_login -> {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)


            }
            login_button_signup-> {
                val intent = Intent(this,SignupActivity::class.java)
                startActivity(intent)



            }
        }

    }
}


