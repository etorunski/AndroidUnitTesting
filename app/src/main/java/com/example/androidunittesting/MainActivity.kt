package com.example.androidunittesting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.buttonTest)
        var editText = findViewById<EditText>(R.id.testEditText)

        button.setOnClickListener{ _ -> editText.setText("The button works!")}
    }
}
