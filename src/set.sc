//Set is a collection mutable or immutable, doesn't preserver the order
//has not duplicates, used to fast query but has no access by index

val a= Set(1,2,3,4)
val a1=Set(1,2,3,4,5,6)
val a2=Set(1,2,2,3,4,5,6,6,3)

//Diff
a.diff(a1)
//Diff with infix notation
a diff a1

a1 diff a

//Union
a union a1

//Intersection
a intersect a1

//Add. If you use ++ you can add a Set with every traversable collection, like List
a ++ a1

a ++ List(9,9,999)

//If you use one +, then you can add an element to a Set
a + 10

//If you use two -, you can eliminate from set another traversable collection, like List
a -- List(3,4)

//If you use one -, you can delete an element from a Set
a - 3

//When you call apply on the trait (Set is a companion object of a trait and an
//object) then you test if an element is contained in the SET
//You can search by index, like a List
a(1)
a.apply(1)
a(100)

//If you want, instead to use a.apply(1) or a(1) you can call a.contains(1)
//it's the same, return if an element is contained in a Set
a.contains(1)