package Samples.Scala.String

object Interpolator_String {
    
   def main(args: Array[String]) {
       
      val name = "James"
      
      println(s"Hello, $name");
      println(s"1 + 1 = ${1 + 1}");
      println(raw"1 + 1 = ${1 + 1}");
      println(raw"Result = \n a \n b");  
      println(raw"Result = ${100 + 1999}");  
      
   }
}

/*
object Interpolator_Raw {
   def main(args: Array[String]) {
      println(raw"Result = \n a \n b");  // raw will retrun as raw string with out space inbetween the string
      println(s"Result = \n \n a \n \n b");  //  \n use for blank lines
   }
}


*/