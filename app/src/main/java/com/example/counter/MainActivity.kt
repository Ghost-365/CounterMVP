package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CounterView {
    lateinit var binding: ActivityMainBinding

    private val presenter =Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.fillCounterView(this)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            incrementBtn.setOnClickListener{
            presenter.increment()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }

    }

    override fun showCount(count: Int) {
        binding.counterTv.text = count.toString()
    }

    override fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    override fun showColor(color: Int) {
        binding.counterTv.setTextColor(color)
    }
}