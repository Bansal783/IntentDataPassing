package com.tanu.intentdatapassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class IntentDataPassing2 : AppCompatActivity() {
    lateinit var etname: TextView
    lateinit var etage: TextView
    lateinit var etheight: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_data_passing2)
        var name=intent.getStringExtra("Name")
        var age=intent.getIntExtra("age",0)
        var height=intent.getFloatExtra("Height",0.0f)

        etname=findViewById(R.id.etname)
        etage=findViewById(R.id.etage)
        etheight=findViewById(R.id.etheight)

        etname.setText("your name is $name")
        etage.setText("your age is $age")
        etheight.setText("your height is $height")

        System.out.println("name $name")
        System.out.println("age $age")
        System.out.println("height $height")
    }
}