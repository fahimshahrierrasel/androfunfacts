package com.treebricks.funfacts

import android.graphics.Color
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*
import android.support.v4.content.ContextCompat
import android.view.WindowManager



class MainActivity : AppCompatActivity() {

    var facts = arrayListOf<String>(
        "If you somehow found a way to extract all of the gold from the bubbling core of our lovely little planet, you would be able to cover all of the land in a layer of gold up to your knees.",
        "McDonalds calls frequent buyers of their food \"heavy users\".",
        "The average person spends 6 months of their lifetime waiting on a red light to turn green.",
        "The largest recorded snowflake was in Keogh, MT during year 1887, and was 15 inches wide.",
        "You burn more calories sleeping than you do watching television.",
        "There are more lifeforms living on your skin than there are people on the planet.",
        "Southern sea otters have flaps of skin under their forelegs that act as pockets. When diving, they use these pouches to store rocks and food.",
        "If you believe that you’re truly one in a million, there are still approximately 7,184 more people out there just like you.",
        "A single cloud can weight more than 1 million pounds.",
        "The average person walks the equivalent of three times around the world in a lifetime.",
        "A coyote can hear a mouse moving underneath a foot of snow.",
        "Earth has traveled more than 5,000 miles in the past 5 minutes.",
        "A broken clock is right two times every day.",
        "Chewing gum while you cut an onion will help keep you from crying.",
        "95% of people text things they could never say in person.",
        "Guinness Book of Records holds the record for being the book most often stolen from Public Libraries.",
        "More people are allergic to cow’s milk than any other food.",
        "Coconut water can be used as blood plasma.",
        "Human thigh bones are stronger than concrete.",
        "Cockroaches can live for several weeks with their heads cut off, because their brains are located inside their body. They would eventually die from being unable to eat.",
        "To produce a single pound of honey, a single bee would have to visit 2 million flowers.",
        "Our eyes are always the same size from birth, but our nose and ears never stop growing.",
        "You are 1% shorter in the evening than in the morning",
        "The elephant is the only mammal that can’t jump!",
        "The tongue is the strongest muscle in the body.",
        "Birds don’t urinate."
    )

    var colors = arrayListOf<String>(
            "#EF9A9A", "#B39DDB", "#CE93D8", "#90CAF9", "#9FA8DA", "#80DEEA", "#81D4FA", "#A5D6A7", "#80CBC4", "#FFE082", "#FFAB91", "#B0BEC5"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factview = findViewById(R.id.factview) as TextView
        val factButton = findViewById(R.id.hit_button) as Button
        val background = findViewById(R.id.background)
        val window = this.getWindow()

        // Change the status bar color
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

        window.setStatusBarColor(Color.parseColor("#C5E1A5"))
        background.setBackgroundColor(Color.parseColor("#C5E1A5"))
        factButton.setBackgroundColor(Color.parseColor("#C5E1A5"))

        factButton.setOnClickListener { view ->
            val backgroundColor = colors[Random().nextInt(colors.size)]

            background.setBackgroundColor(Color.parseColor(backgroundColor))
            window.setStatusBarColor(Color.parseColor(backgroundColor))
            factButton.setBackgroundColor(Color.parseColor(backgroundColor))

            factview.text = facts[Random().nextInt(facts.size)]
        }
    }

}
