# Chapter 10 Exceptions

## Item 74 Document All Exceptions Thrown by Each Method

Always declare checked exceptions individually, and document precisely the conditions under which each one is thrown.

Use the Javadoc <code>@throws</code> tag to document each exception that a method can throw, but do NOT use the <code>
throw</code> keyword on unchecked exceptions.

If an exception is thrown by many methods in a class for the same reason, one can document the exception in the class's
documentation comment.

### Related Items

56, 70