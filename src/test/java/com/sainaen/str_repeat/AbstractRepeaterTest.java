package com.sainaen.str_repeat;

import static org.junit.Assert.assertEquals;

public class AbstractRepeaterTest {

    private static String repeat(String s, int n, StringBuilder result) {
        if (n == 0) return result.toString();
        return repeat(s, n - 1, result.append(s));
    }

    private static String repeat(String s, int n) {
        return repeat(s, n, new StringBuilder(s.length() * n));
    }

    public static void testRepeater(Repeater r) {
        String s = "a";

        assertEquals("", r.repeat(s, 0));
        assertEquals(repeat(s, 1), r.repeat(s, 1));
        assertEquals(repeat(s, 2), r.repeat(s, 2));
        assertEquals(repeat(s, 8), r.repeat(s, 8));
        assertEquals(repeat(s, 23), r.repeat(s, 23));
    }
}
