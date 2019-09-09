package com.shunya;

public class PalindromeChecker {

    public boolean isPalindrome2(String input) {
        if(input == null) {
            throw new IllegalArgumentException("must be supplied a valid input string");
        }
        int head = 0;
        int tail = input.length() - 1;
        while (head < tail) {
            if (input.charAt(head) != input.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

    public boolean isPalindrome(String input) {
        if(input == null) {
            throw new IllegalArgumentException("must be supplied a valid input string");
        }
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if ( input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
