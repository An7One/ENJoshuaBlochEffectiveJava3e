# Chapter 12 Serialization

## Item 85 Prefer Alternatives to Java Serialization

The best way to avoid serialization exploits is never to deserialize anything. There is no reason to use Java
serialization in any new system one writes.

Never deserialize untrusted data.

Prefer whitelisting to blacklistsing.

### Related Item