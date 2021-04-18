# Chapter 09 General Programming

## Item 60 Avoid <code>float</code> and <code>double</code> if exact answers are required

The <code>float</code> and <code>double</code> types are particularly ill-suited for monetary calculations.

To use <code>BigDecimal</code>, <code>int</code>, or <code>long</code> for monetary calculations.

### Related Items

45, 46, 47, 48, 80, 81