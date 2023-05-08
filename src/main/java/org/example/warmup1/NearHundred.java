package org.example.warmup1;

/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a
number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */

public class NearHundred {
    public boolean nearHundred(int n) {
        int absDiff100 = Math.abs(n - 100);
        int absDiff200 = Math.abs(n - 200);
        return (absDiff100 <= 10 || absDiff200 <= 10);
    }
}
