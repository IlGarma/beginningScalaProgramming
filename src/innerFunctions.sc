import scala.annotation.tailrec

//you can place a function in another function
//if the inner function is used only from the outer function
def factorial (n:BigInt): BigInt = {

  @tailrec
  def fact(n:BigInt, acc: BigInt): BigInt = {
    if (n==0 || n==1) acc
    else fact(n-1, acc * n)
  }

  fact(n,1)

}

factorial(5)
factorial(100)
factorial(100000)