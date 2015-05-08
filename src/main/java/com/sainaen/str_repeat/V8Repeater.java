package com.sainaen.str_repeat;

public class V8Repeater implements  Repeater {

    @Override
    public String repeat(String s, int cnt) {
        long size = s.length() * (long) cnt;
        if (size > Integer.MAX_VALUE) {
            size = Integer.MAX_VALUE;
        }

        StringBuilder sb = new StringBuilder(s);
        StringBuilder retval = new StringBuilder((int) size);

        while (true) {
            if ((cnt & 1) != 0) retval.append(sb);
            cnt >>= 1;
            if (cnt == 0) return retval.toString();
            sb.append(sb);
        }
    }
}
