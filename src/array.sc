//The Arrays in Scala wraps the Java Array
//The arrays are similar to List but they are mutable

val a = Array(1,2,3,4)
a.head
a.tail
a.init
a.last
a.isEmpty
a(1)

//since the arrays are mutable, you are changing the original array
a(1) = 0
a.mkString(",")

//When you use varargs in the method, these varargs are wrapped in an Array
def test(x:String, y:String, z:Any*): Unit = {
  println(z)
  println(x + " " + y + " " + z)
}

test("jon", "snow", "game", "of", "thrones")