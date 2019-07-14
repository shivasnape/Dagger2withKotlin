package com.shivasnape.mydagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var myComponent: MyComponent
    @Inject
    lateinit var sessionManger: SessionManger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myComponent = DaggerMyComponent.builder().sharedPrefModule(SharedPrefModule(this)).build()
        myComponent!!.inject(this)


        sessionManger!!.data = "Shiva Snape"

        Log.e("TAG", sessionManger!!.data)
    }

}
