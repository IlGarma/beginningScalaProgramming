//Given a list I want to order and println with the index

val a= List("milk", "apple", "kiwi", "bread", "meat", "fish")

a
  .view
  .sorted
  .zipWithIndex
  .map(t=>(t._1, t._2+1))
  .map(_.swap)
  .map(t=>s"${t._1}. ${t._2}")
  .mkString("\n")