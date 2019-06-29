package com.example.kotlinmessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }
    fun signupOnCliclk (view: View){
        when (view){
            signup_button_photo->{

                Toast.makeText(this,"photo",Toast.LENGTH_SHORT).show()

            }
            signup_button_signup->{
                Toast.makeText(this,"sign up",Toast.LENGTH_SHORT).show()



            }





        }




    }
}
