package pack1;

public class VariableTypes 
{
	
//	class level or global variables
	static int num = 10;
	static int num2;    // variable declaration
	static boolean result;
	static char ch;
	
	
	int num3 = 100;   // non-static variable
	int num4;
	boolean result2;
	static VariableTypes v1 = new VariableTypes();
	int num10 = 80;
	
	
	public void m2()
	{
		System.out.println(num);  
		System.out.println(num3); // non-static variable of same class
		
		int num7 = 90;  // local variable
		System.out.println(num7);
		
		int num9;
		System.out.println(v1.num3);
		
		int num10 = 700;
		System.out.println(num10);
		
//		VariableTypes v4 = new VariableTypes();
//		System.out.println(v4.num10);
		
		System.out.println(this.num10);  // non-static variable of same class
		System.out.println(this.num4);
	
	}
	
	public void m4()
	{
		System.out.println("M4 method");
		this.m2();
	}
	
	
	
	public static void m3()
	{
		System.out.println(num);  
//		System.out.println(num3); // object needed
		
		int num8 = 80;   // local variable
		
		System.out.println(num8);
		
		VariableTypes v4 = new VariableTypes();
		System.out.println(v4.num10);
		
//		System.out.println(this.num4);
	}
	
	
	
	public static void main(String[] args) 
	{
		
		System.out.println(num);
		
//		int a = 10;
		
		
//		VariableTypes obj2 = new VariableTypes();
		
//		obj2.v1.num3
	
		System.out.println(v1.num);
		System.out.println(num2);
		System.out.println(result);
		System.out.println(ch);
		
		
		System.out.println(v1.num3);
		
		System.out.println(v1.num4);
		System.out.println(v1.result2);
		
		
		int num6 = 40;   // local variable
		
		System.out.println(num6);
		
		
		
		v1.m2();
		
		
		
//		System.out.println(v1.num10);
		
		v1.m4();
		
		
		
	}

}
