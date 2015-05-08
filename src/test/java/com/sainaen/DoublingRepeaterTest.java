package com.sainaen;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoublingRepeaterTest {
    String s = "aabbccddeeff";

    @Test
    public void testRepeat() throws Exception {
        assertEquals(DoublingRepeater.repeat(s, 0), "");
        assertEquals(DoublingRepeater.repeat(s, 1), s);
        assertEquals(DoublingRepeater.repeat(s, 3), s + s + s);
    }

}
