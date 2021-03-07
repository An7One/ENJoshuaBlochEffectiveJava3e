# Item 28, Prefer lists to arrays

<ul>
    <li>Array</li>
    <ul>
        <li>Covariant</li>
        <ul>
            <li>subtype is a (sub)type of supertype</li>
            <li><a href="https://stackoverflow.com/a/8482091/6061609">[stackoverflow]</a> Covariant, Contravariant, Invariant</li>
        </ul>
        <li>Reified
            <ul>
                <li>to enforce element types at runtime</li>
            </ul>
        </li>
        <li>to provide runtime safety, NOT compile-time safety</li>
    </ul>
    <li>List</li>
    <ul>
        <li>Invariant</li>
        <li>Erasure </li>
        <ul>
            <li>to enforce type constraints only at compile time and discard (or erase) element types information at runtime</li>
            <li>The only parameterized types that are reifiable are unbounded wildcard types such as <code> List<&#63;> </code> and <code> Map<&#63;, &#63;> </code></li>
        </ul>
        <li>non-reifiable</li>
        <ul>
            <li>runtime representation contains less information than its compile-time representation</li>
        </ul>
        <li>to provide compile-time safety, NOT runtime safety</li>
    </ul>
</ul>