package com.example.hellotoast

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi TextView dan Button
        val mShowCount = findViewById<TextView>(R.id.show_count) // Sesuaikan ID dengan XML
        val buttonCountUp = findViewById<Button>(R.id.button_count)
        val buttonToast = findViewById<Button>(R.id.button_toast)

        // Set onClickListener untuk buttonCountUp
        buttonCountUp.setOnClickListener(View.OnClickListener {
            mCount++
            mShowCount?.text = mCount.toString()
        })

        // Set onClickListener untuk buttonToast
        buttonToast.setOnClickListener(View.OnClickListener {
            val tulisan: String = mShowCount?.text.toString()
            val toast: Toast = Toast.makeText(this, "Angka yang dimunculkan " + tulisan, Toast.LENGTH_LONG)
            toast.show()
        })
    }
}
