package com.example.quizzer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.btnStart)
        val name : EditText = findViewById(R.id.et_name)
        btn.setOnClickListener {
            if(name.text.isEmpty())
                Toast.makeText(this,"Please Enter Your Name", Toast.LENGTH_SHORT).show()
            else{
                intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, name.text.toString())
                startActivity(intent)
            }
        }
    }
}