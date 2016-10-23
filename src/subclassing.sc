
//Multiple class can be set in the same file (in Java one class one file)
class Employee(val firstName: String, lastName: String, title: String= "mathematics")
class Department(val name: String)
class Manager (firstName: String, lastName: String, title: String, department: Department) extends
Employee(firstName, lastName, title)

def extractName(employee: Employee) = employee.firstName

val jonEmployee = new Employee("jon", "snow")
val department = new Department("barrier")
val jonManager = new Manager("jon", "snow", "king of the North", department)

//Polymorphism
println(s"on the employee ${extractName(jonEmployee)}")
println(s"on the manager ${extractName(jonManager)}")