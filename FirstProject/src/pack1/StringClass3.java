package pack1;

public class StringClass3 {

	public static void main(String[] args) {

		String s1 = "Testometer";

//		1. Length : total num of chars in string

		int num = s1.length();
		System.out.println(num);

//		2. concat : used to append another string at the end of existing string

		System.out.println(s1.concat(" Institute"));

//		 3. charAt : return character at given index

		char ch = s1.charAt(5);
		System.out.println(ch);

//		4. equals : to check equality with another string

		boolean isEqual = s1.equals("TESTOMETER"); // case sensitive
		System.out.println("isEqual : " + isEqual);

//		5. equalsIgnoreCase : to check equality with another string by ignoring case
		boolean isEqual2 = s1.equalsIgnoreCase("TESTOMETER");
		System.out.println("isEqual2 : " + isEqual2);

//		6. substring : continuous part of given string

		String subString = s1.substring(5);
		System.out.println("subString : " + subString);

		String subString2 = s1.substring(3, 7);
		System.out.println("subString2 : " + subString2);

//		 7. replace : to replace any char in given string

//		 Testometer

		System.out.println(s1.replace('e', 'Z'));

//		8. toUppercase and toLowerCase

		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());

//		9. trim : remove leading and trailing blank spaces

		String s2 = "    Testometer        ";
		System.out.println(s2);

		String trimmedString = s2.trim();
		System.out.println(trimmedString);

//		 10. indexOf : to get index of given char

		int mIndex = s1.indexOf('m');
		System.out.println("mIndex : " + mIndex);

		int eIndex = s1.indexOf('e');
		System.out.println("eIndex : " + eIndex);
		
//		11. lastIndexOf :  to get lastIndex of given char
		
		int eLastIndex = s1.lastIndexOf('e');
		System.out.println("eLastIndex : " + eLastIndex);
		
//		12. contains : verify if given string contains another string
		
		boolean containsResult = s1.contains("meter");
		System.out.println("containsResult : "+ containsResult);
		
//		13. toCharArray : convert given String into char array
		
		char[] chArr = s1.toCharArray();
		
		for(char c : chArr)
		{
			System.out.println(c);
		}
		
		
//		14. split
		
		 String[] split = s1.split("z");
		 
		 for(String s :split)
		 {
			 System.out.println(s);
		 }
		
		
		
		
		
		
	}

}
