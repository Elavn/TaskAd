package com.dalvicks.taskado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Usernick : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usernick)
        val mEditText = findViewById<EditText>(R.id.editTextTextPersonName)
        val mButton = findViewById<Button>(R.id.send)
        mButton.setOnClickListener {
            val mIntent = Intent(this, StartupActivity::class.java).apply { callingActivity }
            mIntent.putExtra("userName", mEditText.text.toString())
            startActivity(mIntent)
        }

    }
}