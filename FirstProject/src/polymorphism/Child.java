package polymorphism;

public class Child extends Parent
{
	public void method1()
	{
		System.out.println("method1");
	}
	
	public void method2(int num)
	{
		System.out.println("int method1");
	}
	
	public void m5()
	{
		System.out.println("m5");
	}
	
	public void car(int num)
	{
		System.out.println("int method1");
	}
	
	
	public static void main(String[] args)
	{
		Child c1 = new Child();
		c1.car("44");
		
	}
	
}
