package Samples.Scala.String

object Interpolator_Raw {
   def main(args: Array[String]) {
      println(raw"Result = \n a \n b");  // raw will retrun as raw string with out space inbetween the string
      println(s"Result = \n \n a \n \n b");  //  \n use for blank lines
   }
}

