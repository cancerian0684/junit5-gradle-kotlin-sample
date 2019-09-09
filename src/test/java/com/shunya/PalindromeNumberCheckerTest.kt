package com.shunya

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PalindromeNumberCheckerTest {

    @Test
    fun `check a palindrome number`() {
        val checker = PalindromeNumberChecker()
        assertEquals(true, checker.isPalindrome(1001))
    }

    @Test
    fun `check a non-palindrome number`() {
        val checker = PalindromeNumberChecker()
        assertEquals(false, checker.isPalindrome(12))
    }

    @Test
    fun `check if zero is palindrome`() {
        val checker = PalindromeNumberChecker()
        assertEquals(true, checker.isPalindrome(0))
    }

    @Test
    fun `check negative numbers`() {
        val checker = PalindromeNumberChecker()
        val exception = assertThrows<AssertionError> {
            checker.isPalindrome(-100)
        }
        assertEquals("input must be positive number", exception.message)
    }
}
