package com.adoranwodo.play

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_game.setOnClickListener { goToCategoriesPage() }

    }

    private fun goToCategoriesPage(){
        val intent = Intent(applicationContext, CategoriesActivity::class.java)
        startActivity(intent)
    }

}
