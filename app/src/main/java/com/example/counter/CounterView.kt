package com.example.counter

interface CounterView {
    fun showCount(count: Int)
    fun showToast(message: String)
    fun showColor(color: Int)
}