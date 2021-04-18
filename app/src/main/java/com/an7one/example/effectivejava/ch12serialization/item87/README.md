# Chapter 12 Serialization

## Item 87 Consider Using a Custom Serialized Form

Do not accept the default serialized form without first considering whether it is appropriate.

The default serialized form is likely to be appropriate if an object's physical representation is identical to its
logical content.

Even if one decides that the default serialized form is appropriate, one often must provide a readObject method to
ensure invariants and security.

Using the default serialized form when an object's physical representation differs substantially from its logical data
content has 4 disadvantages:
<ol>
    <li>it permanently ties the exported API to the current internal representation</li>
    <li>it can consume excessive space</li>
    <li>it can consume excessive time</li>
    <li>it can cause stack overflow</li>
</ol>

Do not change the serial version UID unless one wants to break compatibility with all existing serialized instances of a
class.

### Related Item

51, 86, 88, 90