//methods can ise default parameters and default parameters

class Employee(val firstName: String,
               val lastName: String,
               val title: String= "programmer") {

  def this(lastName: String) = {
    this(lastName, "default lastName")
  }

  def copy(firstName: String, lastName: String, title: String="programmer") = {
    new Employee(firstName, lastName, title)
  }

}

val jon = new Employee("jon", "snow")
jon.firstName
jon.lastName
jon.title

val jon2 = jon.copy("jon2", "snow2")
jon2.firstName
jon2.lastName
jon2.title