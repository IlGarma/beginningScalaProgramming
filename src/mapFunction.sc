//map is a function that take a function in input and apply this function
//on all the elements of a collection, like List, String, Array and also Option

val a = List(1,2,3,4)
val f= (x:Int) => x+1
a.map(f)

//You can use the inline notation
a.map( (x:Int)=>x+1)

//Since you know that a is a List of Int you can delete the type from the function
a.map (x=>x+1)

//Since x is the only parameter you can use _
a.map(_+1)

//You can flip _ and +1
a.map(1+_)

//Since _ is the last character you can remove but remember to import
//scala.language.postfixOps otherwise you will receive a warning
import scala.language.postfixOps
a.map(1+)


//You can work on Set, also
val b=Set("test", "text", "hi", "ih")

//The result set contain only 2 elements, since set contains distinct elements
b.map(x=>x.size)

//You can use _
b.map(_.size)

//You can map in a Set of Tuples
b.map(x=>(x,x.size))

//You can work on Option also
val s=Some(4)
s.map(1+)

Some("hi").map(_.size)

//You can also apply on None but be careful,
// you need to specify the type of option
//If you directly call
// None.map(1+)
// you will receive an error since None means nothing
//but if you specify the type of Option, like Option[Int] it's ok
val none:Option[Int] = None
none.map(1+)