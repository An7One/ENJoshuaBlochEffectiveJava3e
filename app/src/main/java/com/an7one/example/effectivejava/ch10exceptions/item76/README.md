# Chapter 10 Exceptions

## Item 76 Strive for Failure Atomicity

Generally speaking, a failed method invocation should leave the object in the state that it was in prior to the
invocation. A method with this property is said to be <i>failure-atomic</i>.

As a rule, any generated exception that is part of a method's specification should leave the object in the same state it
was in prior to the method invocation. When this rule is violated, the API documentation should clearly indicate what
state the object will be left in.

### Related Items

07, 17, 49, 73