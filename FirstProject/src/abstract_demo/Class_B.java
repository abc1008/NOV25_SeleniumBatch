package abstract_demo;

public class Class_B extends Class_A
{

	@Override
	public void m1()
	{
		System.out.println("m1");
	}

	@Override
	public void m3()
	{
		System.out.println("m3");
	}

	@Override
	public void m4()
	{
		System.out.println("m4");
	}
	
//	few concrete methods and 1 abstract method
	
	public static void main(String[] args)
	{
		Class_B b = new Class_B();   // call Class_B constructor
	}

}
