# Chapter 12 Serialization

## Item 86 Implement <code>Serializable</code> with great caution

Cost implementing <code>Serializable</code>:
<ol>
    <li>it decreases the flexibility to change a class's implementation once it has been released.</li>
    <li>it increases the likelihood of bugs and security holes.</li>
    <li>it increases the testing burden associated with releasing a new version of a class.</li>
</ol>

Implementing <code>Serializable</code> is not a decision to be undertaken lightly.

Classes designed for inheritance should rarely implement <code>Serializable</code>, and interfaces should rarely extend
it.

Inner classes should not implement <code>Serializable</code>.

### Related Item

08, 15, 19, 24, 85, 87, 90