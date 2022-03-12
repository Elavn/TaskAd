package com.dalvicks.taskado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class AvatarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avatar)

        val mTextView = findViewById<TextView>(R.id.avatar)
        val uName = intent.getStringExtra("userName")
        mTextView.text = uName






    }
}