//All the simple type have AnyVal as supertype
//while the object AnyRef (string is an object)
//The supertype of AnyRef and AnyVal is Any
def add(x:Int, y:Int) = {
  if (x>=10) x+y
  else (x+y).toString
}

add(10,6)
add(6,10)

def add2(x:Int, y:Int):AnyVal = {
  if (x>=10) x+y
  else (x+y).toDouble
}

add2(10,6)
add2(6,10)