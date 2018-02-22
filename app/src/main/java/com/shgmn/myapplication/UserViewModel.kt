package com.shgmn.myapplication

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    var user: MutableLiveData<User>? = null

    fun getUser() : LiveData<User>? {
        if (user == null) {
            user = MutableLiveData()
            load()
        }
        return user
    }

    private fun load() {
        user?.postValue(User("Hanyu", 23))
    }
}

data class User(val name: String, val age: Int)