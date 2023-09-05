package com.example.dicemastergame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //https://drive.google.com/drive/folders/1FmtCCEDzdto7NCC_x66BdXLfg-mXxYid?usp=sharing
        Handler().postDelayed({
            val intent = Intent(this@MainActivity, MainPage::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}