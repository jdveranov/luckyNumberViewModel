package com.example.viewmodelluckynumber

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val luckyNumber: MutableLiveData<String> = MutableLiveData()

    fun onBtnRollPressed() {
        val randomNumber : Double = Math.random() ///
        val randomNumberFrom0to100 : Int = (randomNumber * 100).toInt()
        luckyNumber.value = randomNumberFrom0to100.toString()
    }


    override fun onCleared() {
        super.onCleared()
    }
}