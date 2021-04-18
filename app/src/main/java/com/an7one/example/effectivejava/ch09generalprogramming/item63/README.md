# Chapter 09 General Programming

## Item 63 Beware the Performance of String Concatenation

To use the string concatenation oeprator repeatedly to concatenate n strings requires time quadratic in n.

To achieve acceptable performance, to use a <code>StringBuilder</code> in place of a <code>String</code> to store the
statement under construction.

Do <b>NOT</b> use the string concatenation operator to combine more than a few <code>String</code>s.

### Related Items

17