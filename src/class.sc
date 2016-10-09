class Employee(name: String, age: Int)

val jon = new Employee("jon", 25)
//jon.name -->error

//adding val you can access to the value of name parameter
//adding a var you can read\set the value of age parameter
class Employee2(val name: String, var age: Int)
val jon2 = new Employee2("jon", 25)
jon2.name
jon2.age
jon2.age = 35 //uniform access principle. The way to access to the variable should be the same of the method parameterless
jon2.age