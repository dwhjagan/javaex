package Samples.Scala

/**
  * Created by janaidu on 17/12/2016.
  */
object DemoVar {
   def main(args: Array[String]) {

// Variable

      var myVar :Int = 10;
      val myVal :String = "Hello Scala with datatype declaration.";

      var myVar1 = 20;
      val myVal1 = "Hello Scala new without datatype declaration.";

      val (myVar2: Int, myVar3: String) = Pair(40, "Foo");

// Print
      println(myVar); println(myVal);
      println(myVar1); println(myVal1);
      println(myVar2); println(myVar3);
//closing
   }
}
