//For comprehensions is a for and yied
//Yield is like a buffer. For every iteration yield a value
//and at the end return a collection of the same type
val result = for (i<-1 to 10) yield i

//In a for comprehensions you can add guards, like if
val result2 = for (i <- List(1,2,3,4,5) if i%2==0) yield i

val result21 = List(1,2,3,4,5).filter(_%2==0)

//If you want iterate on two collection, you have to separate them via semicolon ;
val result3 = for (i<-List(1,2,3,4,5) if i%2==0;
                  j<-List(6,7,8,9,10) if j%2==0) yield (i,j)

//A for comprehensions is translated in map, filter, flatMap
//and can be applied to all the structures where map, filter can be applied
val result31 = List(1,2,3,4,5).filter(_%2==0)
  .map(i=> List(6,7,8,9,10).filter(_%2==0).map(j=>(i,j))).flatten

val result32 = List(1,2,3,4,5).withFilter(_%2==0).flatMap(i=>List(6,7,8,9,10).filter(_%2==0).map(j=>(i,j)))

//Use with an Option
val result4 = for (i<-Some(100)) yield i+1


val result41 = Some(100).map(_+1)

import scala.language.postfixOps
val result42 = Some(100).map(1+)
