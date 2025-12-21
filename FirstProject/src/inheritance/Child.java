package inheritance;

public class Child extends Parent
{
	
	Child()
	{
		super('f');  // call constructor of parent class
		System.out.println("Child Class Constructor");
	}
	
	Child(int num)
	{
		super('f', 4);  // call constructor of parent class
		System.out.println("2 arg Child Class Constructor");
	}

	
	
	public static void main(String[] args)
	{
		Child c = new Child();
		
		Child c2 = new Child(8);
		
		
		
	}
	

}
