import scala.annotation.tailrec

//to use tailrec annotation the result of the method invocation
//must be immediately returned (see else statement)
@tailrec
def factorial(n: BigInt, acc: BigInt) : BigInt = {
  if (n==0||n==1) acc
  else factorial(n-1, n*acc)
}

factorial(5,1)
factorial(100,1)
factorial(100000,1)


//using an new method avoiding to pass 1 to the method call
def fact (n:BigInt) = factorial(n,1)

fact(5)
fact(100)
fact(100000)