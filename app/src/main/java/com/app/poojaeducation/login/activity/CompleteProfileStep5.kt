package com.app.poojaeducation.login.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.poojaeducation.R
import com.app.poojaeducation.databinding.ActivityCompleteProfileStep5Binding
import com.app.poojaeducation.utilities.Functions.setMyText
import com.app.poojaeducation.utilities.Functions.stepBackGroundColor

class CompleteProfileStep5 : AppCompatActivity() {

    private lateinit var binding: ActivityCompleteProfileStep5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCompleteProfileStep5Binding.inflate(layoutInflater)

        setContentView(binding.root)

        initClickListener()
        initViews()

    }

    private fun initClickListener() {

        binding.btnCompletedProfileStep4.setOnClickListener {

        }

    }

    private fun initViews() {
        setToolbar()
    }

    private fun setToolbar() {

        setMyText(binding.llHeaderStep3.tvStepCount, getString(R.string.step5))
        setMyText(binding.llHeaderStep3.tvName, getString(R.string.locationPreferences))

        stepBackGroundColor(binding.llHeaderStep3.viewStep1)
        stepBackGroundColor(binding.llHeaderStep3.viewStep2)
        stepBackGroundColor(binding.llHeaderStep3.viewStep3)
        stepBackGroundColor(binding.llHeaderStep3.viewStep4)
        stepBackGroundColor(binding.llHeaderStep3.viewStep5)


    }

}