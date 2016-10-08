val text1 =
  """text 1
                text2
                text3"""

text1

val text2 =
  """text34
    |text45
    | text46
  """.stripMargin


val text3=
  """text2
    @text44
    @    text46
  """.stripMargin('@')

//with smart string in case of regex you can avoid to escape special
//character like \
val regex ="""\s""".r
val regex2 ="\\s".r