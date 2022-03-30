package com.fouralabs.socialmediaui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        load()
    }

    private fun load(){
        findViewById<ImageView>(R.id.imageViewMSABackButton).setOnClickListener {
            finish()
        }
    }
}