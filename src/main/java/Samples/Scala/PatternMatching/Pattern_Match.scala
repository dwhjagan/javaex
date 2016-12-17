package Samples.Scala.PatternMatching

object Pattern_Match {
   def main(args: Array[String]) {
      println(matchTest(1))
   }
   
   def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
   }
}