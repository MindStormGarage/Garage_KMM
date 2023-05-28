package com.cartel.garage

import platform.Foundation.NSUserDefaults

actual class SharedPreferencesManagerImpl {
    actual fun getString(key: String, defaultValue: String?): String? {
        val defaults = NSUserDefaults.standardUserDefaults()
        return defaults.stringForKey(key) ?: defaultValue
    }

    actual fun putString(key: String, value: String?) {
        val defaults = NSUserDefaults.standardUserDefaults()
        defaults.setObject(value, key)
    }
}
