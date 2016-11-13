//Foreach is similar to Map, but in detail accept a function returning a Unit
//so it's specific to perform side effects
val range = 1 to 10

range.foreach(x=>println(x))

//Since x is the only value, you can use _
range.foreach(println(_))

//You can remove useless parenthesis
range.foreach(println _)

//Since _ is the last character, you can omit
range.foreach(println )

//You can use the infix notation
range foreach println

//You could use map, instead of foreach but remember map return a collection
//and since println return Unit, at the end you will have a collection on Unit
range.map(x=>println(x))
range map println

