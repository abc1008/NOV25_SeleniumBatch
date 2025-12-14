package pack1;

public class ControlStatements2
{

	public static void main(String[] args)
	{

//		SYNTAX: 

//		switch(expression)
//		{

		// case a :
		// code to execute
		// break;

		// case b :
		// code to execute
		// break;

		// case c :
		// code to execute
		// break;

//		 case default:
//			code to execute when any cases don't match
//		}

//		Sunday - 1
//		Monday - 2
//		..
//		Saturday - 7

		int dayNum = 15;

		switch (dayNum)
		{
		case 1:
			System.out.println("Sunday");
			System.out.println("Sunday");
			System.out.println("Sunday");
			break;

		case 2:
			System.out.println("Monday");
			System.out.println("Monday");
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;

		case 4:
			System.out.println("Wednesday");
			break;

		case 5:
			System.out.println("Thursday");
			System.out.println("Thursday");
			System.out.println("Thursday");
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;

		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("DayNum is incorrect");
			break;
		}

		System.out.println("Out of switch case");

	}

}
