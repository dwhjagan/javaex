package Edu2.module4;

import Edu.module4.*;

/**
 * Dividing the first integer array with the second and storing the result in 
 * a float array.
 * If the array sizes are different then {@link Edu.module4.ArrayDataException} is thrown.
 * This class demonstrates nested exceptions.
 * @author pbose
 *
 */
public final class TestNestedException 
{
	public static void main(String[] args) 
	{
		int [] array1 = {2, 3, 4, 5, 6},
			   array2 = {3, 6, 7, 9, 9};
		float [] result = null;
		
		try
		{
			if (array1.length != array2.length)
				throw new Edu.module4.ArrayDataException("For dividing arrays, they should be of the same size.");
			
			try
			{
				result = new float[array1.length]; // Allocate memory only on success
				
				for (int i = 0; i < array1.length; i++)
					result[i] = (float)array1[i]/array2[i];
			}
			catch(ArithmeticException e)  // Handling math related exceptions
			{ 
				e.printStackTrace(); 
			}
			catch(ArrayIndexOutOfBoundsException e) // Handling array cell access exceptions
			{ 
				e.printStackTrace(); 
			}
		}
		catch(Edu.module4.ArrayDataException e) // For any other type of exception, control will come here.
		{ 
			e.printStackTrace(); 
		}
		finally
		{
			if (result != null)
			{
				for (int i = 0; i < result.length; i++)
					System.out.println(result[i]);
			}
			else System.out.println("Error occurred.");
				
		}
	}
}

