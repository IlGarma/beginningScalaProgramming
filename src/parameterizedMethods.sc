//there is parameterized parameter of type T at class level
//and a new parameterized parameter of type U at method level
class Box[T](val t:T) {
  def swap[U](t:T, u:U) = s"${t}, ${u}"
}

val test = new Box("text")
test.swap("new test", 44.4) //the first parameter must be equal of the constructor of the class, so must be a string
