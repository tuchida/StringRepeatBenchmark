package com.sainaen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaiveRepeaterTest {
    String s = "aabbccddeeff";

    @Test
    public void testRepeat() throws Exception {
        assertEquals(NaiveRepeater.repeat(s, 0), "");
        assertEquals(NaiveRepeater.repeat(s, 1), s);
        assertEquals(NaiveRepeater.repeat(s, 3), s + s + s);
    }
}
