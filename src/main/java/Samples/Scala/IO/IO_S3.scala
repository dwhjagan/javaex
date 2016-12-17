package Samples.Scala.IO
import scala.io.Source
object IO_S3 {
   def main(args: Array[String]) {                 //Main Method.
      println("Following is the content read:" )   //print.
      Source.fromFile("Demo.txt" ).foreach {       //Source File.
         print 
      }
   }
}