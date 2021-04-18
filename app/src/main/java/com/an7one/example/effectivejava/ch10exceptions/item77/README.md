# Chapter 10 Exceptions

## Item 77 Do NOT Ignore Exceptions

An empty <code>catch</code> block defeats the purpose of exceptions, which is to force one to handle exceptional conditions.

If one choose to ignore an exception, the <code>catch</code> block should contain a comment explaining why it is appropriate to do so, and the variable should be named <code>ignored</code>

### Related Items
