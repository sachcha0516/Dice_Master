package com.example.dicemastergame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        supportActionBar?.hide()
        val newgamebtn = findViewById<Button>(R.id.newgamebtn)
        newgamebtn.setOnClickListener {
            val start = Intent(this,SettingPage::class.java)
            startActivity(start)}

        val aboutbtn = findViewById<Button>(R.id.aboutbtn)
        aboutbtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("20210013-Sachintha Sasanjaya")
            builder.setMessage("I confirm that I understand what plagiarism is and have read and" +
                    "     understood the section on Assessment Offences in the Essential" +
                    " Information for Students.  The work that I have submitted is" +
                    " entirely my own. Any work from other authors is duly referenced" +
                    " and acknowledged.")
            builder.setPositiveButton("OK", null)
            val dialog = builder.create()
            dialog.show()
        }

    }
}