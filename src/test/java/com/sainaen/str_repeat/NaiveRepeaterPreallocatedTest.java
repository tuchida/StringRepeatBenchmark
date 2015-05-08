package com.sainaen.str_repeat;

import org.junit.Test;

public class NaiveRepeaterPreallocatedTest extends AbstractRepeaterTest {

    @Test
    public void testRepeat() throws Exception {
        testRepeater(new NaiveRepeaterPreallocated());
    }
}
