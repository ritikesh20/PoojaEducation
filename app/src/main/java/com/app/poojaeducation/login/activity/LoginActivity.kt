package com.app.poojaeducation.login.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import com.app.poojaeducation.R
import com.app.poojaeducation.databinding.ActivityLoginBinding
import com.app.poojaeducation.utilities.Functions.hideView
import com.app.poojaeducation.utilities.Functions.openActivity
import com.app.poojaeducation.utilities.Functions.setMyText
import com.app.poojaeducation.utilities.Functions.showView

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initClickListener()




    }

    private fun initClickListener() {

        binding.etMobileNo.addTextChangedListener { text ->
            val colorRes = if (text?.length == 10) {
                R.color.green_198754   // Active color
            } else {
                R.color.green_8CC3AA    // Inactive color
            }

            binding.btnLogin.backgroundTintList =
                ContextCompat.getColorStateList(this, colorRes)
        }


        binding.btnStudentCollege.btnStudent.setOnClickListener {
            binding.btnStudentCollege.btnStudent.strokeColor =
                ContextCompat.getColor(this, R.color.green_198754)
            binding.btnStudentCollege.btnCollege.strokeColor =
                ContextCompat.getColor(this, R.color.lightYellow_FFFBF0)
        }


        binding.btnStudentCollege.btnCollege.setOnClickListener {
            binding.btnStudentCollege.btnCollege.strokeColor =
                ContextCompat.getColor(this, R.color.yellow_FFC105)
            binding.btnStudentCollege.btnStudent.strokeColor =
                ContextCompat.getColor(this, R.color.lightGreen_E9FFF5)
        }

        binding.btnLogin.setOnClickListener {
            openActivity<OtpVerificationActivity>()
        }


        binding.tvUseEmail.setOnClickListener {

            hideView(binding.llEtMobileNo)
            setMyText(binding.tvMobile, "Email")
            setMyText(binding.tvLoginType, getString(R.string.EnterYourEmailAddress))
            setMyText(binding.tvLoginWithMobile, getString(R.string.EnterYourEmailAddressForLogin))
            showView(binding.llEtEmailId)
            hideView(binding.tvUseEmail)
            showView(binding.tvUseMobile)

        }

        binding.tvUseMobile.setOnClickListener {
            showView(binding.llEtMobileNo)
            hideView(binding.llEtEmailId)
            setMyText(binding.tvMobile, "Mobile Number")
            setMyText(binding.tvLoginType, getString(R.string.mobile_number))
            setMyText(binding.tvLoginWithMobile, getString(R.string.mobile_number_login))
            showView(binding.tvUseEmail)
            hideView(binding.tvUseMobile)
        }

        binding.tvErrorType.visibility = View.VISIBLE

    }
}


