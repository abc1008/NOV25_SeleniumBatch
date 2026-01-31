package collections;

import java.util.HashSet;

public class SetDemo
{
	
	public static void main(String[] args)
	{
//										   optional
//		HashSet<DataType> nameOfSet = new HashSet<DataType>();
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		System.out.println(set1);
		
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(500);
		set1.add(300);
		set1.add(400);
		set1.add(600);
		
		System.out.println(set1);
		
		boolean result = set1.remove(300);
		
		System.out.println(result);
		
		System.out.println(set1);
		
		for(Integer num :set1)
		{
			System.out.println(num);
		}
		
		System.out.println(set1.size());
		
		System.out.println(set1.contains(500));
		
		
		
	}

}
