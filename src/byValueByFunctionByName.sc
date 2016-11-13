//Basically exist 3 different ways to pass parameter to a method
//By value (Default)
//By function, if it's passed a function as a parameter. Lazy evaluation
//By name, the call to this method having a by name parameter
// looks like a by value call but it's lazy evaluated. You have to use
//y: =>Int
//in the method definition
class Test {
  def foo(x:Int)(y:Int) = {
    println("In the method")
    x+y
  }

  def foo2(x:Int)(y:()=>Int) = {
    println("In the method")
    x+ y()
  }

  def foo3(x:Int)(y: =>Int) = {
    println("In the method")
    x+y
  }
}

//This is the default call, by value
//In this case, the second parameter is evaluated when it's passed
//to the method, so before the sum is perform
val test = new Test
test.foo(3)({
  println("in the call")
  4
})


//This is a by function call
//IN this case the function0 is evaluated only when it's performed the sum
//Lazy evaluation
test.foo2(3) ( () => {
  println("in the call")
  4
})

//Since this a by name call, it's lazy evaluated
//so only when it's calculated the sum then it's evaluated
//the second parameter of the method
//Lazy evaluation
test.foo3(3)({
  println("in the call")
  4
})

