package com.codingwithme.notesapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.codingwithme.notesapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val gm = AnimationUtils.loadAnimation(this, R.anim.gm);
        val btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        val note = binding.tvNameLogo
        val judul = binding.tvNameLogo
        val desc = binding.tvNameDescLogo
        val tim = binding.tvByTim

        note.startAnimation(gm)
        judul.startAnimation(btt)
        desc.startAnimation(btt)
        tim.startAnimation(btt)

        Handler(Looper.getMainLooper()).postDelayed(    {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2000)
    }
}