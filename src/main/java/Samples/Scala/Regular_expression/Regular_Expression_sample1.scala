package Samples.Scala.Regular_expression

import scala.util.matching.Regex

object Regular_Expression_sample1 {
   def main(args: Array[String]) {
       
      val pattern = new Regex("(S|3)cala")          // Here we have used the pipe line for the second match.
      val str = "Scala is 123calable and cool"
      
      println((pattern findAllIn str).mkString(","))  // find the findAllIn and retrun the matching..remember wer have used the comma operator.
   }
}