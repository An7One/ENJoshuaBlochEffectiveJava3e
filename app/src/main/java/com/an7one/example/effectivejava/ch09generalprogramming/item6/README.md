# Chapter 09 General Programming

## Item 61 Prefer primitive types to boxed primitives

Java has two-part type system
<ol>
    <li>primitive type</li>
    <li>reference type</li>
</ol>

To apply the <code>==</code> operator to boxed primitives is almost always wrong.

When one mixes primitives and boxed primitives in an operation, the boxed primitive is auto-unboxed.

Limited legitimate uses of boxed primitives
<ul>
    <li>as elements, keys, and values in collections</li>
    <li>as type parameters in parameterized types and methods (primitives not permitted)</li>
    <li>required when one making reflective method invocations</li>
</ul>

Autoboxing reduces the verbosity, but not the danger, of using boxed primitives.

When one's program does unboxing, it can throw a <code>NullPointerException</code>.

### Related Items

06, 14