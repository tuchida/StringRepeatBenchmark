package com.sainaen;

import org.junit.Test;

public class NaiveRepeaterTest extends AbstractRepeaterTest {

    @Test
    public void testRepeat() throws Exception {
        testRepeater(new NaiveRepeater());
    }
}
