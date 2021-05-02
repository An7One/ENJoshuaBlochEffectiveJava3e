# Chapter 02 Classes and Interfaces

## Item 17: Minimize Mutability

to make a class immutable:

<ol>
    <li>Do not provide methods that modify the state of the objects</li>
    <li>Ensure that hte class cannot be extended</li>
    <li>Make all fields final</li>
    <li>Ensure exclusive access to any mutable components</li>
</ol>

Pros:

<ul>
    <li>Immutable objects are simple.</li>
    <li>Immutable objects are inherently thread-safe; they require no synchronization.</li>
    <li>Immutable objects can be shared freely.</li>
    <li>Not only can you share immutable objects, but they can share their internals.</li>
    <ul>
        <li>One never has to make <em>defensive</em> copies(Item50) of immutable objects.</li>
        <li>In fact, one never has to make any copy at all because the copies would forever be equivalent to the originals</li>
        <li>No need to provide a clone method or copy constructor(Item13) on immutable classes.</li>
    </ul>
    <li>Immutable objects make great building blocks for other objects, whether mutable or immutable.</li>
    <li>Immutable objects provide failure atomicity for free (Item76)</li>
</ul>

Cons:

<ul>
    <li>Immutable classes require a separate object for each distinct value.</li>
</ul>

### Summary

<ul>
    <li>Classes should be immutable unless there is a very good reasont o make them mutable.</li>
    <li>To limit its mutability as much as possible, if a class cannot be made immutable.</li>
    <ul>
        <li>to declare very field private final unless there is a good reason not do so</li>
    </ul>
    <li>Constructors should create fully initialized objects with all of their invariants established.</li>
    <ul>
        <li>Do NOT provide any public initialization method separate from the constructor or static factory unless there is a compelling reason to do so.</li>
        <li>Do NOT provide any "re-initialization" method that enables an object to be reused as if it had been constructed with a different initial state. Such methods generally provide little if any performance benefit at the expense of increased complexity.</li>
    </ul>
</ul>

### Related Item

76