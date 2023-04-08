﻿# GenericsMappable
Practice Generics in Java, with Geospatial class creation examples.
<br/>
<br/>
Using Mappable interface implmented by Abstract classes Point and Line.
Implement concrete classes Park and River extended by the abstract classes Point and Line.
Create a Generic class Layer that has a upper bound of Mappable.
The layer holds elements in a list.
<br/><br/>
Example uses an array of instances of Parks and Rivers. Layer is created by interating over each instance.
More instances can be added using addElements.
renderLayer() just calls the overridden methods in Point and Line.
