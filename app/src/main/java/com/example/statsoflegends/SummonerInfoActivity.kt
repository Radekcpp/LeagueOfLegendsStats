package com.example.statsoflegends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SummonerInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summoner_info)
        intent.getStringExtra("summonerName")
    }
}