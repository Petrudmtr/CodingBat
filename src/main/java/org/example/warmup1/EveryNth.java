package org.example.warmup1;

/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the
string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */

public class EveryNth {
    public String everyNth(String str, int n) {
        String result = "";
        int index = 0;
        while (index < str.length()) {
            result = result + str.charAt(index);
            index += n;
        }
        return result;
    }
}
