package com.app.poojaeducation.login.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.poojaeducation.R
import com.app.poojaeducation.databinding.ActivityCompleteProfileStep1Binding
import com.app.poojaeducation.utilities.Functions.openActivity
import com.app.poojaeducation.utilities.Functions.setMyText
import com.app.poojaeducation.utilities.Functions.stepBackGroundColor

class CompleteProfileStep1 : AppCompatActivity() {

    private lateinit var binding: ActivityCompleteProfileStep1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCompleteProfileStep1Binding.inflate(layoutInflater)

        setContentView(binding.root)


        initClickListener()
        initViews()
    }

    private fun initClickListener() {

        binding.llHeaderStep1.ivBack.visibility = View.GONE

        binding.btnCompletedProfileStep1.setOnClickListener {
            openActivity<CompleteProfileStep2>()
        }

    }


    private fun initViews() {

        setMyText(binding.llHeaderStep1.tvStepCount, getString(R.string.step1))
        setMyText(binding.llHeaderStep1.tvName, getString(R.string.personalDetails))

        stepBackGroundColor(binding.llHeaderStep1.viewStep1)

    }
}