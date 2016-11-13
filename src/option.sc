class Person (name:String, val middleName : Option[String], lastName: String) {
  def this(name:String, lastName:String) = this(name, None, lastName)
  def this(name: String, middleName: String, lastName:String) =
    this(name, Some(middleName), lastName)
  def this() = this("Unknon", None, "Unknown")
}

val jonSnow = new Person("Jon", "Snow")
jonSnow.middleName
val middleName2: Option[String] = jonSnow.middleName

//Nothing is a subtype of every other type (including Null); there exist no instances of this type.
val middleName: Option[Nothing] = None


val jonMrSnow = new Person("Jon", "Mr", "Snow")
val noName = new Person

//To extract the value use get if you are sure that the value exists otherwise
//better to use getOrElse

jonMrSnow.middleName.get
jonSnow.middleName.getOrElse("no middle name")


//You can use also pattern matching to extract the values
jonMrSnow.middleName match {
  case Some(s) => s
  case None => "no middle name"
}

jonSnow.middleName match {
  case Some(s) => s
  case None => "no middle name"
}
