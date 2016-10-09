//isInstanceOf test if a variable is of that type
val a: Any = 1

a.isInstanceOf[Int]
a.isInstanceOf[String]

//asInstanceOf convert a paramenter in the given type
if (a.isInstanceOf[Int]) a.asInstanceOf[Int]+1

val b= "test"
if (b.isInstanceOf[String]) println(s"$b is a string")


