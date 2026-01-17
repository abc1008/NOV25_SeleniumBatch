package exceptionHandling;


public class Class_3
{
//	Producing StackOverflow error 
	public static void m1(int num)  // 3, 4
	{
		System.out.println(num);  // 3, 4
		
		if(num > 0)
		{
			num = num + 1;  // 3, 4
			m1(num); 
		}
		
	}
	
	
	

	public static void main(String[] args) 
	{
		m1(2);
	}
}
