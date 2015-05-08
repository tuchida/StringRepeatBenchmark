package com.sainaen;

public class NaiveRepeater {
    public static String repeat(String s, int cnt) {
        StringBuilder retval = new StringBuilder("");
        while (cnt-- > 0) retval.append(s);
        return retval.toString();
    }
}
