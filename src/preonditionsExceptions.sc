//require is used to add a preconditions on the parameters
//first parameter is a boolean
//and it throws an IllegalArgumentException

class Employee(val firstName: String, val lastName: String, val title: String ="programmer") {
  require(firstName.nonEmpty, "firstName cannot be empty")
  require(lastName.nonEmpty, "lastName cannot be empty")
  require(title.nonEmpty, "title cannot be empty")


  //throw as in Java throws a new Exception
  if (title.contains("junior") ||
  title.contains("senior")) throw new IllegalArgumentException("title cannot contain junior or senior")
}


//try, ctach, finally as in Java
//catch use pattern matching
try {
  val jon = new Employee("", "lastName")
} catch {
  case ex: IllegalArgumentException => println("firstName cannot be emnpty")
} finally {
  println("This statement is always eecuted")
}


try {
  val jon2= new Employee("jon", "snow", "senior king of the North")
} catch {
  case ex: IllegalArgumentException => println("title cannot contain senior or junior")
}