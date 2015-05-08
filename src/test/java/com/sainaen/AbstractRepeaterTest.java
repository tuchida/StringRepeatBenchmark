package com.sainaen;

import static org.junit.Assert.assertEquals;

public class AbstractRepeaterTest {

    public static void testRepeater(Repeater r) {
        String s = "aabbccddeeff";

        assertEquals(r.repeat(s, 0), "");
        assertEquals(r.repeat(s, 1), s);
        assertEquals(r.repeat(s, 3), s + s + s);
        assertEquals(r.repeat(s, 8), (s + s + s + s) + (s + s + s + s));
    }
}
