package pack1;

public class ConstructorDemo
{
	int num;
//	int num2 = 10;
	
	static int num3;

//	SYNTAX:
	
//	ClassName()
//	{
		// Code of constructor
//	}
	
	ConstructorDemo(int num)
	{
		this.num = num;
		System.out.println("int arg Constructor running : "+ num);
	}
	
	
	ConstructorDemo()
	{
		System.out.println("0 Arg constructor");
	}
	
	ConstructorDemo(char num)
	{
		System.out.println("char Arg constructor");
	}
	
	ConstructorDemo(char c, int num)
	{
		System.out.println("char,num Arg constructor");
	}
	
	ConstructorDemo(int num, char c)
	{
		System.out.println("num,char Arg constructor");
	}
	
	
	public void printAccBalance()
	{
		System.out.println("Num : "+num);
//		num2 = 100;
	}
	
	public static void main(String[] args)
	{
		ConstructorDemo ref1 = new ConstructorDemo(40); 
		
		ConstructorDemo ref2 = new ConstructorDemo();  
		
		ConstructorDemo ref3 = new ConstructorDemo(60, 'f');
		
		ConstructorDemo ref4 = new ConstructorDemo('d',6);
		
		
//		ref4.printAccBalance();
//		System.out.println(ref4.num2);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
