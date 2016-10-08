val text1 = "text %s".format("testo1")

val text2 = "text1 %s, text2 %s".format("test1", "test2")

val text3 = "text1 %2$s, text2 %1$s".format("test2", "testo1")

import java.time._

val text4 ="Oggi è il mese %1$tB, il giorno %1$te, l'anno %1tY".format(LocalDateTime.now)

val text5=
  """Smart string
    |new line %s
    |second line %s
  """.stripMargin.format("text1", "text2")



