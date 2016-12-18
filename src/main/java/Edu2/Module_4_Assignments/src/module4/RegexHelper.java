package Edu2.Module_4_Assignments.src.module4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * A class RegexHelper where the inputs will be the Regex expression
 * and the input string to parse.
 * Uses the try-with-resources block.
 * DOES NOT handle the ParseSyntaxException, that's what you need to do.
 * @author pbose
 *
 */
public final class RegexHelper 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			/** possible Regex input 
			 * (for){2}
			 * (hand)|(some)
			 */
			System.out.print("Enter regex: ");
			/** possible input 
			 * for the 1st input: forfor
			 * for the 2nd input: some people are handsome
			 */

	        Pattern pattern = Pattern.compile(sc.nextLine());
	        System.out.print("Enter input string: ");
	        Matcher matcher = pattern.matcher(sc.nextLine());

	        boolean found = false;   
	        while (matcher.find()) 
	        {
	            System.out.println("Found text " + matcher.group() + 
	            		" starting at index=" + matcher.start() +
	            		" and ending at index=" + matcher.end());
	            found = true;
	        }
	        
	        if(!found)
	        	System.out.println("No match found.");
		}
	}
}
