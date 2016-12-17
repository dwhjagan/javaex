package Samples.Scala.CaseStatement

object ifthenelseCon {
   def main(args: Array[String]) {
      var x = 31;

//  Body begin ---Boolean does not take parameters

      if( x < 20 ){
         println("This is if statement");
      } 
      
      else if( x == 10 ){
         println("This is else statement 1");
      }
      
       // conditional if statment    
      
      else if( x == 0 ){
         println("This is else if statement 2 ");
      } 
      
      else if( x == 10 ){
         println("Value of X is 10");
      } 
      
      else if( x == 31 ){
         println("This is else statement 31");
      }
      
      
      else{
         println("This is else statement 2");
      }
      
  //  Body end  -- Boolean does not take parameters
  
   }
}