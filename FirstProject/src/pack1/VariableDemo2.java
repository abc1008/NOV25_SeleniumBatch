package pack1;

public class VariableDemo2 {
	
	int num = 80;
	static int num2 = 400;
	
	public static void main(String[] args) 
	{
		VariableDemo2 v1 = new VariableDemo2();
		System.out.println(v1.num);
		
		v1.num = 90;
		System.out.println(v1.num);
		
		
		VariableDemo2 v2 = new VariableDemo2();
		System.out.println(v2.num);
		
		
		
		
		
		
		
		
//		
//		v2.num = 700;
//		System.out.println(v2.num);
//		
//		
//		VariableDemo2 v3 = new VariableDemo2();
//		System.out.println(v3.num);
		
		
		
		System.out.println();
		System.out.println("*** STATIC VARIABLE *****");
		System.out.println();
		
		
		System.out.println(v1.num2);
		v1.num2 = 300;
		System.out.println(v1.num2);
		
		
		System.out.println(v2.num2);
		
		
	}

}
