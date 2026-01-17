package exceptionHandling;


public class Class_4
{

	
	
	

	public static void main(String[] args) 
	{
//		throw - throwing custom exception
//		throws - To handle IOException
		
//		custom exception : Developers will create custom exception. 
		
		int a = 10;
		
		if(a > 5)
		{
			throw new ArithmeticException("a is greater than 5");
		}
		
		
	}
}
