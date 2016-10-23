class Employee (val firstName: String, val lastName: String) {
  def fullName = s"${firstName}, ${lastName}"
}

case class Department(name: String)

class Manager(firstName: String, lastName: String, val department: Department) extends Employee (firstName, lastName) {
 override def fullName = s"${firstName}, ${lastName}, ${department.name}"
}

val jonEmployee: Employee = new Employee("jon", "snow")
val jonManager: Manager = new Manager("jon", "snow", Department("House of Stark"))

jonEmployee.fullName
jonManager.fullName

val jonEmployeeManager: Employee = new Manager("jon", "snow", Department("House of Stark"))

//It's used the fullName method of Manager even if jonEmployeeManager: Employee
//because it's used the real implementation of the method
jonEmployeeManager.fullName
