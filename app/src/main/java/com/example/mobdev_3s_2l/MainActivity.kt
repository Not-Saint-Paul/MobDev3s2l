package com.example.mobdev_3s_2l

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText = findViewById<EditText>(R.id.edit_text_id)
        val buttonBlackText = findViewById<Button>(R.id.button_black_text)
        val buttonRedText = findViewById<Button>(R.id.button_red_text)
        val buttonSizeTo8sp = findViewById<Button>(R.id.button_to8sp)
        val buttonSizeTo24sp = findViewById<Button>(R.id.button_to24sp)
        val buttonWhiteBackground = findViewById<Button>(R.id.button_white_background)
        val buttonYellowBackground = findViewById<Button>(R.id.button_yellow_background)

        buttonBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        buttonRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        buttonSizeTo8sp.setOnClickListener {
            editText.setTextSize(8f)
        }

        buttonSizeTo24sp.setOnClickListener {
            editText.setTextSize(24f)
        }

        buttonWhiteBackground.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        buttonYellowBackground.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}