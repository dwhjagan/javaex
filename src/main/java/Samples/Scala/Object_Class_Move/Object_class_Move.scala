package Samples.Scala.Object_Class_Move

// -------------------------------------  class
class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
// Method
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
//  Print
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}
// ------------------------
object Object_class {
   def main(args: Array[String]) {
      val pt = new Point(20, 30);
      // Move to a new location
      pt.move(20, 30);
// -------------------------------------
   }
}