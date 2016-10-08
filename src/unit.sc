//To return Unit or explicitly set Unit or drop the equal

def add(x:Int, y:Int): Unit = {
  x+y
}

def add2(x:Int, y:Int){
  x+y
}

add(3,4)
add2(3,4)

//Function accept in input a Unit and return an Int

def crazy(x:Unit): Int = 40

crazy(():Unit)


//Supertype of Unit is AnyVal
def compare(x:Int, y:Int) = {
  if (x>y) ():Unit
  else x
}

compare (10,3)
compare(3,10)