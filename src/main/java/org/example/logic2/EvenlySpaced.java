package org.example.logic2;

/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are
evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int min;
        int med;
        int max;
        if (a > b && a > c) {
            max = a;
            med = Math.max(b, c);
            min = Math.min(b, c);
        } else if (b > a && b > c) {
            max = b;
            med = Math.max(a, c);
            min = Math.min(a, c);
        } else {
            max = c;
            med = Math.max(a, b);
            min = Math.min(a, b);
        }
        return (max - med) == (med - min);
    }
}
