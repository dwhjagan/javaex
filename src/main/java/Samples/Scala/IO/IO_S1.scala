package Samples.Scala.IO

import java.io._

object IO_S1 {
   def main(args: Array[String]) {
      val writer = new PrintWriter(new File("test1.txt" ))
      writer.write("Hello Scala 375987394529345983759823984395937597395349857398759384759348875 Jagan\n");
      writer.write("1111111111111111111111111111111111111111111");
      writer.close()
   }
}