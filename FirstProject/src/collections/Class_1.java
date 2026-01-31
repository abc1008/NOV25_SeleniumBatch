package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class_1
{

	public static void main(String[] args)
	{

//		SYNTAX: 

//		ArrayList

//		Not Recommended
//	ArrayList list1 = new ArrayList();
//	list1.add("ddd");
//	list1.add(334);
//	list1.add(55.444);

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(20);
		list1.add(30);

		System.out.println(list1);

		list1.remove(2);

		System.out.println(list1);

		Integer data = list1.get(0);
		System.out.println(data);

		list1.set(2, 400);

		System.out.println(list1);

		Integer ele = list1.size();
		System.out.println(ele);
		
		
		for(Integer num :list1)
		{
			System.out.println(num);
		}
		
		
		Iterator<Integer> itr = list1.iterator();
		
		
//		 boolean hasNext = itr.hasNext();
		System.out.println("***************");
		 
		 while(itr.hasNext() == true)
		 {
			 System.out.println(itr.next());
		 }
		
		
		System.out.println( list1.contains(20));
		

	}
}
