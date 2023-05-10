package org.example.string1;

/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will
be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */

public class ExtraEnd {
    //Make a method to triple a string
    public String triple(String str) {
        return str + str + str;
    }

    //Make a method to return the last 2 chars of the string
    public String lastTwo(String str) {
        return str.substring(str.length() - 2);
    }

    public String extraEnd(String str) {
        return triple(lastTwo(str));
    }
}
