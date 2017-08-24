package com.treebricks.funfacts.model

import java.security.SecureRandom

/**
 * Created by fahim on 8/24/17.
 * Project: FunFacts
 */
class FactColor {
    val colors = arrayListOf<String>(
            "#EF9A9A", "#B39DDB", "#CE93D8", "#90CAF9", "#9FA8DA", "#80DEEA",
            "#81D4FA", "#A5D6A7", "#80CBC4", "#FFE082", "#FFAB91", "#B0BEC5")

    fun randomColor(): String {
        val randomNumber = SecureRandom().nextInt(colors.size)
        return colors[randomNumber]
    }
}