package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_2 {

	public void m1() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("D:\\TRAININGS\\NOV_25_BATCH\\ExcelFile.xlsx");

	}

	public static void main(String[] args) {

//		IOExceptions: 

		try {
			
			FileInputStream file = new FileInputStream("D:\\TRAININGS\\NOV_25_BATCH\\ExcelFile.xlsx");
		} 
		catch (FileNotFoundException e) 
		{
			
			System.out.println("Exception Caught");
			e.printStackTrace();
		}

//		sleep, Thread  --  To stop program execution for specified amount of time. 

//		System.out.println("Started");
//		
//		Thread.sleep(5000);    // 1 sec = 1000 milliseconds

		System.out.println("Completed");
	}

}
