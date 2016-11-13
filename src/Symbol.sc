//Symbol is an object, it has always an interned representation

//A string can be defined in two different ways
//This is not interned representation
val s = new String("test")

//This is an interned representation
//So a new string "test" is created only if no other string "test"
//has been already created
val s1 = "test"

//The two string has the same value
s == s1

//The two string point two different memory location
s eq s1

//In this case no other "test" is created since exist already s1
val s2 ="test"

s1 == s2
s1 eq s2

//If you want to be sure to have an interned representation, you can use Symbol
//The first way to declare
val sym = Symbol("test")

//The second may to declare
val sym1 = 'test

//Since the representation is always interned, sym and sym1 are referring the
//same memory location
sym eq sym1
sym == sym1