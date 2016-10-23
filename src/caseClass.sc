case class Department(name: String)

// already implemented by default
// toString
// copy
// HashSet
// equals
//you can override, as well
//Implements also pattern matching
//By default val

val toys = Department("toys")

//val by default
toys.name

//toString
println(toys)

//equals
val toys2 = Department("toys")
toys2 equals toys

//Pattern matching
val Department(test) = toys
println(test)

//copy
val toy3 = toys.copy(name= "toy2")
println(toy3.name)

//Override toString
case class Department2(name: String) {
  override def toString: String = s"Department: ${name}"
}

val toys4 = Department2("toys")
println(toys4)

//Case class cannot extends another case classed
//case class Department3(name: String) extends Department2(name)