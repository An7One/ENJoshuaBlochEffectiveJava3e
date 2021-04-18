# Chapter 10 Exceptions

## Item 75 Include Failure-capture Information in Detail Messages

To capture a failure, the detail message of an exception should contain the values of all parameters and fields that
contributed to the exceptions.

Do not include passwords, encryption keys, and the like in the detail messages.

### Related Items

12, 70