package Samples.Scala.String

object Closures_multiplier {
    
   def main(args: Array[String]){
       
      println( "multiplier(1) value = " +  multiplier(1))
      println( "multiplier(2) value = " +  multiplier(2))
      
   }
 
   var factor = 30
   val multiplier = (i:Int) => i * factor
   
}

