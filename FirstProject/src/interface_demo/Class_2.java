package interface_demo;

public class Class_2 extends Class_1
{

	@Override
	public void m3()
	{
		System.out.println("m3");
	}
	
	public static void main(String[] args)
	{
		
		Class_2 c2 = new Class_2();
		c2.m1();   // overridden
		c2.m2();
		c2.m3();
		
		System.out.println();
		System.out.println("**** Parent Ref + child obj");
		System.out.println();
		
		Class_1 c1 = new Class_2();
		c1.m1();
		c1.m2();
		c1.m3();
		
		
		System.out.println();
		System.out.println("**** Parent Interface Ref + child obj");
		System.out.println();
		
		Interface1 c3 = new Class_2();
		c3.m1();
		c3.m2();
		c3.m3();
		
	}

	@Override
	public void createUser()
	{
		// TODO Auto-generated method stub
		
	}

}
