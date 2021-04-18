# Chapter 10 Exceptions

## Item 69 Use Exceptions Only for Exceptional Conditions

Exceptions are, as their names imply, to be used only for exceptional conditions; they should never be used for ordinary
control flow.

A well-designed API must not force its clients to use exceptions for ordinary control flow.

### Related Items

55, 67