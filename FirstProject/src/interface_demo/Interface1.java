package interface_demo;

public interface Interface1
{
	int num = 10;  // by default public, static and final
	
	public void m1();   // by default abstract
	public abstract void m2();
	public abstract void m3();
	public abstract void createUser();
	
	
	public static void m8()
	{
		System.out.println("Interface1 - m8 Static method");
	}
	
	public static void main(String[] args)
	{
		m8();
		
//		num = 11;
		System.out.println(num);
	}
	

}
