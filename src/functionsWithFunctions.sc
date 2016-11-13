//A function can take as parameter a function
//High order function

val f:(Int, Int=>Int) =>Int = (x:Int, y:Int=> Int) => y(x)

//simpler, omitting the type
val f1_1 = (x:Int, y:Int=>Int) => y(x)

//You can invoke like
f(1, (m:Int) => m+1)

//simpler, you can omit the type of m since we already know that it's an Int
f(1, m=>m+1)

//simpler, since m is the only parameter we can use _

f(1, _+1)

//we can flip _+1 to 1+_
f(1, 1+_)

//we can omit _ since it's the last parameter
//in general it should be displayed a warning, since we should import postfixOps package
import scala.language.postfixOps
f(1, 1+)


//A function can return a function
val g:(Int)=>Int=>Int = (x:Int) => (y:Int) => x+y
g(2)(3) //this is the currying
