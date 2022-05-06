package com.rlogixx.mind

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.rlogixx.mind.Treatment.Fourth


class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val medic=findViewById<ImageView>(R.id.img_medic)
        val stress=findViewById<ImageView>(R.id.img_stress)
        val treatment=findViewById<ImageView>(R.id.img_treatment)
        medic.setOnClickListener {
            val intent= Intent(this,Third::class.java)
            startActivity(intent)
        }
        stress.setOnClickListener {
            val intent2=Intent(this, Question::class.java)
            startActivity(intent2)
        }
        treatment.setOnClickListener {
            val intent=Intent(this,Fourth::class.java)
            startActivity(intent)
        }

    }
}