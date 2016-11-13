//YOu can defin function with 0 arguments up to 22
val f1:Function1[Int,Int]= new Function[Int,Int] {
  def apply(x:Int) = x+1
}
f1.apply(2)
f1(2)

//You can define in a more simpler way
val f2:Int=>Int = new Function[Int,Int] {
  def apply(x:Int) = x+1
}

f2(2)

//more simpler

val f3:Int=>Int = (x:Int) => x+1
f3(2)

//more simpler
val f4 = (x:Int) => x+1
f4(2)

//Function2
val z:Function2[Int,String,String]= new Function2[Int,String,String] {
  def apply(x:Int, y:String) = x+y

}

val z1:(Int,String) => String = new Function2[Int,String, String] {
  def apply(x:Int, y:String) = x+y
}

val z2:(Int,String)=>String = (x:Int, y:String)=>x+y
val z3 = (x:Int, y:String) => x+y
z3(4, "hi")

//Function 0
val d0:Function0[Int]= new Function0[Int] {
  def apply(): Int = 1
}

//more simpler
val d1: ()=>Int = new Function0[Int] {
  override def apply(): Int = 1
}

//more simpler
val d2: ()=>Int = ()=>1

//more simpler
val d3 = () =>1

//You can return just one item from the method, but you can use tuple
val t: String => (String, Int) = (x:String) => (x, x.size)
t("jon snow")