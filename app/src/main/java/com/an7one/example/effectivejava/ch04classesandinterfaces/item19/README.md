### Item 19: Design and document for inheritance or else prohibit it

<ul>
    <li>The class must document its self-use or overridable methods.</li>
    <li>A class may have to provide hooks into its internal working in the form of judiciously chosen protected methods, or, in rare instances, protected fields.</li>
    <li>The only way to test a class designed for inheritance is to write subclasses.</li>
    <li>One must test the class by writing subclass before releasing it.</li>
    <li>Constructors must not invoke overridable methods, directly or indirectly</li>
    <ul>
        <li>Note that it is safe to invoke private methods, final methods, and static methods, none of which are overridable, from a constructor</li>
    </ul>
    <li>(If one decides to implement either <code>Cloneable</code> or <code>Serializable</code> in a class that is designed for inheritance,) Neither <em>clone</em> or <em>readObject</em> may invoke an overridable method, directly or indirectly</li>
    <li>To design a class for inheritance requires great efforts and places substantial limitations on the class.</li>
    <li>To prohibit subclassing in classes that are NOT designed and documented to be safely subclassed.</li>
    <ul>
        <li>to declare the class(es) <code>final</code></li>
        <li>to make all the constructors <code>private</code> or package-private and to add public static factories in place of the constructors. (item17)</li>
    </ul>
</ul>