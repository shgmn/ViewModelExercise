package com.shgmn.myapplication

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log

/**
 * Created by tshigemo on 2018/02/22.
 */
class DogFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val userA = ViewModelProviders.of(this).get(UserViewModel::class.java)
        Log.d("OLYMPICS userA", userA.toString())
        val userB = ViewModelProviders.of(activity!!).get(UserViewModel::class.java)
        Log.d("OLYMPICS userB", userB.toString())
        val userC = ViewModelProviders.of(this).get(UserViewModel::class.java)
        Log.d("OLYMPICS userC", userC.toString())
        Log.d("OLYMPICS", "");
    }
}

class TopFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val user = ViewModelProviders.of(this).get(UserViewModel::class.java)
        Log.d("OLYMPICS TopFragment", user.toString())
        Log.d("OLYMPICS", "");
    }
}

class BottomFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val user = ViewModelProviders.of(this).get(UserViewModel::class.java)
        Log.d("OLYMPICS BottomFragment", user.toString())
        Log.d("OLYMPICS", "");
    }
}