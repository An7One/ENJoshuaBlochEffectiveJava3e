# Item 33: Consider typesafe heterogeneous containers

### Two Limitations

<ol>
    <li>A malicious client could easily corrupt the type safety of a <code>Favorites</code> instance, by using a <code>Class</code> object in its raw form. But the resulting client code would generate an unchecked warning when it was compiled.</li>
    <ul>
        <li>This is no different from a normal collection implementations such as <code>HashSet</code> and <code>HashMap</code>.</li>
    </ul>
    <li>It cannot be used on a non-reifiable type(Item 28)</li>
    <ul>
        <li>In other words, one can store his/her favorite <code>String</code> or <code>String[]</code>, but not his/her favorite <code>List&lt;String&gt;</code>. The reason is that one cannot get a <code>Class</code> object for <code>List&lt;String&gt;</code>.</li>
    </ul>
</ol>