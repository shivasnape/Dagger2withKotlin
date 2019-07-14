package com.shivasnape.mydagger2

import android.content.Context

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Created by ShivaSnape on 06/07/19.
 */

@Module
class SharedPrefModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideContext(): Context {
        return context
    }

    @Singleton
    @Provides
    fun provideSharedPreferences(): SessionManger {
        return SessionManger(provideContext())
    }
}
