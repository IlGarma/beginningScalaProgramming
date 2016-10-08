val text1 = "text %s".format("testo1")

val text2 = "text1 %s, text2 %s".format("test1", "test2")

//yo can specify the substituon element
//with %{element_number}$s
val text3 = "text1 %2$s, text2 %1$s".format("test2", "testo1")

import java.time._

//%1$tB = extract the month from the only parameter in the method format (it's a date)
//%1$te = extract the day from the parameter of format
//%1$tY = extract the year from the format parameter
val text4 ="Oggi è il mese %1$tB, il giorno %1$te, l'anno %1tY".format(LocalDateTime.now)

val text5=
  """Smart string
    |new line %s
    |second line %s
  """.stripMargin.format("text1", "text2")



