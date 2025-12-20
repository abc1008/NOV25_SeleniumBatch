package pack1;

public class MethodCategories
{
	MethodCategories()
	{
		System.out.println("Constructor is running");
		addition(2,3,"abc");
		m1();
	}
	
	public static void addition(int num1, int num2, String str)
	{
//		int a = 10;
//		int b = 20;
		
		int ans = num1 + num2;
		System.out.println(ans);
		
		System.out.println(str);
	}
	
	
	public static void m2(String str)
	{

		String s1 = "ABC";
		
		System.out.println(s1 + str);
	}
	
	public void m1()
	{
		
	}
	
	
	// logic 
	
	
				// void - nothing
	public static int multiplication()
	{
		int a = 10;
		int b = 20;
		
		int ans = a * b;
		
//		System.out.println(ans);
		
		return ans;
	}
	
	
	public static String getAccountName(int accountNumber)
	{
		String name = "";
		
		if(accountNumber == 1)
		{
			name = "ABC";
		}
		else
		{
			name = "PQR";
		}
		
		return name;
	}
	
	public static void main(String[] args)
	{
		MethodCategories c1 = new MethodCategories();
		
		addition(5, 6, "yt");
		addition(1,26,"uu");
		addition(15,16, "eee");
		m2(" PQR");
		
		
		int multiplicationAns = multiplication();
		System.out.println("multiplicationAns : " + multiplicationAns);
		
		
		 String accountName = getAccountName(1);  // PQR
		 
		 System.out.println(accountName);
	}
	
	

}
