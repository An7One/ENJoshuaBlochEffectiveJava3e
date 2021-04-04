# Chapter 07, Lambdas and Streams

## Item 44: Favor the use of standard functional interfaces

### Apply Standard Functional Interfaces

If one of the standard functional interfaces, in <code>java.util.function.Function</code>, does the job, one should
generally use it in preference to a purpose-built functional interface.

#### Existing Functional Interfaces

There are 43 interfaces in <code>
java.util.Function</code> [(DOC in Java8)](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)

| Interface | Function Signature | Example|
| -------- | ------------------- | ------|
| UnaryOperator<T> | T apply(T t) | String::toLowerCase|
| BinaryOperator<T> | T apply (T t1, T t2) | BigInteger::add |
| Predicate<T> | boolean test(T t)  | Collection::isEmpty |
| Function<T, R> | R apply(T t) | Collection::isEmpty |
| Supplier<T> | T get() | Instant::now |
| Consumer<T> | void accept(T t) | System.out::println |

Do not be tempted to use basic functional interfaces with boxed primitives instead of primitive functional interfaces.

### Write One's Own Purpose-Built Functional Interfaces

#### (Do not apply standard functional interfaces)

##### Where or when does one have to create his own purpose-built functional interfaces?

<ul>
    <li>where none of standard ones is applicable</li>
    <li>even if one of standard ones is applicable, but one of the three conditions is met</li>
    <ul>
        <li>it will be compmonly used and could benefit from a descriptive name.</li>
        <li>it has a strong contract associated with it.</li>
        <li>it would benefit from custom default methods.</li>
    </ul>
</ul>

##### How to create one's own purpose-built functional interfaces?

<ul>
    <li>Always annotate your functional interfaces with teh @FunctionalInterface annotation.</li>
    <li>Do not provide a method with multiple overloadings that take different functional interfaces in the same argument position if it could create a possible ambiguity in the client</li>
    <ul>
        <li>The easiest way to avoid this problem is not to write overloadings that take different functional interfaces in the same argument position.</li>
    </ul>
</ul>

### Related Items

21, 52, 61

### Problems left

<ul>
    <li>how efficient?</li>
    <li>how lambda expression are executed?</li>
</ul>