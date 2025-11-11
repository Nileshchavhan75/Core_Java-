import java.util.Scanner;
  
public class ExcepetionH7{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int num1 = sc.nextInt();
	System.out.println("Enter second number: "); 
	int num2 = sc.nextInt();
	try{
		int result = num1 / num2;
		System.out.println("the division of number: "+result);
	}catch(ArithmeticException e){
	System.out.println("Can not divide by 0, please try again");
	}
	sc.close();
      }
    }	
