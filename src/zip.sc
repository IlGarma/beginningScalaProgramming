//Zip combine two collections in one collection
//It takes the first element of the first collection
//the second element of the first and the second of the second collection
//and so on

val a = List(1,2,3)
val b= List(4,5,6)
a zip b

//In case of a collection shorter then another then the number
//of the elements depends on the shorter collection
val c= 1 to 5
val d = 6 to 9

c zip d

//same as the first is short
val e = 1 to 3
val f = 10 to 100

e zip f

//It works on every collections where you can apply map, filter, flatMap
//and so Option, also
Some(100) zip Some(1)