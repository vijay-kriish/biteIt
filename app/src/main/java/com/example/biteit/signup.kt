package com.example.biteit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        Handler().postDelayed({
            val intent = Intent(this,location::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}