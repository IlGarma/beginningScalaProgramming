class Test {
  def f(x:Int, y:Int, z:Int) = x+y+z
  def f1(x:Int)(y:Int)(z:Int) = x+y+z
  def f2(x:Int, y:Int)(z:Int) = x+y+z
}

val test = new Test
test.f(3,4,5)
test.f1(3)(4)(5)
test.f2(3,4)(5)

val pa = test.f(3, _:Int, _:Int)
pa(4,5)

val pa1 = test.f1(3) _
pa1(4)(5)

val pa2 = test.f2(3, _:Int) _
pa2(4)(5)