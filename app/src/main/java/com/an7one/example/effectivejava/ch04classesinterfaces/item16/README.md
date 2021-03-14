### Item 16: In public classes, use accessor methods, not public fields

<ul>
    <li>to provide accessor methods if a class is accessible outside its package</li>
    <ul>
        <li>it is less harmful if the fields are immutable, while it is never a good idea for a public class to expose fields directly</li>
    </ul>
    <li>there is nothing inherently wrong with exposing its data fields, if a class is package-private or is a private nested class</li>
</ul>

Several classes in the Java platform libraries violate the advice that public classes should not expose fields directly. Prominent examples include the Point([doc](https://docs.oracle.com/javase/7/docs/api/java/awt/Point.html) in Java7) and Dimension([doc](https://docs.oracle.com/javase/7/docs/api/java/awt/Dimension.html) in Java7) classes in the java.awt package.