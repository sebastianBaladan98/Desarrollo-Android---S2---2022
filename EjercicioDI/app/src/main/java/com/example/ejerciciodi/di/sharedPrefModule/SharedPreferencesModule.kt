package com.example.ejerciciodi.di.sharedPrefModule

import android.content.SharedPreferences
import androidx.core.content.edit
import com.example.ejerciciodi.model.MonstersItem
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val sharedPrefModule = module {
    singleOf(::favMonster)
}

fun favMonster(preferences: SharedPreferences, obj: MonstersItem, status: Boolean) {
    preferences.edit {
        if (status) {
            this.putInt(obj.id.toString(), obj.id)
        } else {
            this.remove(obj.id.toString())
        }
        this.apply()
    }
}