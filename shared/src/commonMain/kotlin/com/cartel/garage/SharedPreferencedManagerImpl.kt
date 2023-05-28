package com.cartel.garage


expect class SharedPreferencesManagerImpl {
    fun getString(key: String, defaultValue: String?): String?
    fun putString(key: String, value: String?)
}

class SPUsage(private val sharedPreferencesManager: SharedPreferencesManagerImpl) {
    fun get_login(): String? {
        // Get value from SharedPreferences
        return sharedPreferencesManager.getString("login", "")
    }
    fun set_login(value:String){
        sharedPreferencesManager.putString("login", value)
    }
    fun get_password(): String? {
        return sharedPreferencesManager.getString("password", "")
    }
    fun set_password(value: String){
        sharedPreferencesManager.putString("password", value)
    }

}