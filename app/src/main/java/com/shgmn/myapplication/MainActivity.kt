package com.shgmn.myapplication

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val observer = Observer<User> {
//            Log.d("OLYMPICS", it?.toString())
        }

        val userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        Log.d("OLYMPICS HOGEHOGE", userViewModel.toString())
        Log.d("OLYMPICS", "");
        userViewModel.getUser()?.observe(this, observer)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(DogFragment(), "DOG")
                    .add(TopFragment(), "TOP")
                    .add(BottomFragment(), "BOTTOM")
                    .commit()
        }
    }
}