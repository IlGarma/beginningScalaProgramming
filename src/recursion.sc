def factorial (n:BigInt): BigInt = {
  if (n ==0 || n==1) 1
  else n * factorial(n-1)
}

factorial(5)
factorial(100)
factorial(100000) //there is a stack overflow. We need to optimize using @tailrec annotation