class Foo(x:Int) {
  def bar(y:Int) = x+y
  def baz(a:Int, b:Int) = x+a+b
  def qux() = new Foo(x)
}

//You can use infix notation to call a method
val foo = new Foo(3)
foo.bar(2)
foo bar 2
foo.baz(3,4)
//You need parenthesis if the method need two o more parameters
foo baz (3,4)

foo.qux().bar(3)
foo qux() bar 3

//Algebric operations use infix notation
3 + 4
3.+(4)