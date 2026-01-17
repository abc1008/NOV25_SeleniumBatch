package typecasting;

public class Class_A {

	public static void main(String[] args) {
		
		
		
//		byte short int long
		
//		Implicit Typecasting : Conversion from lower order data type into higher order
		
		byte b = 10;   // --> int
		System.out.println(b);
//		b = 129;
//		SYNTAX: 
//				new_dataType convVariableName = (new_dataType)variableToConvert;
		
		int convVariable = (int)b;
		System.out.println(convVariable);
		convVariable = 129;
		
		
		
//		Explicit Typecasting: from higher to lower
		
		
		
		
		
		
//		int --> byte
		
		int x = 129;
		System.out.println(x);
		
		byte byteVariable = (byte)x;
		System.out.println(byteVariable);  // data loss, hence its never used. 
		
//		byteVariable = 129;
		
		
		
		
	}
}
