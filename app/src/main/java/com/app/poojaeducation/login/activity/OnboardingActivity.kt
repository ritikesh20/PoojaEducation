package com.app.poojaeducation.login.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.poojaeducation.R
import com.app.poojaeducation.databinding.ActivityOnboardingBinding
import com.app.poojaeducation.utilities.Functions.openActivity

class OnboardingActivity : AppCompatActivity() {

    private var clickCount = 0
    private val binding: ActivityOnboardingBinding by lazy {
        ActivityOnboardingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setOnboardingScreen(0)

        binding.btnNext.setOnClickListener {
            clickCount++
            setOnboardingScreen(clickCount)
        }
    }

    private fun setOnboardingScreen(step: Int) {
        when (step) {

            0 -> {
                binding.ivOnboardingScreenImage.setImageResource(R.drawable.onboaringtwo)
                binding.tvTittleOnboardingOne.text = getString(R.string.tittleTvOnBoardingOne)
                binding.tvDescriptionOnboardingOne.text = getString(R.string.desTvOnBoardingOne)
            }

            1 -> {
                binding.ivOnboardingScreenImage.setImageResource(R.drawable.onboaringtwo)
                binding.tvTittleOnboardingOne.text = getString(R.string.tittleTvOnBoardingTwo)
                binding.tvDescriptionOnboardingOne.text = getString(R.string.desTvOnBoardingTwo)
            }

            2 -> {
                binding.ivOnboardingScreenImage.setImageResource(R.drawable.onboaringthree)
                binding.tvTittleOnboardingOne.text = getString(R.string.tittleTvOnBoardingThree)
                binding.tvDescriptionOnboardingOne.text = getString(R.string.desTvOnBoardingThree)
            }

            3 -> {
                openActivity<LoginActivity>()
                finish()
            }
        }
    }
}

