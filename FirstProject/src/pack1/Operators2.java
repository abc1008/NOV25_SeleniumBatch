package pack1;

public class Operators2 {
	
	
	
	public static void main(String[] args) {
		
		int x = 60;
		int y = 50;
		
		boolean result = x > y;
		System.out.println("result : "+result);
		
		boolean result2 = x < y;
		System.out.println("result2 : "+result2);
		
		boolean result3 = x <= y; // x is less or equal to y
		System.out.println(result3);
		
		boolean result4 = x >= y; // x is greater or equal to y
		System.out.println(result4);
		
		boolean result5 = (x == y);   // check for equality
		System.out.println(result5);
		
		boolean result6 = (x != y);   // check for non-equality
		System.out.println(result6);
		
		
		
//		int x = 60;
//		int y = 50;
		
		boolean result7  = (x > y) && (x == 100) && (y > 50);
		System.out.println(result7);
		
		
		boolean result8  = (x < y) || (x == 100) || (y > 50);
		System.out.println(result8);
		
		
		
	}
	
	
	
	
	
	
	

}
