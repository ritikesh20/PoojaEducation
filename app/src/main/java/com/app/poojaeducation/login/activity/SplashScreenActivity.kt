package com.app.poojaeducation.login.activity

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.app.poojaeducation.databinding.ActivitySplashScreenBinding
import com.app.poojaeducation.utilities.Functions.openActivity

class SplashScreenActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)

        setContentView(binding.root)


        Handler(Looper.getMainLooper()).postDelayed({
            openActivity<OnboardingActivity>()
            finish()
        }, 1500)

    }


}