# Chapter 08 Methods

## Item 50: Make Defensive Copies When Needed

One must program defensively, with the assumption that clients of your class will do their best to destroy its
invariants.

Date is obsolete and should no longer be used in the new code.

It is essential to make a <i>defensive copy</i> of each mutable parameter to the constructor.

Do not use the <code>clone</code> method to make a defensive copy of a parameter whose type is subclassable by untrusted
parties.

In summary, if a class has mutable components that it gets from or returns to its clients, the class must defensively
copy these components.

### Related Item

13, 17, 18, 49