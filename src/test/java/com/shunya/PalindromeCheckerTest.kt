package com.shunya

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PalindromeCheckerTest {

    @Test
    fun `check a palindrome string`() {
        val checker = PalindromeChecker()
        assertEquals(true, checker.isPalindrome("madam"))
    }

    @Test
    fun `check a non-palindrome string`() {
        val checker = PalindromeChecker()
        assertEquals(false, checker.isPalindrome("namste"))
    }

    @Test
    fun `check null input for palindrome`() {
        val checker = PalindromeChecker()
        val exception = assertThrows<IllegalArgumentException> {
            checker.isPalindrome(null)
        }
        assertEquals("must be supplied a valid input string", exception.message)
    }

    @ParameterizedTest(name = "{0} = {1}")
    @CsvSource(
        "madam,   true",
        "racecar, true",
        "108012,  false",
        "hello,   false"
    )
    fun `csv palindrome checker`(first: String, expectedResult: Boolean) {
        val calculator = PalindromeChecker()
        assertEquals(expectedResult, calculator.isPalindrome(first)) {
            if (expectedResult) {
                "$first is not a palidrome"
            } else {
                "$first is a palidrome"
            }
        }
    }
}
