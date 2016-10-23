//abstract class cannot be instantiated
//all the methods are abstracts, no implementation

abstract class Person {
  def name: String
  def surname: String
  def fullName: String
}


//extending an abstract class you have to implement all abstract methods
//def name and def surname are created automatically since we put val name and
//val surname
//we have just to implment fullName method
class Employee (val name: String, val surname: String) extends Person {
  override def fullName = s"${name}, ${surname}"
}

//We can assign every subclass to the abstract class
val jon = new Employee("jon", "snow")
jon.surname
jon.name
jon.fullName

val jonPerson = jon
jonPerson.name
jonPerson.surname
jonPerson.fullName