package com.app.poojaeducation.login.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.poojaeducation.R
import com.app.poojaeducation.databinding.ActivityCompleteProfileStep3Binding
import com.app.poojaeducation.utilities.Functions.openActivity
import com.app.poojaeducation.utilities.Functions.setMyText
import com.app.poojaeducation.utilities.Functions.stepBackGroundColor

class CompleteProfileStep3 : AppCompatActivity() {
    private lateinit var binding: ActivityCompleteProfileStep3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCompleteProfileStep3Binding.inflate(layoutInflater)

        setContentView(binding.root)

        initViews()
        initClickListener()

    }

    private fun initClickListener() {

        binding.btnCompletedProfileStep3.setOnClickListener {
            openActivity<CompleteProfileStep4>()
        }

    }

    private fun initViews() {
        setToolbar()
    }

    private fun setToolbar() {

        setMyText(binding.llHeaderStep3.tvStepCount, getString(R.string.step3))
        setMyText(binding.llHeaderStep3.tvName, getString(R.string.entranceExamInformation))

        stepBackGroundColor(binding.llHeaderStep3.viewStep1)
        stepBackGroundColor(binding.llHeaderStep3.viewStep2)
        stepBackGroundColor(binding.llHeaderStep3.viewStep3)

    }


}