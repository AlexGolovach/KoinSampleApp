package com.example.android.myproject.utils

import java.util.*

object IdGenerator {

    fun generateId(): String {
        val uuid = UUID.randomUUID()
        var str = uuid.toString()
        val uid = str.hashCode()
        val filterStr = uid.toString()
        str = filterStr.replace("-".toRegex(), "")

        return str
    }
}