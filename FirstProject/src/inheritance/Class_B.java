package inheritance;

//			 Child/SubClass 	 Parent/SuperClass	
public class Class_B extends Class_A
{
	
	int num = 90;

	
	
	public void m1()
	{
		System.out.println("m1 method call : ");
		System.out.println(this.num);
		
		System.out.println(super.num5);
		
		System.out.println(super.num);  // refer to non-static variable of parent class
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Class_A a1 = new Class_A();
		a1.m1();
		Class_A.m2();
		
		System.out.println(a1.num);
		System.out.println(Class_A.num2);
		
		
		System.out.println();
		System.out.println("**** After Inheritance ****");
		System.out.println();
		
		
		Class_B b1 = new Class_B();
		b1.m1();
		System.out.println(b1.num);
		
		m2(); // static method of parent
		System.out.println(num2); // static variable of parent
		
		

		b1.m1();
		
	}
	
	
	
}
