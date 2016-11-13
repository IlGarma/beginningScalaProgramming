val m=100
//Th is is a closures, since m comes from environment
val f = (x:Int) => x+m

f(50)

//It's important to close around a stable variable a val and not a var
// otherwise the function result changes

var g=59
val f1=(x:Int, y:Int) => x+y+g

var result= f1(12,13)
println(s"the result is $result")

//Since g can change, also result if re-evaluated will change
g=0
result= f1(12,13)
println(s"the result is $result")