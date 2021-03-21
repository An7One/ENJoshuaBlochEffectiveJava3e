# Item 38: Emulate extensible enums with interfaces

<ul>
    <li>Extensibility of enums turns out to be a bad idead</li>
    <ul>
        <li>It is confusing that elements of an extension type are instances of the base type and its extensions.</li>
        <li>There is no good way to enumerate over all the elements of a base type and its extensions.</li>
        <li>Extensibility would complicate many aspects of the design and implementation.</li>
    </ul>
</ul>

### Summary
While not able to write an extensible <code>enum</code> type, one can emulate it by writing an <code>interface</code> to accompany a basic <code>enum</code> type that implements the <code>interface</code>.