package Samples.Scala.Loop

object Infinite_loop {
   def main(args: Array[String]) {
      var a = 10;
      
      // An infinite loop. ( if you change while condition to True then it will run in infinte mode)
      while( false ){
         println( "Value of a: " + a );
      }
   }
}