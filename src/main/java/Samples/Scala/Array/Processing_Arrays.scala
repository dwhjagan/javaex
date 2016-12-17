package Samples.Scala.Array

object Processing_Arrays {
   def main(args: Array[String]) {
      var myList = Array(1.9, 2.9, 3.4, 3.5,10.0,20.0,30.0)
      
      // Print all the array elements **************************
      for ( x <- myList ) {
         println( x )
      }

      // Summing all elements    *************************
      var total = 0.0;
      
      for ( i <- 0 to (myList.length - 1)) {    // i - starting position from left to right, length - 1 from right to left..
         total += myList(i);
      }
      println("Total is " + total);

      // Finding the largest element   *************************
      var max = myList(0);
      
      for ( i <- 0 to (myList.length - 1) ) {
         if (myList(i) > max) max = myList(i);
      }
      
      println("Max is " + max);
   }
}