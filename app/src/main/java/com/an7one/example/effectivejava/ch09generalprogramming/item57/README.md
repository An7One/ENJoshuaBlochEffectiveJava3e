# Chapter 09 General Programming

## Item 57 Minimize the Scope of Local Variables

The most powerful technique for minimizing the scope of a local variable is to declare it where it is first used.

Nearly every local variable declaration should contain an initializer.

To prefer <code>for</code> loops to <code>while</code> loops, limiting the scope to the eaxct region where they are
needed.

To keep methods small and focused.

### Related Items

15, 58