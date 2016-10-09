//beanproperty is useful to create getters and setters Java style
import scala.beans.BeanProperty

class Employee(@BeanProperty val name: String, @BeanProperty var age: Int)

val jon = new Employee("jon", 25)

jon.name
jon.getName

//With the normal to access the parameter, Scala style, you can access
//read with the new getters and setters created using the annotation
//@BeanProperty
jon.age
jon.getAge
jon.age= 45
jon.age
jon.setAge(46)
jon.getAge