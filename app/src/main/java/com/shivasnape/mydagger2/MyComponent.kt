package com.shivasnape.mydagger2

import javax.inject.Singleton

import dagger.Component

/**
 * Created by ShivaSnape on 06/07/19.
 */

@Singleton
@Component(modules = [SharedPrefModule::class])
interface MyComponent {
    fun inject(activity: MainActivity)
}
