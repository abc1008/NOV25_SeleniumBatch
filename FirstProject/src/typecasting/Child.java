package typecasting;

public class Child extends Parent
{

	
	public static void main(String[] args) 
	{
//		SYNTAX: 
		
//		new_dataType convVariableName = (new_dataType)variableToConvert;
		
		
		Child c1 = new Child();
		
		Parent conv_c1 = (Parent)c1;     // upcasting
//		Parent conv_c1 = new Child();
		
		
		Parent p1 = new Parent();								
		Child conv_p1 = (Child)p1;     // downcasting
		
//		Child conv_p1 = new Parent();   
		
		
		
	}
}
