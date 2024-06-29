package com.example.biteit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biteit.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button2.setOnClickListener{
            val intent=Intent(this,signup::class.java)
            startActivity(intent)
        }
    }
}
