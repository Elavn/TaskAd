package com.dalvicks.taskado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class startscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startscreen)

        val buttonListener = findViewById<Button>(R.id.Getstarted)

        buttonListener.setOnClickListener {
            Toast.makeText(this, "Welcome to TaskAdo", Toast.LENGTH_SHORT).show()
        }
        buttonListener.setOnClickListener {
            val intent = Intent(this, Usernick::class.java)
            startActivity(intent)
        }
    }
}