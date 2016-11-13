//Range are a collection of numbers or characters

//TO create a range inclusive
val r = 1 to 10

//TO create a range exclusive
val r1 = 1 until 10

//You can specify a step
val r2 = 1 to 10 by 2
val r3 = 10 until 1 by -3

//Range of characters
val rc = 'a' to 'z'

//Create a collection of lowercase and uppercase characters
rc ++ ('A' to 'Z')

//You can create via companion object

//This an exclusive range
val r4 = Range(1,10)
val r5 = Range(1,10,2)

//THis is an inclusive range
val r6 = Range.inclusive(10,1,-2)

//The ranges are used in the for cycles
for (i <-1 to 10) println(i)

print("-----------------")
for (i <-10 until 1 by -2) println(i)



