package com.tanu.intentdatapassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.time.Instant

 class MainActivity() : AppCompatActivity(){
     private lateinit var etname: TextView
     private lateinit var etage: TextView
     private lateinit var etheight: TextView
     private lateinit var btnNext: Button
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
         etname = findViewById(R.id.etname)
         etage = findViewById(R.id.etage)
         etheight = findViewById(R.id.etheight)
         btnNext = findViewById(R.id.btnNext)

         btnNext.setOnClickListener {
             if (etname.text.toString().isNullOrEmpty()) {
                 etname.error = "Enter your name"
             } else if (etage.text.toString().isNullOrEmpty()) {
                 etage.error = "Enter your age"
             } else if (etheight.text.toString().isNullOrEmpty()) {
                 etheight.error = "Enter your height"
             } else {
                 Toast.makeText(this, "click on next", Toast.LENGTH_SHORT).show()
                 var intent = Intent(this, IntentDataPassing2::class.java)
                 intent.putExtra("Name", etname.text.toString())
                 intent.putExtra("Age", etage.text.toString())
                 intent.putExtra("Height", etheight.text.toString())
                 startActivity(intent)
                 finish()
             }
         }
     }

 }