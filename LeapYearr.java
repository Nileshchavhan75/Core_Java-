import java.util.Scanner;
class LeapYearr{
public boolean checkLeapYear(int year){
	if(year % 4 == 0 && year % 100 != 100)
	{
		return true;	
	}else if(year % 400 == 0)
	{
	return true;
	}else
	{
		return false;
	}

}

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	LeapYearr la = new LeapYearr();
	System.out.println("Enter the year to check ir leapYear or not: ");
	int year = sc.nextInt();
	if(la.checkLeapYear(year)){
	System.out.println("This is leap year: "+ year);
	}else{
        System.out.println("year is not LeapYear: "+year);
	}
}
}