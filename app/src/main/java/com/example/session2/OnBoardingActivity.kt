package com.example.session2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.session2.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.next.setOnClickListener {
            if (binding.pager.currentItem == 1) {
                binding.nextText.text = "Начать"
            }
            if (binding.pager.currentItem == 2) {
                startActivity(Intent(this@OnBoardingActivity, SignUpActivity::class.java))
            }
            binding.pager.currentItem += 1
        }
        
    }
}