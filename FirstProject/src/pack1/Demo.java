package pack1;

public class Demo
{
	int num = 10;
	
	static int num2 = 40;

	
	public static void main(String[] args)
	{
		Demo d1 = new Demo();  // c1 Copy
		d1.num  = 20;
		System.out.println(d1.num);
		
		
		Demo d2 = new Demo();  // c2 Copy
		System.out.println(d2.num);
		
		
		d1.num2 = 50;
		System.out.println("d1.num2 : " + d1.num2);
		
		System.out.println("d2.num2 : " + d2.num2);
	}

}
