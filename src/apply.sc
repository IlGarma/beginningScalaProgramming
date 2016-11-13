//Apply can be defined in class
class Foo(x:Int) {
  def apply(y:Int) = x+y
}

val foo = new Foo(2)
foo.apply(3)
//You have not declare apply since it's implicit
foo(3)

//apply can be used in object
object Bar {
  def apply(text:String) = s"the string is ${text}"
}

Bar.apply("example")
Bar("example")

//apply is called when create an instance of case class
case class Department(name:String)
Department("music")
Department.apply("music")


//Companion object
//In the class Person the main constructor is private only companion object
//can istantiate the class
class Person private (name:String)

object Person {
  def apply(name: String): Person = new Person(name)
}

Person("jon")
Person.apply("jon")