package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity()
{
    lateinit var rollImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button =  findViewById(R.id.rollButton);
        rollImage = findViewById(R.id.rollImage)
        rollButton.setOnClickListener()
        {
            rollDice();
        }
    }

    private fun rollDice()
    {
        val image = when(Random().nextInt(6) + 1)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        rollImage.setImageResource(image)
    }
}