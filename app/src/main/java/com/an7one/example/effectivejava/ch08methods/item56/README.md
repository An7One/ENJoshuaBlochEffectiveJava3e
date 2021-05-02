# Chapter 08 Methods

## Item 56 Write Doc Comments for All Exposed API Elements

To document one's API properly, one must precede <b>every</b> exported class, interface, constructor, method, and field
declaration with a doc comment.

The doc comment for a method should describe succinctly the contract between the method and its client.

Doc comments should be readable both in the source code and in the generated documentation.

No 2 members or constructors in a class or interface should have the same summary description.

When one documenting a generic type or method, be sure to document all type parameters.

When one documenting an <code>enum</code> type, be sure to document the constants, as well as the type and any public
methods.

When one documenting an annotation type, be sure to document any members, as well as the type itself.

Whether a class or static method is thread-safe, one should document its thread-safety.

## Related Item

15, 19, 74, 87