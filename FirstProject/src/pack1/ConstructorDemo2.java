package pack1;

public class ConstructorDemo2
{
	
	
	ConstructorDemo2(int num)
	{
		this('t', 5);  // calling another constructor
		System.out.println("int arg Constructor running : "+ num);
	}
	
	ConstructorDemo2()
	{
		System.out.println("0 Arg constructor");
	}
	
	ConstructorDemo2(char c)
	{
		System.out.println("char Arg constructor");
	}
	
	ConstructorDemo2(char c, int num)
	{
		this(7,'f');
		System.out.println("char,num Arg constructor");
	}
	
	ConstructorDemo2(int num, char c)
	{
		System.out.println("num,char Arg constructor");
	}
	
	
	
	public static void main(String[] args)
	{
		ConstructorDemo2 ref1 = new ConstructorDemo2(40); 
	
		
		
		
		
	}
	
	
	
	
	
}
