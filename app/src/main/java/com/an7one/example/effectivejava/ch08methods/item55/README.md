# Chapter 08 Methods

## Item 55 Return Optionals Judiciously

Never return a <code>null</code> value from an <code>Optional</code>-returning method, which defeats the entire purpose
of the facility.

<code>Optional</code>s are similar in spirit to checked exceptions.

Container types, including collections, maps, streams, arrays, and optionals should <b>NOT</b> be wrapped in <code>
Optional</code>s.

On one hand, one should declare a method to return <code>Optional<T></code> if it might not be able to return a result
and clients will have to perform special processing if no result is returned; on the other hand, an <code>
Optional</code> is an object that has to be allocated and initialized, and reading the value out of the optional
requires an extra indirection, which makes <code>Optional</code>s inappropriate for use in some performance-critical
situations.

To return an <code>Optional</code> that contains a boxed primitive type is prohibitively expensive compared to returning
a primitive type because the <code>Optional</code> has 2 levels of boxing instead of 0. One should <b>never</b> return
an <code>Optional</code> of a boxed primitive type.

It is almost never appropriate to use an <code>Optional</code> as a key, value, or element in a collection or array.

### Related Items

02, 30, 54, 67, 69, 71