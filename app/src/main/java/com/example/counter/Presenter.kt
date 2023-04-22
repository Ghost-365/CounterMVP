package com.example.counter

import android.graphics.Color

class Presenter {

    var model = Model()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.showCount(model.count)

        if (model.count == 10) {
            view.showToast("Поздравляем!")
        }
        if (model.count == 15)
            view.showColor(Color.GREEN)
    }

    fun decrement() {
        model.decrement()
        view.showCount(model.count)
    }

    fun fillCounterView(counterView: CounterView){
        this.view = counterView
    }
}