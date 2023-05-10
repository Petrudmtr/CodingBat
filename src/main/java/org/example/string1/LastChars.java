package org.example.string1;

/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java"
yields "ya". If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
 */

public class LastChars {
    public String lastChars(String a, String b) {
        String beginning;
        String end;
        if (a.isEmpty()) {
            beginning = "@";
        } else {
            beginning = a.substring(0, 1);
        }
        if (b.isEmpty()) {
            end = "@";
        } else {
            end = b.substring(b.length() - 1);
        }
        return beginning + end;
    }
}
