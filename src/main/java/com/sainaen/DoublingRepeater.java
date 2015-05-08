package com.sainaen;

public class DoublingRepeater {
    public static String repeat(String s, int cnt) {
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
        for (; i <= cnt/2; i*=2) retval.append(retval);
        while (i++ < cnt) retval.append(s);
        return retval.toString();
    }
}
