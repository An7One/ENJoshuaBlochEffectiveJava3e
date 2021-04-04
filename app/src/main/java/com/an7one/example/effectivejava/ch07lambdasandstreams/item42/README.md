# Chapter 07, Lambdas and Streams
## Item 42: Prefer lambdas to anonymous classes

To omit the types of all lambda parameters unless their presence makes your program clearer.

Lambdas lack names and documentation; if a computation is not self-explanatory, or exceeds a few lines, do not put it in a lambda.

One should rarely, if ever, serialize a lambda.

Do not use anonymous classes for function objects unless you have to create instances of types that are not functional interfaces.


### Related Items
24, 26, 29, 30, 34