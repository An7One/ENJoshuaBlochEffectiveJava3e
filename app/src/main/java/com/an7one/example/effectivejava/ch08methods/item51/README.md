# Chapter 08 Methods
## Item 51 Design Method Signatures Carefully

<ul>
    <li>Choose method names carefully</li>
    <li>Do not go overboard in providing convenience methods</li>
    <li>Avoid long parameter lists</li>
    <ul>
        <li>Long sequences of identically typed parameters are especially harmful.</li>
        <li>to shorten overly long parameter list</li>
        <ol>
            <li>to break up the method up into multiple methods, each of which requires only a subset of the parameters</li>
            <li>to create helper classes to hold groups of parameters. Typically these help classes are static member classes (item24)</li>
            <li>to adapt the Builder pattern(item2) from object construction to method invocation</li>
        </ol>
    </ul>
    <li>For parameter types, to favor interfaces over classes (item64)</li>
    <li>Prefer two-element <em>enum</em> types to <em>boolean</em> parameters, unless the meaning of the <em>boolean</em> is clear from the method name.</li>
</ul>


### Related Items

02,24,34,64,68