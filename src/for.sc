for(a<- 1 to 100) {
  println(a)
}

val x = List(1,2,3,4)
var result = List[Int]()

for (a<-x) {
  result = result :+ (a+1)
}
println(result)

//yield works an an accumulator
//when the for end, the buffer is returned
//the type of the buffer is the same of the
//element you are iterating on
val result2 = for(a<-x) yield (a+1)