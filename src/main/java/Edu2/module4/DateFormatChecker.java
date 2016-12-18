package Edu2.module4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DateFormatChecker {

	public static void main(String[] args) 
	{
        // regex for date with DD/MM/YYYY format
        String pattern = "[0-9]{2}/[0-9]{2}/[0-9]{4}";

        String date_input = "31/12/2015 falls on Thursday";
        
        //Create a pattern object
        Pattern pat = Pattern.compile(pattern);        
        //Create a matcher object
        Matcher m = pat.matcher(date_input);
        
        if (m.find()) 
            System.out.println("DD/MM/YYYY format: Yes");
        else 
        	System.out.println("DD/MM/YYYY format: No");
	}
}
