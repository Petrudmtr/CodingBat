package org.example.string1;

/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */

public class WithoutX {
    public String withoutX(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String mid;
        String beginning;
        String end;
        if (str.length() == 1) {
            mid = "";
        } else {
            mid = str.substring(1, str.length() - 1);
        }
        if (str.startsWith("x")) {
            beginning = "";
        } else {
            beginning = str.substring(0, 1);
        }
        if (str.endsWith("x")) {
            end = "";
        } else {
            end = str.substring(str.length() - 1);
        }
        return beginning + mid + end;
    }
}
