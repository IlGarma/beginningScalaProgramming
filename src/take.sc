//the function Take keeps the first x element starting from the left of a collection

(1 to 100).take(10)

//takeRight keeps the latest n elements
(1 to 100).takeRight(10)


//takeWhile apply a function to a collection and when it found the first element
// that doesn't match then it end

//Since 1 is the first value not matching
(0 to 100).takeWhile(x=> {
  println(x)
  x%2==0
})

(0 to 10).takeWhile(_<10)
