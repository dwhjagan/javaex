package Samples.Scala.Function

import java.util.Date

object Fun_Partially_Applied {
    
 //---------------------------------------------------------
   def main(args: Array[String]) {
     val date =  new Date
      
      val logWithDateBound = log(date, _ : String)
//--------------------------------------------------------- 
      logWithDateBound("message1" )
      Thread.sleep(10)
      
      logWithDateBound("message2" )
      Thread.sleep(10)
      
      logWithDateBound("message3" )
      Thread.sleep(10)

   }
//---------------------------------------------------------
   def log(date: Date, message: String) = {
      println(date + "  ----  "+ message)
   }
}




/*
      
      logWithDateBound("message2" )
      Thread.sleep(10)
      
      logWithDateBound("message3" )
      Thread.sleep(10)
      
      logWithDateBound("message4" )
      Thread.sleep(10)
      
      logWithDateBound("message5" )
      Thread.sleep(10)
      
      logWithDateBound("message6" )
      Thread.sleep(10)
      */