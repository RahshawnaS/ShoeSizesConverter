package com.example.shoesizingconvert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.shoesizingconvert.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eu_output: TextView = findViewById(R.id.eu_output)
        val eu_input: EditText = findViewById(R.id.eu_input)
        val eubutton: Button = findViewById(R.id.eubutton)

        val ue_output: TextView = findViewById(R.id.ue_output)
        val ue_input: EditText = findViewById(R.id.ue_input)
        val uebutton: Button = findViewById(R.id.uebutton)
        uebutton.setOnClickListener {
            val ussize = ue_input.text.toString()
            when (ussize) {
                "6" -> ue_output.setText("39")
                "6.5" -> ue_output.setText("39")
                "7" -> ue_output.setText("40")
                "7.5" -> ue_output.setText("40-41")
                "8" -> ue_output.setText("41")
                "8.5" -> ue_output.setText("41-42")
                "9" -> ue_output.setText("42")
                "9.5" -> ue_output.setText("42-43")
                "10" -> ue_output.setText("43")
                "10.5" -> ue_output.setText("43-44")
                "11" -> ue_output.setText("44")
                "11.5" -> ue_output.setText("44-45")
                "12" -> ue_output.setText("45")
                "13" -> ue_output.setText("46")
                "14" -> ue_output.setText("47")
                "15" -> ue_output.setText("48")
                "16" -> ue_output.setText("49")
                else -> ue_output.setText("Enter a number between 6-16")
            }
        }
        eubutton.setOnClickListener {
            val ussize = eu_input.text.toString()
            when (ussize) {
                "39" -> eu_output.setText("6-6.5")
                "40" -> eu_output.setText("7-7.5")
                "41" -> eu_output.setText("8-8.5")
                "42" -> eu_output.setText("9-9.5")
                "43" -> eu_output.setText("10-10.5")
                "44" -> eu_output.setText("11-11.5")
                "45" -> eu_output.setText("12")
                "46" -> eu_output.setText("13")
                "47" -> eu_output.setText("14")
                "48" -> eu_output.setText("15")
                "49" -> eu_output.setText("16")
                else -> eu_output.setText("Enter a number between 39-49")
            }
        }
    }
}