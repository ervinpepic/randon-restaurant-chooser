package com.ervinpepic.restaurantchooser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist = arrayListOf("Chinese", "German", "Mexican", "American", "Italian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide_button.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodlist.count())
            selectedFoodTxt.text =  foodlist[randomFood]
        }

        addfood_button.setOnClickListener {
            val newFood = addFoodText.text.toString()
            foodlist.add(newFood)
            addFoodText.text.clear()
        }

    }
}
