//the constructor near class is the most important one
//it has all the possible parameters
//the other auxiliary constructors must call this constructor
//directly or indirectly

//The auxiliary constructor can be created in 5 different way
//The first way is the preferred one
class Employee(val name: String, val age: Int) {

  //Most common way
  def this(name: String) = this(name, 18)

  //Multiline
  /*def this(name:String) = {
    this(age, 18)
  }
  */

  //With side effect
 /*
  def this(name: String) = {
    this(name, 18)
    println("side effect")
  }
  */

  //INVALID
  //The keyword "this" must be the first statement of the block. See before
  /*
  def this(name: String) = {
    println("side effect")
    this(name, 18)
  }
  */


  //Without equal
  /*def this(name:String) {
    this(name, 18)
  }
  */

  //Without equal and with side effect
  /*def this(name:String) {
    this(name, 18)
    println("side effect")
  }
  */

}

val jon = new Employee("jon")
jon.age
jon.name