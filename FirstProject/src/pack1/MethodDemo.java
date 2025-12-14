package pack1;

public class MethodDemo 
{
	
//	SYNTAX: Static Method
	
//	public static void methodName()
//	{
		//	body/logic
//	}
	
	
//	SYNTAX: Non-Static Method
	
//	public void methodName()
//	{
		//	body/logic
//	}
	
	
	public static void addNums()
	{
		
		int a = 10;
		int b = 20;
		int ans= a + b;
		
		System.out.println(ans);
		
		System.out.println("non-static method call");
		
		MethodDemo ref = new MethodDemo();
		ref.subtractNums();
		
//		subtractNums();

	}
	
	
	public void subtractNums()
	{
		int c = 40; 
		int d = 50;
		int ans = c - d;
		System.out.println(ans);
		
		System.out.println("method in method");
		addNums(); 
		
	}
	
	
	public void m3()
	{
		subtractNums();  // non-static into another non-static method
	}


	public static void main(String[] args)
	{

//		SYNTAX for calling static method:   methodName();
		addNums();  
		
		
//		SYNTAX for calling non-static method:
//		Using reference variable of object
		
		
//		ClassName referenceVariable = new ClassName();
		MethodDemo ref = new MethodDemo();
		ref.subtractNums();
		
		
		
		
		
		
		
		
		
		ref.m3();
		
		
//		MethodDemo ref2 = new MethodDemo();
//		MethodDemo ref3 = new MethodDemo();
		
		// method calling
		

	}

	

	
	
	
}
