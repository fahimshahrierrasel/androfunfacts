package com.treebricks.funfacts.model

import java.security.SecureRandom

/**
 * Created by fahim on 8/24/17.
 * Project: FunFacts
 */
class FunFact{
    val facts = arrayListOf<String>(
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

    fun randomFact(): String {
        val randomNumber = SecureRandom().nextInt(facts.size)
        return facts[randomNumber]
    }
}