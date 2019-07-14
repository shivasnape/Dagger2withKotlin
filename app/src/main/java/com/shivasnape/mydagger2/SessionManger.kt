package com.shivasnape.mydagger2

import android.content.Context
import android.content.SharedPreferences

open class SessionManger(context: Context) {

     var sharedPreferences: SharedPreferences
     var editor: SharedPreferences.Editor

    init {
        sharedPreferences = context.getSharedPreferences("TESt", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()
    }

    var data: String
        get() = sharedPreferences.getString("test", "")
        set(data) {
            editor.putString("test", data)
            editor.apply()
        }
}
