package com.sainaen.str_repeat;

public class NaiveRepeaterPreallocated implements Repeater {

    @Override
    public String repeat(String s, int cnt) {
        long size = s.length() * (long) cnt;
        if (size > Integer.MAX_VALUE) {
            size = Integer.MAX_VALUE;
        }
        StringBuilder retval = new StringBuilder((int) size);
        while (cnt-- > 0) retval.append(s);
        return retval.toString();
    }
}
