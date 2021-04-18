# Chapter 10 Exceptions

## Item 73 Throw Exceptions Appropriate to the Abstraction

<i>Exception translation</i>: higher layers should catch lower-level exceptions and, in their place, throw exceptions
that can be explained in terms of the higher-level abstraction.

While exception translation is superior to mindless propagation of exceptions from lower layers, it should not be
overused.

### Related Items

20, 75