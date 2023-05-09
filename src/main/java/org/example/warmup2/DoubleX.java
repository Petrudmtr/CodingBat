package org.example.warmup2;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

public class DoubleX {
    boolean doubleX(String str) {
        int index = str.indexOf('x');

        if (index == str.length() - 1) {
            return false;
        } else if (str.charAt(index + 1) == 'x') {
            return true;
        } else {
            return false;
        }
    }
}
