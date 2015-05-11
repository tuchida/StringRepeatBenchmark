To run, execute in project folder:
```
$ mvn clean install
$ java -jar target/benchmarks.jar
```

## Results

### Java 1.6.0_45

```
$ java -version
java version "1.6.0_45"
Java(TM) SE Runtime Environment (build 1.6.0_45-b06)
Java HotSpot(TM) 64-Bit Server VM (build 20.45-b01, mixed mode)


$ java -jar target/benchmarks.jar
<...>

Benchmark                                      Mode  Cnt     Score     Error  Units
MyBenchmark.testMethod_Doubling               thrpt  100  8481.562 ± 116.756  ops/s
MyBenchmark.testMethod_DoublingWithSubstring  thrpt  100  9099.012 ± 170.059  ops/s
MyBenchmark.testMethod_Naive                  thrpt  100  4152.274 ± 100.209  ops/s
MyBenchmark.testMethod_NaivePrealloc          thrpt  100  4717.857 ±  86.611  ops/s
MyBenchmark.testMethod_V8                     thrpt  100  6981.675 ± 122.053  ops/s
```

### Java 1.8.0_45

```
$ java -version
java version "1.8.0_45"
Java(TM) SE Runtime Environment (build 1.8.0_45-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.45-b02, mixed mode)


$ java -jar target/benchmarks.jar
<...>

Benchmark                                                Mode  Cnt      Score     Error  Units
MyBenchmark.testMethod_ArrayCopy_DoublingWithSubstring  thrpt  100  19215.778 ± 178.935  ops/s
MyBenchmark.testMethod_Doubling                         thrpt  100  15285.772 ± 155.174  ops/s
MyBenchmark.testMethod_DoublingWithSubstring            thrpt  100  17511.073 ± 150.687  ops/s
MyBenchmark.testMethod_Naive                            thrpt  100   6093.978 ±  85.496  ops/s
MyBenchmark.testMethod_NaivePrealloc                    thrpt  100   7999.695 ± 140.291  ops/s
MyBenchmark.testMethod_V8                               thrpt  100   9644.282 ±  80.012  ops/s
```
