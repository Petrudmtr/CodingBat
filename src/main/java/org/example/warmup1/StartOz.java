package org.example.warmup1;

/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o'
and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */

public class StartOz {
    public String startOz(String str) {
        String result = "";
        if (str.startsWith("o")) {
            result = result + str.substring(0, 1);
        }
        if (str.startsWith("z", 1)) {
            result = result + str.substring(1, 2);
        }
        return result;
    }

}
