package Benchmark;

import org.openjdk.jmh.annotations.*;

public class BenchmarkTest {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 1)
    public int benchTest () {
       return fib(20);
    }

    static int fib(int n) {
        if (n < 2) return 1;
        else return fib(n - 1) + fib(n - 2);
    }
}
