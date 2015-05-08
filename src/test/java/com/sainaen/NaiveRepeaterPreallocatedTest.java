package com.sainaen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaiveRepeaterPreallocatedTest extends AbstractRepeaterTest {

    @Test
    public void testRepeat() throws Exception {
        testRepeater(new NaiveRepeaterPreallocated());
    }
}
