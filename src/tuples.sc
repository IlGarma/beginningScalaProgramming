//The tuples are containers. You can store from 2 to 22 elements
val t = (1, "text", 400.98)
val t1:(Int, String, Double) = (1, "hi", 7.9)
val t2:Tuple3[Int, String, Double] = (1,"hello", 9.0)
//To access use _index where index starts from 1
t._1
t._2
t._3

//The tuples are immutable, for this reason swap doesn't change the tuple
val d = (1, "text")
d.swap
d

//You can define a tuple also in this way
val d1 = 1 -> "text"