//flatMap is a combination of Map and flatten
//It takes in input a function returning a GenTraversableOnce
//take in input a function, and flat the result
val l=List(1,2,3,4)

//flatMaps accept a function returning a traverrsableOnce
l.map(x=>List(-x,x))
l.map(x=>List(-x,x)).flatten

//You can use flatMap, it's the same
l.flatMap(x=>List(-x,x))

//You can use multiple flatMap if we have several layer of List
val l2 = List(List(List(1,2), List(3,4)),
              List(List(4,5), List(6,7))
              )

//In this case the function identity works because we have a List of List
l2.flatMap(x=>x).flatMap(x=>x)

//flatMap works on Set, also
Set(1,2,3,4).flatMap(x=>Set(-x,0))

//You can apply to Maps
val m=Map("1"->"hi", "2"->"bye")
m.flatMap(t => Map(t._1 -> t._2, t._2 -> (t._2 + "!")) )


//You can apply flatMap also to Some
//Since None is nothing, in the resulting List is missing
//The identity function works because Some(4) it looks like a List(4)
//Remeber flatMap need a function that given A in input return
// a GenTraversableOnce[B]
List(Some(4), None, Some(1), Some("hi")).flatMap(x=>x)