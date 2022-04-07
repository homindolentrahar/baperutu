package com.homindolentrahar.baperutu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.homindolentrahar.baperutu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnGetStarted.setOnClickListener {
            val loginIntent = Intent(this, LoginActivity::class.java)

            startActivity(loginIntent)
        }
    }
}