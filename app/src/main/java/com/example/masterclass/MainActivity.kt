package com.example.masterclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickAdd(view: View)
    {
        val intent = Intent(applicationContext, ChangeColorActivity::class.java)
        val enterWord = findViewById<TextInputEditText>(R.id.inputField).text.toString()
        intent.putExtra("word", enterWord)
        startActivity(intent)
    }
}