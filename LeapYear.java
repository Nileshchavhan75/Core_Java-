

import java.util.Scanner;
public class LeapYear{
	public boolean checkLeapY(int year){
		if(year % 4 == 0 && year % 100 != 0){
			return true;

		}else if(year % 400 == 0){
			return true;

		}else{
			return false;
		}
	}

	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		LeapYear obj = new LeapYear();

		System.out.print("Enter a year to check whether it is leap year or not: ");
		int year = in.nextInt();

		if(obj.checkLeapY(year))
			System.out.println(year+" is a Leap Year.");
		else
			System.out.println(year+" is not a Leap Year.");
	}
}