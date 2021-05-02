### Item 18: Favor composition over inheritance
<ul>
    <li>Unlike method invocation, inheritance violates encapsulation. </li>
    <ul>
        <li>a subclass depends on the implementation details of its superclass for its proper funciton</li>
    </ul>
    <li>The implementations of super classes may change from release to release, which might break subclass, even though its code has not been touched.</li>
</ul>

### Resource
[stackoverflow](https://stackoverflow.com/questions/49002/prefer-composition-over-inheritance) Prefer composition over inheritance?