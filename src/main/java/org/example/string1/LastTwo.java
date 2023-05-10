package org.example.string1;

/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields
"codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */

public class LastTwo {
    //Make a method to swipe 2 chars string
    public String swipe(String str) {
        return str.substring(str.length() - 1) + str.substring(0, 1);
    }
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.length() == 2) {
            return swipe(str);
        } else {
            String end = str.substring(str.length() - 2);
            return str.substring(0, str.length() - 2) + swipe(end);
        }
    }
}
