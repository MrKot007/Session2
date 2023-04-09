package com.example.session2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.session2.databinding.ActivityOnBoardingBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragments: List<Pair<String, Int>> = listOf(
            Pair("Без теории, только практика\n" +
                    "Вы не платите за лекции и теоретический материал, ведь все это можно найти в интернете бесплатно", R.drawable.post1),
            Pair("Без теории, только практика\n" +
                    "Вы не платите за лекции и теоретический материал, ведь все это можно найти в интернете бесплатно", R.drawable.pos2),
            Pair("Обучение онлайн из любой точки мира\n" +
                    "Наше обучение изначально создавалось как дистанционное", R.drawable.pos3)
        )
        binding.next.setOnClickListener {
            if (binding.pager.currentItem == 1) {
                binding.nextText.text = "Начать"
            }
            if (binding.pager.currentItem == 2) {
                startActivity(Intent(this@OnBoardingActivity, SignUpActivity::class.java))
            }
            binding.pager.currentItem += 1
        }
        TabLayoutMediator(binding.dots, binding.pager) { tab: TabLayout.Tab, i: Int ->
        }
        binding.pager.isUserInputEnabled = false
        binding.pager.orientation = ViewPager2.ORIENTATION_VERTICAL
        binding.pager.adapter = BoardingFragmentAdapter(this, fragments)
}


}
