package Samples.Scala.Array

import Array._

object Concatenate_Array {
   def main(args: Array[String]) {   // Main method
       
      var myList1 = Array(1.9, 2.9, 3.4, 3.5)
      var myList2 = Array(8.9, 7.9, 0.4, 1.5)

      var myList3 =  concat( myList1, myList2)
      
      // Print all the array elements
      //we often use loop contol structures because all of the elements in an array are of the same type and the size of the array is known.

      for ( x <- myList3 ) {
         println( x )
      }
   }
}

