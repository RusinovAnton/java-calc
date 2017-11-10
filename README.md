1. Compile:

```
javac -classpath ./class ./class/myclass/calc/Calculation.java
javac -classpath ./class ./GoCalculation.java
```

2. Run:

```
java -classpath ./class:. GoCalculation
```

3. One liner

```
javac -classpath ./class ./class/myclass/calc/Calculation.java && javac -classpath ./class ./GoCalculation.java && java -classpath ./class:. GoCalculation
```