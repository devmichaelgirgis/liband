package com.libandexample.courses.udemy.kotlin.findmyage

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.libandexample.R
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

    }


    @SuppressLint("OnClick")
    protected fun BuClickEvent(view: View) {

        // fire click button
//        val userDOB: String = etDOB.text.toString()
        val year: Int = Calendar.getInstance().get(Calendar.YEAR)
//        val myAge = year - userDOB.toInt()
//        tvShowAge.setText("Your age is " + myAge)
    }

}
