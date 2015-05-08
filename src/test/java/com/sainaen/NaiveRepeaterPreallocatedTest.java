package com.sainaen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaiveRepeaterPreallocatedTest {
    String s = "aabbccddeeff";

    @Test
    public void testRepeat() throws Exception {
        assertEquals(NaiveRepeaterPreallocated.repeat(s, 0), "");
        assertEquals(NaiveRepeaterPreallocated.repeat(s, 1), s);
        assertEquals(NaiveRepeaterPreallocated.repeat(s, 3), s + s + s);
    }
}
