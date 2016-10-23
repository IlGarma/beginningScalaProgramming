//Objects are singletons
object MyObject {
  def sun(x:Int, y:Int) = x+y
}

val a = MyObject
val b = MyObject
//Singletons
a equals b
a==b
a eq b

//The methods inside an object are equals to the static methods in Java
//In scala doesn't exist the keyword static
println(MyObject.sun(3,4))


class Employee(val firstName: String, val lastName: String)

//An Object can extend ONLY a regular class since they are pre-instantiated
object EmployeeObject extends Employee("jon", "snow")
EmployeeObject.firstName
EmployeeObject.lastName

//Object cannot an object
//object MyObjectExtended extends MyObject {
//}

//A class cannot extends an object
//class EmployeeClass extends MyObject {}