package com.app.poojaeducation.login.activity

import android.app.Activity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.poojaeducation.databinding.ActivityOtpVerificationBinding
import com.app.poojaeducation.utilities.Constants
import com.app.poojaeducation.utilities.Functions
import com.app.poojaeducation.utilities.Functions.openActivity

class OtpVerificationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtpVerificationBinding

    var activity: Activity? = null
    private var otpText: String = ""
    private var countDownTimer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOtpVerificationBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setTimer(Constants.RESEND_OTP_TIME)
        initClickListener()

    }

    fun initClickListener() {

        binding.btnVerify.setOnClickListener {
            openActivity<CompleteProfileStep1>()
        }

    }

    private fun setTimer(time: Long) {

        countDownTimer = object : CountDownTimer(time, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                if (activity != null) {
                    binding.tvTime.text =
                        Functions.formatSeconds(millisUntilFinished.toInt() / 1000) + "s"
                }
            }

            override fun onFinish() {
                binding.tvTime.visibility = View.GONE
                binding.tvResend.visibility = View.VISIBLE
            }
        }.start()
    }


}