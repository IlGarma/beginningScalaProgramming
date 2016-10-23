import scala.beans.BeanProperty

//The constructors can use default and named parameters
class Employee(@BeanProperty val firstName: String,
                @BeanProperty var lastName: String,
               val title: String = "Programmer") {
  def this(firstName: String) {
    this(firstName, "default lastName")
  }

  def this() {
    this("default firstName", "default LastName")
  }

}

val jon = new Employee("jon", "snow")
val jon2 = new Employee()

jon.firstName
jon.lastName
jon.title //default

jon2.firstName //default
jon2.lastName //default
jon2.title //default
val jon3 = new Employee("jon", "snow", "king of north")
jon3.firstName
jon3.lastName
jon3.title

