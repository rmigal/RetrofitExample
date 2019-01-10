package com.geekhub.retrofitexample.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.ScrollingMovementMethod
import com.geekhub.retrofitexample.R
import com.geekhub.retrofitexample.data.repository.Repository
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), MainView {

    private val presenter by lazy {
        MainPresenter(Repository(), this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.movementMethod = ScrollingMovementMethod()

        presenter.fetchWeather("Cherkasy")
    }

    override fun showWeather(weather: String) {
        textView.text = weather
    }
}
