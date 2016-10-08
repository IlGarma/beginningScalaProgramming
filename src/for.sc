for(a<- 1 to 100) {
  println(a)
}

val x = List(1,2,3,4)
var result = List[Int]()

for (a<-x) {
  result = result :+ (a+1)
}
println(result)

val result2 = for(a<-x) yield (a+1)