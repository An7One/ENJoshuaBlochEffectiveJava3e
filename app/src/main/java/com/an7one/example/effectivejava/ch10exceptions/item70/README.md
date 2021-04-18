# Chapter 10 Exceptions

## Item 70 Use Checked Exceptions for Recoverable Conditions and Runtime Exceptions for Programming Errors

To use checked exceptions for conditions from which the caller can reasonably be expected to recover.

To use runtime exceptions to indicate programming errors.

All of the unchecked throwables one implements should subclass <code>RuntimeException</code> directly or indirectly.

### Related Items

12, 71, 75, 77