package abstract_demo;

import interface_demo.Interface1;

public class Class_C extends Class_B
{

	@Override
	public void m4()
	{
		System.out.println("m4");
	}

	
	public static void main(String[] args)
	{
		
		Class_C c = new Class_C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
		System.out.println();
		System.out.println("********* Parent Ref + Child Obj *******");
		System.out.println();
		
		
		Class_A c2 = new Class_C();
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4();
		
		
		System.out.println(Interface1.num);
		
	}
}
