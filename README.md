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


$ java -jar target/benchmark.jar
<...>

Benchmark                                      Mode  Cnt      Score     Error  Units
MyBenchmark.testMethod_Doubling               thrpt  100  10606.817 ± 231.937  ops/s
MyBenchmark.testMethod_DoublingWithSubstring  thrpt  100  13422.023 ± 230.671  ops/s
MyBenchmark.testMethod_Naive                  thrpt  100   4217.410 ±  83.808  ops/s
MyBenchmark.testMethod_NaivePrealloc          thrpt  100   5156.276 ±  95.651  ops/s
MyBenchmark.testMethod_V8                     thrpt  100   7266.410 ± 137.244  ops/s
```
