package com.dalvicks.taskado

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class StartupActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup)
        val mTextView = findViewById<TextView>(R.id.nickname)
        val uName = intent.getStringExtra("userName")
        mTextView.text = uName


        val buttonListener = findViewById<Button>(R.id.button)
        buttonListener.setOnClickListener {
            val intent = Intent(this@StartupActivity, AvatarActivity::class.java)
            startActivity(intent)
        }

    }
}