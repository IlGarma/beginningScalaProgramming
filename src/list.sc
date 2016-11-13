//List are immutable collections, search by index, allowed duplicates
//List is a companion object List
//You are call apply of the object
val a = List(1,2,3,4,5)
val a1 = List.apply(1,2,3,4,5)

//Using the right associative, where Nil is empty List
val b = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
Nil

//To extract an element you call apply of the class List
a(0)
a.apply(0)
a(1)

a.head //first element
a.tail //List without first element
a.init //List without last element
a.last //Last element
a.isEmpty //boolean if is empty
a.nonEmpty //boolean if is not empty
a.updated(2, 50) //return new collection equal to a where the element with index 2 is now 50

a.mkString(",") //create a string separated by ,
a.mkString("[",",","]") //create a string delimited by [ ] and separated by ,