package com.example.androidunittesting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.buttonTest)
        var textView = findViewById<TextView>(R.id.textViewField)
        var checkBox = findViewById<CheckBox>(R.id.testCheckbox)

        //add an onclick handler for the button:
        button.setOnClickListener{

            if(checkBox.isChecked)
                textView.setText("The button works!")
        }
    }
}
