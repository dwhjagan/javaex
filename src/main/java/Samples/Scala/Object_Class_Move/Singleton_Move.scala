package Samples.Scala.Object_Class_Move

class Points(val xc: Int, val yc: Int) {       // Class
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {               // Method
      x = x + dx
      y = y + dy
   }
}

object Singleton_S1 {                        // Object
   def main(args: Array[String]) {           // Main Method
      val point = new Points(100, 20)        // Main Method Variable
      printPoint
      def printPoint{                        // Method
         println ("Point x location : " + point.x);
         println ("Point y location : " + point.y);
      } 
   }
}