package Edu2.Module_10_Assignments.src.module10.junit;

@SuppressWarnings("serial")
public final class ArrayDataException extends Exception 
{
	public ArrayDataException(String message)
	{ super(message); }

	public ArrayDataException(String message, Throwable cause)
	{ super(message, cause); }

	@Override
	public String getMessage()
	{ return super.getMessage(); }
	
	@Override
	public String toString()
	{ return super.toString(); }
}
