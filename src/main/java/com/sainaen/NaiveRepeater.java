package com.sainaen;

public class NaiveRepeater implements Repeater {

    @Override
    public String repeat(String s, int cnt) {
        StringBuilder retval = new StringBuilder("");
        while (cnt-- > 0) retval.append(s);
        return retval.toString();
    }
}
