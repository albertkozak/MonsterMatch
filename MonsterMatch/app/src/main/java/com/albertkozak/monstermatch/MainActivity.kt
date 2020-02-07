package com.albertkozak.monstermatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val heads: List<Int> = listOf(
        R.drawable.monster1_head,
        R.drawable.monster2_head,
        R.drawable.monster3_head)

    private val bodies: List<Int> = listOf(
        R.drawable.monster1_body,
        R.drawable.monster2_body,
        R.drawable.monster3_body)

    private val feet: List<Int> = listOf(
        R.drawable.monster1_feet,
        R.drawable.monster2_feet,
        R.drawable.monster3_feet)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shuffleMonsters()

        match_button.setOnClickListener {
            shuffleMonsters()
        }
//        monster_head_image_view.setImageResource(R.drawable.monster1_head)
    }

    private fun shuffleMonsters()
    {
        monster_head_image_view.setImageResource(heads.random())
        monster_body_image_view.setImageResource(bodies.random())
        monster_feet_image_view.setImageResource(feet.random())
    }
}
