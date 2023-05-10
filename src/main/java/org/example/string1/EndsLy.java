package org.example.string1;

/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

 */

public class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        String end = str.substring(str.length() - 2);
        return end.equals("ly");
    }
}
