package org.example.warmup2;

/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not
be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */

public class StringX {
    public String stringX(String str) {
        if (str.length() <= 2) {
            return str;
        }
        String subStr = str.substring(1, str.length() - 1);
        return (str.charAt(0) + subStr.replace("x", "") + str.charAt(str.length() - 1));
    }
}
