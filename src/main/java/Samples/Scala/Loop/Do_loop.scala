package Samples.Scala.Loop

object Do_loop {
   def main(args: Array[String]) {

      var a = 10;

      do {
         println( "Value of a: " + a );
         a = a + 1;
      }
      while( a < 15 )
   }
}