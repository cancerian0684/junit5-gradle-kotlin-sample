package com.shunya

class PalindromeNumberChecker {

    fun isPalindrome(input: Int): Boolean {
        assert(input >= 0) {
            "input must be positive number"
        }
        val reversed = reverse(input)
        return input == reversed
    }

    private fun reverse(input: Int): Int {
        var lastDigit: Int
        var sum = 0
        var temp: Int = input
        while (temp > 0) {
            lastDigit = temp % 10
            sum = sum * 10 + lastDigit
            temp /= 10
        }
        return sum
    }
}
