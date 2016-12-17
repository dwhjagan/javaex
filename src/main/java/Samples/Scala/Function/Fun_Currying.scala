package Samples.Scala.Function
object Fun_Currying {
   def main(args: Array[String]){

      val str1:String = "Hello, "
      val str2:String = "Scala!"
  println( "str1 + str2 = " +  strcat(str1)(str2) )  // first Method
  println( "str1 + str2 = " +  str1 + str2 )         // No Method
   }

  def strcat(s1: String)(s2: String) = {s1 + s2}
  // create user defined function and call it in above println
}