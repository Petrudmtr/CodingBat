package org.example.warmup2;

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is
there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String front = "";
        if (str.length() <= 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }

        String result = "";
        for (int i = 1; i <= n; i++) {
            result += front;
        }
        return result;
    }
}
