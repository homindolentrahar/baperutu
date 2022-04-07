package com.homindolentrahar.baperutu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.homindolentrahar.baperutu.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val phoneIcon = binding.imgPhone
        val websiteIcon = binding.imgWebsite

        phoneIcon.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:085811223344"))

            startActivity(callIntent)
        }
        websiteIcon.setOnClickListener {
            val webIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://amikom.ac.id")
            )

            startActivity(webIntent)
        }
    }
}