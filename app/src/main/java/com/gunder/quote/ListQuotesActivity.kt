package com.gunder.quote

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gunder.quote.databinding.ActivityListQuotesBinding

class ListQuotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListQuotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
    }
}