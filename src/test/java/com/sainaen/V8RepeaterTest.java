package com.sainaen;

import org.apache.commons.math3.analysis.function.Abs;
import org.junit.Test;

import static org.junit.Assert.*;

public class V8RepeaterTest extends AbstractRepeaterTest {

    @Test
    public void testRepeat() throws Exception {
        testRepeater(new V8Repeater());
    }
}
