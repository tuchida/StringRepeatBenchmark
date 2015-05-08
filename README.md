To run, execute in project folder:
```
$ mvn clean install
$ java -jar target/benchmark.jar
```

## Results

### Java 1.6.0_45

```
$ java -version
java version "1.6.0_45"
Java(TM) SE Runtime Environment (build 1.6.0_45-b06)
Java HotSpot(TM) 64-Bit Server VM (build 20.45-b01, mixed mode)


$ java -jar target/benchmark.jar
<...>

Benchmark                              Mode  Cnt     Score     Error  Units
MyBenchmark.testMethod_Doubling       thrpt  100  4912.439 ± 182.741  ops/s
MyBenchmark.testMethod_Naive          thrpt  100  2359.103 ±  76.877  ops/s
MyBenchmark.testMethod_NaivePrealloc  thrpt  100  3036.644 ± 224.483  ops/s
MyBenchmark.testMethod_V8             thrpt  100  4126.327 ± 114.261  ops/s
```

### Java 1.8.0_45

```
$ java -version
java version "1.8.0_45"
Java(TM) SE Runtime Environment (build 1.8.0_45-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.45-b02, mixed mode)


$ java -jar target/benchmark.jar
<...>

Benchmark                              Mode  Cnt     Score     Error  Units
MyBenchmark.testMethod_Doubling       thrpt  100  8245.678 ± 536.188  ops/s
MyBenchmark.testMethod_Naive          thrpt  100  2470.767 ± 170.311  ops/s
MyBenchmark.testMethod_NaivePrealloc  thrpt  100  3371.057 ± 263.272  ops/s
MyBenchmark.testMethod_V8             thrpt  100  4881.418 ± 342.884  ops/s
```
