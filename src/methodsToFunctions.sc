class Foo(x:Int) {
  def baz(y:Int) = x+y
  def baz2(y:Int, z:Int) = x+y+z
  def qux(f:Int=>Int) = f(x)
  def qux2(f:(Int,Int)=>Int) = f(10,x)
}

val foo = new Foo(10)
foo.baz(20)

//With _, you can convert a method in a function
//This is a partially applied function and in detail a function1
val function1 = foo.baz _
function1(20)
foo.qux(function1)

//You have to specify the type you don't care (_)
//THis a function1
val function1_2 = foo.baz2(10, _:Int)
function1_2(10)

//THis a function2
val function2 = foo.baz2 _
foo.qux2(function2)
//Inline everithing
foo.qux2(foo.baz2 _)
//If _ is the last method parameter you can omit
foo.qux2(foo.baz2)

//Omitting _ and use infix notation
foo.qux2(foo baz2)
