# Item 34: Use <code>enums</code> instead of <code>int</code> constants

<ul>
    <li>Enums provide compile-time type safety.</li>
    <li>to associate data with enum constants, declare instance fields and write a constructor that takes the data and stores it in the fields</li>
    <li>removed elements</li>
        <ul>
            <li>Any client program that does NOT refer to the removed element will continue to work.
            </li>
            <li>Fail at compile-time</li>
        </ul>
</ul>