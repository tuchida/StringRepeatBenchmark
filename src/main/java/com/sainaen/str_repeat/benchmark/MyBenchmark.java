package com.sainaen.str_repeat.benchmark;

import com.sainaen.str_repeat.*;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@Fork(5)
@State(Scope.Thread)
public class MyBenchmark {
    String s = "aabbccddeeff";
    int n = 10000;

    @Benchmark
    public String testMethod_Naive() {
        return new NaiveRepeater().repeat(s, n);
    }

    @Benchmark
    public String testMethod_NaivePrealloc() {
        return new NaiveRepeaterPreallocated().repeat(s, n);
    }

    @Benchmark
    public String testMethod_Doubling() {
        return new DoublingRepeater().repeat(s, n);
    }

    @Benchmark
    public String testMethod_DoublingWithSubstring() {
        return new DoublingWithSubstringRepeater().repeat(s, n);
    }

    @Benchmark
    public String testMethod_V8() {
        return new V8Repeater().repeat(s, n);
    }

    @Benchmark
    public String testMethod_ArrayCopy_DoublingWithSubstring() {
        return new ArrayCopy_DoublingWithSubstringRepeater().repeat(s, n);
    }
}
