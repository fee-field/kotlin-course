package com.feefield.kotlincourse.classworks

val name: String = "Alice"

var age: Int = 30

const val PI = 3.14

lateinit var userInfo: String

val lazyValue: String by lazy {
    "text"
}

var speed: Double = 5.0
var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value > 0) { field = value }
    }



