package Samples.Scala.Array

import Array._
 
object Multiple_Array {                                      // Objects
    
   def main(args: Array[String]) {                           //Method
      var myMatrix = ofDim[Int](6,6)                         //Var
      
// build a matrix
      
      for (i <- 0 to 5) {             // 0 - is the starting position and 5 is the ending poition and length. forward and backward length.
         for ( j <- 0 to 5) {
            myMatrix(i)(j) = j;      // Define Matric
         }
      }
      
// Print two dimensional array
      
      for (i <- 0 to 5) {
         for ( j <- 0 to 5) {        // 0 - is the starting position and 5 is the ending poition and length. forward and backward length.
            print(" " + myMatrix(i)(j));   // print the matrix 
         }
         println();
     //      println();              // To get space between the lines..blank space..
      }
   }
}
