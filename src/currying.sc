//This a curried function, the parameters can be split into different functions
//returning functions from functions
val fc:Int=>(Int=>Int) = (x:Int) => (y:Int) => x+y
fc(3)(4)

//This in the uncurried version
//Please note this is the uncurried version of fc
val fu:(Int,Int)=>Int = (x:Int, y:Int)=>x+y
fu(3,4)

//You can automatically convert a function in a curried one
//fc1 is equal to fc
val fc1= fu.curried
fc1(3)(4)

//You can uncurry a function automatically, also
//fu1 is equal to fu
val fu1= Function.uncurried(fc1)
fu1(3,4)