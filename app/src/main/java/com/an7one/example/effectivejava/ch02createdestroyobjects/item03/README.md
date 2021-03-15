# Item 03: Enforce the singleton property with a private constructor or an enum type

<ul>
    <li>Singletons typically represent either a stateless object such as function or a system component that is intrinsically unique.</li>
    <li>Making a class a singleton can make it difficult to test its clients.</li>
    <ul>
        <li>it is impossible to substitute a mock implementation for a singleton unless it impements an interface that serves as its type</li>
    </ul>
</ul>