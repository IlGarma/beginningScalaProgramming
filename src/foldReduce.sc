//foldLeft, foldRight, reduceLeft, reduceRight work on the same
//collection where you can use map, filter, flatMap...

//FoldLeft need a seed a function to perform the reduction
//THe first parameter of the lambda is the accumulator
//and the second is the current value
//The method starts from the left to right of the collection
(1 to 10).foldLeft(0)((total:Int, next:Int) => {
  println(s"Total: $total, next: $next")
  total + next
})

//You can use a shortcut
(1 to 10).foldLeft(0)(_+_)

//You can use sum to perform the same operation
(1 to 10).sum

//FoldRight works like foldLeft. Needs a seed but starts to iterate from
//the right to left and for this reason the first parameter of the
//lambda is the current value value the second is the accumulator
(1 to 10).foldRight(0)((next:Int, total:Int) => {
  println(s"Total: $total, next: $next")
  total+next
})

//ReduceLeft and reduceRight work like foldLeft and foldRight but
//they don't need any seed
(1 to 10).reduceLeft((total:Int, next: Int)=> total+next)
(1 to 10).reduceRight((next:Int, total:Int) => total + next)

List(1,2,3,4,5,6).reduceLeft((total:Int, next:Int)=> total*next)
List(1,2,3,4,5,6).reduceLeft(_*_)

//you can use product to perform the same operation
List(1,2,3,4,5,6).product

//You can apply aso on Option
Some(100).reduceLeft((total:Int, next:Int) => next+1)
