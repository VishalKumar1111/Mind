package com.rlogixx.mind

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.rlogixx.mind.databinding.QuestionBinding

class Question:AppCompatActivity() {

        private lateinit var binding: QuestionBinding
      override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding=DataBindingUtil.setContentView(this,R.layout.question)
       val post=Post("help")
       binding.post=post

    }
}