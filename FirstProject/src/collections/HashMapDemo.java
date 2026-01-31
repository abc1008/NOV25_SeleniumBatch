package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo
{
	
	public static void main(String[] args)
	{
		
		
//		HashMap<keyDataType,ValueDataType> mapName = new  HashMap<keyDataType,ValueDataType>();
		

		HashMap<Integer, String> empMap = new HashMap<Integer, String>();
		System.out.println(empMap);
		
//		Insert
		empMap.put(101, "ABC");
		empMap.put(102, "PQR");
		empMap.put(103, "XYZ");
		empMap.put(104, "QWE");
		empMap.put(105, "TUV");
		empMap.put(103, "YUI");
		empMap.put(104, "TUV");
		
		
		System.out.println(empMap);
		
		String data = empMap.get(100);
		
		System.out.println("103 Emp : " +data );
		
		
 		Set<Integer> allKeys = empMap.keySet();
 		
 		for( Integer k : allKeys)
 		{
 			System.out.println(k);
 		}
 		
 		
 		
 		Collection<String> allValue = empMap.values();
 		
 		for(String v : allValue)
 		{
 			System.out.println(v);
 		}
 		
 		empMap.size();  // to get total num of elements within collection
		
 		
 		 String removedValue = empMap.remove(103);
 		 System.out.println("removedValue : " + removedValue);
 		 
 		System.out.println(empMap);
 		
 		boolean containsKey = empMap.containsKey(103);
 		System.out.println("containsKey : "+containsKey);
 		
 		boolean containsValue = empMap.containsValue("QWE");
 		System.out.println("containsValue : "+containsValue);
 		
 		
// 		int [] arr = new int[3];
	}

}
