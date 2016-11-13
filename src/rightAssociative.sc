//Since the method ends with : you can call in a right associative way
//To have a valid name, if you use letter or number you have to follow these
//by _ and :
//otherwise if you a symbol you can add simply :
class Foo(x:Int) {
  def a_:(y:Int) = x+y
  def +:(y:Int) = x+y
}

val b =new Foo(3)
//Normal way
b.a_:(4)
//Right associative way
//IN this case you have to use the infix notation
4 a_: b
4 +: b
