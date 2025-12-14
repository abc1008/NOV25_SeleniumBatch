package pack1;

public class ControlStatements {
	
	
	public static void main(String[] args) {
		
		
//		SYNTAX: 
		
//		if(boolean condition)
//		{
			// if block code
//		}
//		else
//		{
			// else block
//		}
		
		
		int x = 300;
		int y = 200;
		
		if(x < 200)
		{
			System.out.println("x is less than 200");
		}
		else if(y != 200)
		{
			System.out.println("Y is equal 200");
		}
		else if(x <= y)
		{
			System.out.println("X less than or equal Y");
		}
		else 
		{
			System.out.println("All conditions are false");
		}
		
		System.out.println("Out of if-else");
		
		
		int dayNum = 6;
		
		if(dayNum == 1)
		{
			System.out.println("Sunday");
		}
		else if(dayNum == 2)
		{
			System.out.println("Monday");
		}
		else
		{
			System.out.println("DayNum is incorrect");
		}
		
		
		
		
		
	}
	
	

}
