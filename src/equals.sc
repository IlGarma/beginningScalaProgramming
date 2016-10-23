//equals toString and HashCode can be overridden

//Equals compare if two objects are the same
class Employee(val firstName: String, val lastName: String) {
  override def equals(x:Any): Boolean = {
    if (!x.isInstanceOf[Employee]) false
    else {
      val other = x.asInstanceOf[Employee]
      other.firstName.equals(this.firstName) &&
      other.lastName.equals(this.lastName)
    }
  }

  override def toString: String = s"$firstName, $lastName"
}

val jon = new Employee("jon", "snow")
val jon2 = new Employee("jon", "snow")

jon.equals(jon2)
jon == jon2

//Eq is used to compare the references
jon eq jon2

val jon3 = jon2

jon3 eq jon2

//Using println it's called toString (overridden)
println(jon)