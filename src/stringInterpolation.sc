val bandName = "Muse"
val ticketPrice = 50

val text = s"$bandName organize a concert.\nPrice $$$ticketPrice"

val text2 = f"$bandName organize a concert.\nPrice $$$ticketPrice%1.2f"

val text3 =
  f"""$bandName organize a concert
     |Price $$$ticketPrice%1.2f
   """.stripMargin

val text4 = s"$bandName organize a concert.\nPrice $$${ticketPrice+10}"

//format like Java. SInce $ and % are reserved word
//to print the dollars you have to use $$ or %%
val text5 = f"$bandName organize a concert.\nPrice $$${ticketPrice+1}%1.2f"