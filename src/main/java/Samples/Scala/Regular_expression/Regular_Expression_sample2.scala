package Samples.Scala.Regular_expression

object Regular_Expression_sample2 {
   def main(args: Array[String]) {
      val pattern = "(S|s)cala".r
      val str = "Sscala is scalable and cool"
      
      println(pattern replaceFirstIn(str, "Java"))
   }
}