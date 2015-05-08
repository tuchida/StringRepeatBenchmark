package com.sainaen.str_repeat;

public class DoublingWithSubstringRepeater implements Repeater {

    @Override
    public String repeat(String s, int cnt) {
        if (cnt == 0) {
            return "";
        }
        if (cnt == 1) {
            return s;
        }

        long size = s.length() * (long) cnt;
        if (size > Integer.MAX_VALUE) {
            size = Integer.MAX_VALUE;
        }

        StringBuilder retval = new StringBuilder((int) size);
        retval.append(s);

        int i = 1;
        while (i <= cnt/2) {
            retval.append(retval);
            i *= 2;
        }

        if (i < cnt) {
            retval.append(retval.substring(0, s.length() * (cnt - i)));
        }

        return retval.toString();
    }
}
