package pack1;

import accessModifiers.TestClass1;

public class ProtectedTest extends TestClass1
{
	
	
	public static void main(String[] args)
	{
		
		System.out.println(TestClass1.num);
		System.out.println(ProtectedTest.num);
		
		
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.num3);
		
		
//		using parent class ref variable -- error 
//		TestClass1 tc = new TestClass1();
//		System.out.println(tc.num3);
		
//		System.out.println(TestClass1.num2);
		
		
		
	}

}
