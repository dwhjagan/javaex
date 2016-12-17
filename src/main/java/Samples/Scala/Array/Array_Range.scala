package Samples.Scala.Array

import Array._
// An array is used to store a collection of data, but it is often more useful to think of an array as a collection 
//of variables of the same type.
//we often use loop control structures because all of the elements in an array are of the same type and the size of the array is known.

object Array_Range {                             //Objects
   def main(args: Array[String]) {               //Method

      var myList1 = range(10, 20, 2);           //Variable
      var myList2 = range(10,20,1);            

      // Print all the array elements
      for ( x <- myList1 ) {
         print( " " + x );
      }

     println()                             // Print in the Seperate line.
      for ( y <- myList2 ) {
         print( " " + y )
        }
     println()                            // Get the space end of the line
}
}