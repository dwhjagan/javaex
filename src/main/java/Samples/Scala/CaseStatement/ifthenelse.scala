package Samples.Scala.CaseStatement

object ifthenelse {
   def main(args: Array[String]) {
      var x = 31;

//  Body begin ---Boolean does not take parameters

      if( x < 20 ){
         println("This is if statement");
      } 
      
      else if( x > 10 ){
         println("This is else statement 1");
      }
      
            else{
         println("This is else statement 2");
      }
      
  //  Body end  -- Boolean does not take parameters
  
   }
}