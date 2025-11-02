package com.app.poojaeducation.login.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.poojaeducation.R
import com.app.poojaeducation.databinding.ActivityCompleteProfileStep2Binding
import com.app.poojaeducation.utilities.Functions.openActivity
import com.app.poojaeducation.utilities.Functions.setMyText
import com.app.poojaeducation.utilities.Functions.stepBackGroundColor

class CompleteProfileStep2 : AppCompatActivity() {

    private lateinit var binding: ActivityCompleteProfileStep2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCompleteProfileStep2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        initViews()
        initClickListener()

    }

    private fun initClickListener() {

        binding.btnCompletedProfileStep2.setOnClickListener {
            openActivity<CompleteProfileStep3>()
        }

    }

    private fun initViews() {

        setToolbar()
    }

    private fun setToolbar() {

        setMyText(binding.llHeaderStep2.tvStepCount, getString(R.string.step2))
        setMyText(binding.llHeaderStep2.tvName, getString(R.string.educationalBackground))

        stepBackGroundColor(binding.llHeaderStep2.viewStep1)
        stepBackGroundColor(binding.llHeaderStep2.viewStep2)

    }

}