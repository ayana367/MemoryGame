package com.example.memorygame.presentation.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memorygame.R
import com.example.memorygame.databinding.ActivityMainBinding
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class MainActivity : AppCompatActivity() {

    private lateinit var ui : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
        initialize()
    }

    private fun initialize() {
        ui.btn.setOnClickListener {
            ui.konfeti.build().addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
            .setDirection(0.0,359.0)
                .setSpeed(1f,5f)
            .setFadeOutEnabled(true)
                .setTimeToLive(3000L)
            .addShapes(Shape.Square, Shape.Circle)
                .addSizes(Size(12))
            .setPosition(-50f,ui.konfeti.width + 50f,-50f,50f)
                .streamFor(300,3000L)
        }
        ui.rvMain.adapter = EmojiAdapter()
    }
}

