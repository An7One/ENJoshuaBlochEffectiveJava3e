### Item23: Prefer class hierarchies to tagged classes

<ul>
    <li>Tagged classes are verbose, error-prone, and inefficient</li>
    <ul>
        <li>cluttered with boilerplate code</li>
        <li>worse readability</li>
        <li>irrelevant fields increases memory consumptions</li>
        <li>wrong constructing leads to failure at runtime</li>
    </ul>
</ul>

##### to turn tagged classes into a class hierarchy

steps:
<ol>
    <li>to define an abstract class containing an abstract method for each method in the tagged class whose behavior depends on the tag value</li>
    <li>to define a concrete subclass of the root class for each flavor of the original tagged class</li>
</ol>

pros:
<ul>
    <li>to eliminate the possibility of runtime failure due to missing switch cases</li>
    <li>to be able to extend the hierarchy independently and interoperatively without access to teh source for the root class</li>
    <li>to separate data type associated with each flavor</li>
    <li>to reflect natural behavior relationships among types, allowing for increased flexibility and better compile-time type checking</li>
</ul>