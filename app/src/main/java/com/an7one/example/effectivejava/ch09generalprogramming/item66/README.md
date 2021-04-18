# Chapter 09 General Programming

## Item 66 Use Native Methods Judiciously

It is rarely advisable to use native methods for improved performance.

Serious disadvantages:
<ul>
    <li>not safe, no longer immune to memory corruption errors.</li>
    <li>more platform-dependent than Java, less portable.</li>
    <li>harder to debug.</li>
    <li>can decrease performance because GC cannot automate, or even track, native memory usage.</li>
    <li>there is a cost associated with going into and out of native code.</li>
    <li>native methods require "glue code" that is difficult to read and tedious to write.</li>
</ul>

### Related Items

08, 50