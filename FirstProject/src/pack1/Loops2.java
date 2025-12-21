package pack1;

import accessModifiers.TestClass1;

public class Loops2
{
	
	public static void main(String[] args)
	{
		
		for(int num =1; num<=5; num++)  // 1, 2, 3
		{
			if(num == 3)  // false,false, true
			{
				continue; // skip current condition and jump to next one
//				break;
			}
			
			System.out.println("Loop : "+num);
		}
		
		System.out.println();
		
		
		
//		int num = 13/2      // 6
//		int num = 12/2		// 6
		
//		int num = 13 % 2    // 1	// odd
//		int num = 12 % 2    // 0    // even 
		
		for(int i = 2; i <= 50; i++)
		{
			if((i % 2) != 0)
			{
				System.out.println(i);
			}
		}
		
		
//		TestClass1 ts = new TestClass1();
		
		
//		System.out.println(TestClass1.num);
		
//		ts.m1();
		
		
	}
	
	
//	HW : Print odd numbers from 1 to 50
//  Expected Output : 3,5,7,9 ... 49
	
	
	

	
	
	
	
	
	
	
	

}
