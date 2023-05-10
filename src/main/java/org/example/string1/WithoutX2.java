package org.example.string1;

/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise
return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String beginning = str;
        String end = "";
        if (str.length() > 2) {
            beginning = str.substring(0, 2);
            end = str.substring(2);
        }
        beginning = beginning.replace("x", "");
        return beginning + end;
    }
}
