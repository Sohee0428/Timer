package com.example.aop_part2_chapter06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val minutesTxt: TextView by lazy {
        findViewById(R.id.minutesTxt)
    }

    private val secondsTxt: TextView by lazy {
        findViewById(R.id.secondsTxt)
    }

    private val seekBar: SeekBar by lazy {
        findViewById(R.id.seekBar)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}