//Filter return only the elements matching a predicate
//A predicate is a function returning a boolean
val range = 1 to 10

range.filter(x=>x%2==0)
//Simpler
range.filter(_%2==0)

//filterNot is the opposite of filter
//So return only the elements not matching the predicate
range.filterNot(x=>x%2==0)
range.filterNot(_%2==0)

//exists return true if at least an element match the predicate, otherwise false
range.exists(_%2==0)
range.exists(_>100)

val m=Map(1->2, 2->3, 3->4)
//filterKeys works on the keys of the map
m.filterKeys(_%2==0)