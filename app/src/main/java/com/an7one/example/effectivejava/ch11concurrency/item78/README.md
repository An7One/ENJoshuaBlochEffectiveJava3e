# Chapter 11 Concurrency

## Item 78 Synchronized Access to Shared Mutable Data

The <code>synchronized</code> keyword ensures that only a single thread can execute a method or block at one time.

Synchronization is required for reliable communication between threads as well as for mutual exclusion.

Do not use <code>Thread.stop</code>.

Synchronization is not guaranteed to work unless both read and write operations are synchronized.

### Related Item

17