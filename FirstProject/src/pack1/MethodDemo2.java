package pack1;

public class MethodDemo2 
{
	public void m1()
	{
		MethodDemo.addNums();
		
		MethodDemo md = new MethodDemo();
		md.subtractNums();
		
	}
	
	
	public static void main(String[] args) 
	{
////		SYNTAX to call static method of another class: 
//		
//		ClassName.methodName();
		MethodDemo.addNums();
//		
////		SYNTAX to call non-static method of another class: 
//		
////		Object of that class in which non-static method is present
//		
//		MethodDemo md1 = new MethodDemo();
//		md1.subtractNums();
//		
		
		MethodDemo2 md2 = new MethodDemo2();
		md2.m1();
		
		
	}
	
	


}


