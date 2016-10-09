//method with parameter type T. The return type is T
def choice[T](a:Boolean, x:T, y:T) = if (a) x else y

//method with two parameter types T and R.
//Since the method can return x of type T or y of type Y
//the return type of the method is the supertype Any
def choice2[T,R](a:Boolean, x:T, y:R) = if (a) x else y

//return type String
choice(true, "First", "Second")

//return type Any
choice2(true, "first", 2)
