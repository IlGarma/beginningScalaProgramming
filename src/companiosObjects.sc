//bullets it's shared between all instance of the class SecretAgent
object SecretAgent{
  private var bullets = 3000

  private def decrement(count: Int) = {
    if (bullets-count<0) bullets = 0
    else bullets = bullets - count
  }

  def totalBullets = bullets
}

//Class can use private methods of the companion objects
class SecretAgent(val name: String) {

  def shoot(bullets: Int) = {
    SecretAgent.decrement(bullets)
  }

}


val james = new SecretAgent("james")
val jon = new SecretAgent("jon")
james.shoot(1000)
jon.shoot(500)
SecretAgent.totalBullets


//object can use private method of the class
class Person private (val name: String, surname: String)

object Person {
  def create(name: String, surname: String) = new Person(name, surname)

}

//cannot use new since the constructor is private
//val jonPerson = new Person("jon", "snow")
val jonPerson = Person.create("jon", "snow")
jonPerson.name
