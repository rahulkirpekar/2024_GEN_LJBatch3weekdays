package exceptiontopic;

// User Defined Exception--->Custom Exception
//----------------------------------------------------
// checked Exception
//public class InvalidAgeException extends Exception


//UN-checked Exception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
