//groupBy create a Map from a collection grouping by a function
//the function give also the key
val a =List("hi", "jon", "snow", "game", "of", "thrones")

a.groupBy(x=>x.head)
