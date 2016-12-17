package Samples.Scala.Regular_expression

import scala.util.matching.Regex

object Regular_Expression {
   def main(args: Array[String]) {
       
      val pattern = "Scala1".r
      val str = "Scala is Scala1ble and cool"  // find the matching and retrun some( pattern matching string)
      
      println(pattern findFirstIn str)
   }
}