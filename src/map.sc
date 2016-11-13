//Map is a collection of keys, values.
// It is a collection of tuples, in details
val m = Map((1,2), (3,4), (5,6))

//Since you can define a tuple like 1->2
val m1 = Map(1->2, 3->4, 4->6)

//To get the value corresponding to the key 1. The result is an option
m.get(1)
m.get(100) //return None since the key 100 doesn't exist

//To get the value in an insecure way, you can use apply.
// If the key doesn't exist, you will receive an exception
m(1)

//To get all the keys in as iterabe
m.keys

//To get all the key in a Set
m.keySet

//To get all the values in a MapLike structure
m.values

//TO get all the values in a List
m.values.toList

//You can use Symbol to represent the key (See symbol worksheet)
val s = Symbol("test") //this is a Symbol
val s1 = 'test2 //this a Symbol

val m2 = Map(s-> "hi", s1 ->"hello", 'jon -> "snow")
m2.get('test)
m2.get('snow) //none since the Symbol snow doesn't exist
m2('test2)