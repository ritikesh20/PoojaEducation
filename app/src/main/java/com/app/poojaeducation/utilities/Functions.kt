package com.app.poojaeducation.utilities

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.TextView
import com.app.poojaeducation.R

object Functions {

    fun showView(view: View?) {
        if (view != null) {
            view.visibility = View.VISIBLE
        }
    }

    fun hideView(view: View?) {
        if (view != null) {
            view.visibility = View.GONE
        }
    }

    inline fun <reified T : Activity> Context.openActivity(block: Intent.() -> Unit = {}) {
        startActivity(Intent(this, T::class.java).apply(block))
    }

    fun setMyText(tvMobile: TextView, text: String) {
        tvMobile.text = text
    }


    fun stepBackGroundColor(viewStep: View) {
        viewStep.setBackgroundResource(R.drawable.btn_green_rounded)
    }

    fun formatSeconds(timeInSeconds: Int): String {
        val hours = timeInSeconds / 3600
        val secondsLeft = timeInSeconds - hours * 3600
        val minutes = secondsLeft / 60
        val seconds = secondsLeft - minutes * 60

        var formattedTime = ""

        if (seconds < 10) formattedTime += "0"
        formattedTime += seconds

        return formattedTime

    }


}