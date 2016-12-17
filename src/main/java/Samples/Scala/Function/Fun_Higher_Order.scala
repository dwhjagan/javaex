package Samples.Scala.Function

object Fun_Higher_Order {
    //------------------------------------------------
   def main(args: Array[String]) {
      println( apply( layout, 10) )
   }
//------------------------------------------------
  def apply(f: Int => String, v: Int) = f(v)
//------------------------------------------------
   def layout[A](x: A) = "[" + x.toString() + "]"
   //------------------------------------------------
}