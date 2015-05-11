package com.sainaen.str_repeat;

public class ArrayCopy_DoublingWithSubstringRepeater implements Repeater {

    @Override
    public String repeat(String s, int cnt) {
        if (cnt == 0) {
            return "";
        }
        if (cnt == 1) {
            return s;
        }

        long size = s.length() * (long) cnt;
        if (cnt >= Integer.MAX_VALUE || size > Integer.MAX_VALUE) {
            throw new OutOfMemoryError();
        }

        char[] chars = new char[(int)size];
        s.getChars(0, s.length(), chars, 0);

        int i = s.length();
        while (i <= size / 2) {
            System.arraycopy(chars, 0, chars, i, i);
            i *= 2;
        }

        if (i < size) {
            System.arraycopy(chars, 0, chars, i, chars.length - i);
        }

        return new String(chars);
    }
}
