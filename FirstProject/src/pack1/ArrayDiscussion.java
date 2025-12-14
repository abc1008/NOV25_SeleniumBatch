package pack1;

public class ArrayDiscussion {
	
	
	
	public static void main(String[] args) {
		
		
//		SYNTAX 1: 
			
//		dataType [] arrayName = { value1, value2, value3, ... , valueN };
		
//      int a = 10;
		int [] intArray = { 10,20,30,40,50,60 };
		
		
//		SYNTAX 2 : 
		
//		dataType [] arrayName = new dataType[no of ele to store in array];
		
		int [] intArray2 = new int[5];
		intArray2[0] = 500;
		intArray2[1] = 600;
		intArray2[2] = 700;
		intArray2[3] = 800;
		intArray2[4] = 900;
		intArray2[5] = 9900;
		
		
		int num = intArray[4];
		System.out.println(num);
		
		
		intArray2[2] = 300000;
		
		
//							0        1      2      3					
		String [] sArray = {"abc", "pqr", "req", "treq"};
		
		
		String str = sArray[500];
		
		
//		Array Length = 4
//		0 to 3
		
//		Max Index = Array Length - 1
		
		
		
		
		
	}

}
