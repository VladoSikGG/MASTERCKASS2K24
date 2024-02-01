package com.example.masterclass

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class ChangeColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_color)
        val word = findViewById<TextView>(R.id.resultWord)
        word.text = intent.extras?.getString("word")
    }

    fun onClickRed(view: View){
        val word = findViewById<TextView>(R.id.resultWord)
        word.setTextColor(Color.RED)
        Log.d("1111", "redClick")
    }
    fun onClickYellow(view: View){
        val word = findViewById<TextView>(R.id.resultWord)
        word.setTextColor(Color.YELLOW)
    }
    fun onClickGreen(view: View){
        val word = findViewById<TextView>(R.id.resultWord)
        word.setTextColor(Color.GREEN)
    }
    fun onClickBlue(view: View){
        val word = findViewById<TextView>(R.id.resultWord)
        word.setTextColor(Color.BLUE)
    }

    fun onClickNext(view: View){
        val word = findViewById<TextView>(R.id.resultWord)
        val intent = Intent(applicationContext, ResultActivity::class.java)
        intent.putExtra("wordColor", word.textColors.defaultColor.toString())
        intent.putExtra("word", word.text)

        startActivity(intent)
    }
}