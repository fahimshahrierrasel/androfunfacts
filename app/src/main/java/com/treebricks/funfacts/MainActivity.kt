package com.treebricks.funfacts

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import com.treebricks.funfacts.model.FactColor
import com.treebricks.funfacts.model.FunFact


class MainActivity : AppCompatActivity() {

    private var factTextView: TextView? = null
    private var factButton: Button? = null
    private var background: View? = null
    private var appWindow: Window? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Model Initialization
        val funFacts = FunFact()
        val factColor = FactColor()

        // View Initialization
        factTextView = findViewById(R.id.fact_textview) as TextView
        factButton = findViewById(R.id.hit_button) as Button
        background = findViewById(R.id.background)
        appWindow = this.window

        // Change the status bar color
        window?.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

        // Get random fact and color from Model
        var backgroundColor = factColor.randomColor()
        var fact = funFacts.randomFact()

        // Updating the View
        updateView(fact, backgroundColor)

        factButton?.setOnClickListener {
            backgroundColor = factColor.randomColor()
            fact = funFacts.randomFact()

            updateView(fact, backgroundColor)
        }
    }

    // Update the View
    private fun updateView(fact: String, color: String){

        window?.statusBarColor = Color.parseColor(color)
        background?.setBackgroundColor(Color.parseColor(color))

        factTextView?.text = fact
    }

}
