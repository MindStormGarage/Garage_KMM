package com.cartel.garage

// Garage.shared.androidMain/SharedPreferencesManagerImpl.kt

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

actual class SharedPreferencesManagerImpl(private val context: Context) {
    private val sharedPreferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    actual fun getString(key: String, defaultValue: String?): String? {
        return sharedPreferences.getString(key, defaultValue)
    }

    actual fun putString(key: String, value: String?) {
        sharedPreferences.edit().putString(key, value).apply()
    }
}
