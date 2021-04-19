package com.example.cntrllr

import android.graphics.Canvas
import android.graphics.Paint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.marginStart

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var butON = findViewById<ImageView>(R.id.imageView)
        var but1 = findViewById<ImageView>(R.id.imageView4)
        var but2 = findViewById<ImageView>(R.id.imageView3)
        var but3 = findViewById<ImageView>(R.id.imageView5)
        var but4 = findViewById<ImageView>(R.id.imageView6)
        var but5 = findViewById<ImageView>(R.id.imageView7)
        var but6 = findViewById<ImageView>(R.id.imageView8)
        var but7 = findViewById<ImageView>(R.id.imageView9)
        var but8 = findViewById<ImageView>(R.id.imageView10)
        var but9 = findViewById<ImageView>(R.id.imageView17)

        var canvas = Canvas()

        var panel = findViewById<TextView>(R.id.textView)

        butON.setOnClickListener {
            panel.text = ""
            canvas.drawText("robot is on", panel.left.toFloat(), panel.top.toFloat(), Paint())
            println(panel.left.toFloat(), panel.top.toFloat())
        }
    }
}