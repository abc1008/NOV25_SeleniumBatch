package polymorphism;

public class TestClass1
{
	
//	Overloaded 
	void m1()
	{
		System.out.println("m1");
	}
	
	private int m1(int a)
	{
		System.out.println(" int m1");
		
		return 1;
	}
	
	public void m1(String a)
	{
		System.out.println("String m1");
	}
	
	public void m1(int a, String b)
	{
		System.out.println("int,String m1");
	}
	
	public void m1(String b, int a)
	{
		System.out.println("String,int m1");
	}
	
	
	public static void main(String[] args)
	{
		TestClass1 tc1 = new TestClass1();
		tc1.m1(0, "re");
	}

}
