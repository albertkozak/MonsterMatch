package com.albertkozak.monstermatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val monsters: List<Monster> = listOf(
        Monster(R.drawable.monster1_head, R.drawable.monster1_body, R.drawable.monster1_feet),
        Monster(R.drawable.monster2_head, R.drawable.monster2_body, R.drawable.monster2_feet),
        Monster(R.drawable.monster3_head, R.drawable.monster3_body, R.drawable.monster3_feet)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shuffleMonsters()

        match_button.setOnClickListener {
            shuffleMonsters()
        }
    }

    private fun shuffleMonsters()
    {
        monster_head_image_view.setImageResource(monsters.random().head)
        monster_body_image_view.setImageResource(monsters.random().body)
        monster_feet_image_view.setImageResource(monsters.random().feet)
    }
}

data class Monster(val head: Int, val body: Int, val feet: Int)
