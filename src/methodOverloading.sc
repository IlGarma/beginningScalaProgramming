//Method overloading, same method name but different parameter types
//the signature must be different

def add(x:Int, y:Int) = x+y
def add(x:Double, y:Double) = x+y
def add(x:String, y:String) = x+y

//def add(x:Int, y:Int): Double = x+y -->Doesn't work, conflict with the first method

add(3,4) //first method
add(3.0,4.0) //second method
add(3.0, 4) //second method
add("test", "123") //third method