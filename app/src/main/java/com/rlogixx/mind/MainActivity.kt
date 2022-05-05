package com.rlogixx.mind

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(android.R.color.holo_green_dark)))

        val button=findViewById<FloatingActionButton>(R.id.button)

        button?.setOnClickListener {
            val intent= Intent(this,Second::class.java)
            startActivity(intent)
        }

        val imageSlider =findViewById<ImageSlider>(R.id.image_slider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.one,"Helping you To fight your Depression"))
        imageList.add(SlideModel(R.drawable.two,"Helping you To fight your Depression"))
        imageList.add(SlideModel(R.drawable.three,"Helping you To fight your Depression"))

        imageSlider?.setImageList(imageList, ScaleTypes.FIT)

    }


}
