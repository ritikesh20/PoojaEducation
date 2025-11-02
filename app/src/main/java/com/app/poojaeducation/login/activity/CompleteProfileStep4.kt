package com.app.poojaeducation.login.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.poojaeducation.R
import com.app.poojaeducation.databinding.ActivityCompleteProfileStep4Binding
import com.app.poojaeducation.utilities.Functions.openActivity
import com.app.poojaeducation.utilities.Functions.setMyText
import com.app.poojaeducation.utilities.Functions.stepBackGroundColor

class CompleteProfileStep4 : AppCompatActivity() {

    private lateinit var binding: ActivityCompleteProfileStep4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCompleteProfileStep4Binding.inflate(layoutInflater)

        setContentView(binding.root)

        initViews()
        initClickListener()


    }


    private fun initClickListener() {

        binding.btnCompletedProfileStep4.setOnClickListener {
            openActivity<CompleteProfileStep5>()
        }


    }

    private fun initViews() {
        setToolbar()
    }

    private fun setToolbar() {

        setMyText(binding.llHeaderStep3.tvStepCount, getString(R.string.step4))
        setMyText(binding.llHeaderStep3.tvName, getString(R.string.Skills_Interests))

        stepBackGroundColor(binding.llHeaderStep3.viewStep1)
        stepBackGroundColor(binding.llHeaderStep3.viewStep2)
        stepBackGroundColor(binding.llHeaderStep3.viewStep3)
        stepBackGroundColor(binding.llHeaderStep3.viewStep4)


    }


}