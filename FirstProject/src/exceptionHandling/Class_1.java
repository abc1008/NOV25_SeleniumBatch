package exceptionHandling;

public class Class_1
{

	public static void main(String[] args)
	{
		try
		{
//			Risky Code.
			int a = 10;
			int b = 0; // infinity

			int ans = a / b; // throw exception

			System.out.println(ans);
			
			
//			reading data from excel file 
//			1. locate file
//			2. open the file
//			3. read file 			// exception

//			1. connect with db
//			2. qeries on db    // exception
			
		}
		catch (Throwable ex)
		{
			
//			ArithmeticException
			System.out.println("Exception Caught. Catch block running : " + ex.getMessage());
		}
		finally 
		{
			System.out.println("Finally Block is running.");
//			4. close file
//			3. close db connection
		}

		System.out.println("After try catch");
	}

}
