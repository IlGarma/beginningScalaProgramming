//Parameterized type class
class Box[T](val t:T)

//t is of type String
val test = new Box("string")
test.t

//t is of type Double
val test2= new Box(44.4)
test2.t

//t is of type Box[String]
val test3 = new Box(test)
test3.t.t

//Box 2 has two parameterized types
class Box2[T,V](val t:T, val v:V)

val test4 = new Box2(5, "test")
test4.t
test4.v

//is of type [Double, Box[Int, String]]
val test5 = new Box2(88.9, test4)
test5.t //first parameter
test5.v.t //first parameter of the second parameter
test5.v.v //second parameter of the second parameter