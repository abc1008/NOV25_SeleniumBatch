package accessModifiers;

public class TestClass1
{
	protected static int num = 10;
	private static int num2 = 20;
	
	protected int num3 = 90;
	
	
//	private TestClass1()
//	{
//		System.out.println("Constructor");
//	}
	
	
	private static void m1()
	{
		System.out.println("m1");
	}
	
	public static void main(String[] args)
	{
		
		TestClass1 ts = new TestClass1();
		
		
		System.out.println(TestClass1.num);
		
		
		TestClass1.m1();
		
		
	}
	
}
