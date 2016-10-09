//Named arguments
def add (x:Int, y:Int) = x+y
add(y=4, x=5)

def decide (x:Boolean, a:Int, b:Int) = if (x) a else b
decide(b=5, a=4, x=true)

//Default parameter -> case last aurgument

def decide2(x:Int, y:Int, a:Boolean=true) = if (a) x else y
decide2(3,4)

//Default parameter -> case not last argument

def decide3(a:Boolean=true, x:Int, y:Int) = if (a) x else y

// decide3(3,4) doesn't work since the compiler
// doesn't know how to fit these arguments with decide3 signature
//to fix this use named parameter

decide3(x=3, y=4)
