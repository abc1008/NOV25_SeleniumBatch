package abstract_demo;

public abstract class Class_A
{
	int a;
	static int b = 20;
	
	public Class_A()
	{
		System.out.println("Constructor of abstract class Class_A");
		a = 10;
	}
	

	public abstract void m1();  // incomplete/abstract method
	
	
	public void m2()
	{
		System.out.println("m2");  // complete/concrete method
	}
	
	public abstract void m3(); 
	
	public abstract void m4(); 
	
	
	
//	users 
//	entities
	
	
	
	
	

}
