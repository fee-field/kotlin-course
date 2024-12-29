package com.feefield.kotlincourse.classWork.lesson032

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Test

internal class TextToPhoneTest {

    @ParameterizedTest
    @MethodSource(("providePhoneNumbers"))
    fun `check convertation`(
        phoneNumber: String,
        expected: String
    ) {
        val actual = textToPhone(phoneNumber)
        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun providePhoneNumbers() = listOf(
            arrayOf("+7 (123) 456-78-90", "+7 (123) 456-78-90"),
            arrayOf("+8 (123) 456-78-90", "+8 (123) 456-78-90"),
//            arrayOf("7(123)4567890", "+7 (123) 456-78-90")
        )
    }

}
