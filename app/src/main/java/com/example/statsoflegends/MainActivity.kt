package com.example.statsoflegends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    internal lateinit var name: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.summonerName)

    }

    fun goToSummonerInfo(view: View){
        val intent = Intent(this, SummonerInfoActivity::class.java).apply{
            putExtra("summonerName", name.text.toString())
        }
        startActivity(intent)
    }
}