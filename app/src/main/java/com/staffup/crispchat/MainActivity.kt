package com.staffup.crispchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import im.crisp.client.ChatActivity
import im.crisp.client.Crisp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Crisp.configure(applicationContext, "c46e387c-f3f9-4a29-bf1f-3f1d3f280731")
        findViewById<Button>(R.id.btn).setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
    }
}