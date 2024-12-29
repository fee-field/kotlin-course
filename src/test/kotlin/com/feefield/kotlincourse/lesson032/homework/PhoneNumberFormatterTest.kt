package com.feefield.kotlincourse.lesson032.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.assertThrows

class PhoneNumberFormatterTest {

    private val phoneNumberFormatter = PhoneNumberFormatter()

    @ParameterizedTest
    @MethodSource("provideValidPhoneNumber")
    fun `check if digits are valid after fun triggered`(phoneNumber: String, expectedNumber: String) {
        val actualNumber = phoneNumberFormatter.formatPhoneNumber(phoneNumber)
        assertEquals(expectedNumber, actualNumber)
    }

    @ParameterizedTest
    @MethodSource("provideInvalidPhoneNumber")
    fun `check if exception is thrown`(phoneNumber: String) {
        assertThrows<IllegalArgumentException> {
            phoneNumberFormatter.formatPhoneNumber(phoneNumber)
        }
    }


    companion object {
        @JvmStatic
        fun provideValidPhoneNumber() = listOf(
            Arguments.of("8 (922) 941-11-11", "+7 (922) 941-11-11"),
            Arguments.of("79229411111", "+7 (922) 941-11-11"),
            Arguments.of("+7 922 941 11 11", "+7 (922) 941-11-11"),
            Arguments.of("9229411111", "+7 (922) 941-11-11"),
            Arguments.of("abc +7 922 941 11 11", "+7 (922) 941-11-11"),
        )

        @JvmStatic
        fun provideInvalidPhoneNumber() = listOf(
            Arguments.of("123"),
            Arguments.of("letters")
        )
    }
}