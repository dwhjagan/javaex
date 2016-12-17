package Samples.Scala.Move

/*
Object − Objects have states and behaviors. An object is an instance of a class.
 Example − A dog has states -
color, name, breed as well as behaviors - wagging, barking, and eating.

Class − A class can be defined as a template/blueprint that describes the
behaviors/states that are related to the class.

Methods − A method is basically a behavior. A class can contain many methods.
It is in methods where the logics are written,
data is manipulated and all the actions are executed.
logics, data manipulation, actions that need to be executed.

*/
//------------------------------------------------------------

class Point_c1(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc

   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

//------------------------------------------------------------
class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Point_c1(xc, yc){

   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
       
      x = x + dx
      y = y + dy
      z = z + dz
      
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
   }
}
//------------------------------------------------------------

object Extended_class {
   def main(args: Array[String]) {
      val loc = new Location(10, 20, 15);

      // Move to a new location
      loc.move(90, 50, 5);
   }
}
//------------------------------------------------------------