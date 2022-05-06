package com.rlogixx.mind

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.rlogixx.mind.databinding.QuestionBinding
import kotlin.random.Random.Default.nextInt

class Question:AppCompatActivity() {

    private lateinit var binding: QuestionBinding
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = DataBindingUtil.setContentView(this, R.layout.question)
        binding.button3.setOnClickListener {
            binding.question = randomModel()
        }

    }
    private fun randomModel():Model{
        val quote = ArrayList<Model>()
        quote.add(Model("ARe you Felling Not Ok ?"))
        quote.add(Model("ARe you Felling Fever ?"))
        quote.add(Model("Is you Having a Bad day ?"))
        quote.add(Model("Felling Cold Today ?"))
        return quote[nextInt(quote.size)]
    }
}