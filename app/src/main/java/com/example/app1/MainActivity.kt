package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.image_view)

        Picasso.get()
            .load("https://miro.medium.com/v2/resize:fit:720/format:webp/1*EDTzRtnBxVEEIdzPMucC6w.jpeg")
            .into(imageView)
    }
}