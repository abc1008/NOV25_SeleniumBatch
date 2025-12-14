package pack1;

public class LoopsDiscussion
{
	
	public static void main(String[] args)
	{
		
		System.out.println("Loop");
		System.out.println("Loop");
		System.out.println("Loop");
		System.out.println("Loop");
		System.out.println("Loop");
		
		
		
//		SYNTAX :
		
//		while(boolean condition)
//		{
			// code to repeat/iterate
//		}
		
		System.out.println();
		System.out.println("*** while loop ****");
		System.out.println();
		
		
		int num = 1;

		while(num <= 5)  // 1, 2
		{
			System.out.println("Loop : "+num);
			num++;     // 2 , 3, 4, 5, 6
			
			int ans = num + 100;  // 102, 103
			
			if(ans == 103)  // false, true
			{
				break; // stop the code repetition/break the loop
			}
		}
	
		
		System.out.println("Out of loop");
		
		
		System.out.println();
		System.out.println("*** do-while loop ****");
		System.out.println();
		
		
//		SYNTAX: 
		
//		do
//		{
			// code to repeat/iterate
//		}
//		while(boolean condition);
		
		int num2 = 1;
		
		do
		{
			System.out.println("Loop : "+num2);
			num2++;  // 2, 3, 4, 5, 6
			
			if(num2 == 3)
			{
				continue; // skip current iteration/condition and jump on next one
			}
			
			System.out.println("Loop : "+num2);

		}
		while(num2 <= 5);
		
		
		System.out.println("Out of loop");
		
		
		System.out.println();
		System.out.println("*** for loop ****");
		System.out.println();
		
//		SYNTAX : 
		
//				1				2,5,8					4,7
//		for(initialization; boolean condition; increment/decrement)
//		{
//					3,6
				// code to repeat/iterate
//		}
		
		
		for(int num3 = 1; num3 <=5; num3++)
		{
			System.out.println("Loop : "+num3);
		}
		
		System.out.println("Out of loop");
		
		
		System.out.println();
		System.out.println("*** Array print loop ****");
		System.out.println();
		
		
		int [] intArray = { 100,200,300,400,500 };
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
//		inArray[5]
		
		
		System.out.println();
		System.out.println("*** for loop ****");
		System.out.println();
//		for(initialization; boolean condition; increment/decrement)
		
		for(int i = 0; i <= 4; i++)
		{
			System.out.println(intArray[i]);
		}
		
		System.out.println("Out of loop");
		
		
		System.out.println();
		System.out.println("*** foreach loop ****");
		System.out.println();
		
		
//		int [] inArray = { 100,200,300,400,500 };
		
		String [] sArray = {"Loop","Loop","Loop","Loop","Loop"};
		
//		SYNTAX: 
		
//		for(DataType variable : ArrayName/Collection)
//		{
			// code to repeat/iterate
//		}
		
		for(int var  : intArray)
		{
			System.out.println(var);
		}
		
		System.out.println("Out of loop");
		
		

		
		
	}
	
	
	
	
	
	
	
	

}
