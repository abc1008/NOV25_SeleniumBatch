package polymorphism;

public class Child2 extends Parent2
{
	
	int num2 = 20;
	
	public void m1()
	{
		System.out.println("m1 - Child2");
	}
	
	public void m1(int a)
	{
		System.out.println("int - m1 - Child2");
	}
	
	
	
	
	
	
	public void car()  // overridden method
	{
		System.out.println("car - Child2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("*********** Child Object ***************");
		System.out.println();
		
		Child2 ch = new Child2();
		
		ch.m1();   // overloaded   -- child
		ch.m1(3);  // overloaded   -- child
		ch.m1("ee");  // overloaded   - parent
		
		ch.car();   // overridden
		
		System.out.println();
		System.out.println("*********** Parent Object ***************");
		System.out.println();
		
		Parent2 p = new Parent2();
		p.car();  	 // overridden
		
		p.m1("ss");  // overloaded   - parent
		
		
		System.out.println();
		System.out.println("*********** Parent Ref + Child Object  ***************");
		System.out.println();
		
		Parent2 pc = new Child2();  // because of inheritance its possible
		pc.car();  		// overridden
		pc.m1("333");   // overloaded  - parent
		
		
		System.out.println();
		System.out.println("*********** Child Ref + Parent Object  ***************");
		System.out.println();
		
//		Child2 c2 = new Parent2();   -- not possible because of inheritance
		
		
		System.out.println(ch.num);
		System.out.println(ch.num2);
		
		System.out.println(p.num);
		System.out.println(pc.num);  // 
		
		
	}
	
}
