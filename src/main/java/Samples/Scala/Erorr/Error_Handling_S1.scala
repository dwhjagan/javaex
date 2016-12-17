package Samples.Scala.Erorr

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Error_Handling_S1 {           // Object
   def main(args: Array[String]) {   // Main Method
       
      try {
         val f = new FileReader("input129.txt")
      } catch {
         case ex: FileNotFoundException =>{
            println("Missing file exception")
         }
         
         case ex: IOException => {
            println("IO Exception")
         }
      }
   }
}