package pack1;


public class VariableDemo {
	
	int num = 10;
	
	public void m1()
	{
		System.out.println(num);
		
		System.out.println(VariableTypes.num);
		
		VariableTypes ref3 = new VariableTypes();
		System.out.println(ref3.num3);
		
		
	}
	
	
	public static void main(String[] args) {
		
		
//		Class : Start with upper case letter and every new word in it also start with upper case.
//		Package: entirely lower case
//		Variables: Start with lower case letter and every new word in it also start with upper case.
		
		
//		DataType variableName = value;
		
		byte byteNumber = 127;
		int intNumber = 34567;
		short shortNumber = 457;
		long longNumber = 4544545454L;
		
		float foatNumber = 50.36f;
		double doubleNumber = 644.54;
		
		
		System.out.println(byteNumber);
		
		System.out.println(intNumber);
		System.out.println(foatNumber);
		
		
		char charCharacter = 'k';
		
		String date = "23/01/2025XD$#!~";
		
		boolean result = true;
		
		System.out.println(result);
		
//		ClassName.variableName
		
		
		int num2 = VariableTypes.num;
		
		System.out.println(num2);
		System.out.println(num2);
		System.out.println(num2);
		System.out.println(num2);
		System.out.println(num2);
		
		
		
		
		VariableTypes ref = new VariableTypes();
		System.out.println(ref.num3);
		
		
		
		
		
		
		
		
		
	}

}
