/* Create a class Number that accept an array of 5 subjects marks, along with the following menu
1. Display Marks
2. Sum
3. Average
4. Exit
*/

import java.util.Scanner;

public class Number{

	public void display(int []arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println("Subject "+(i+1)+" Marks: "+arr[i]);
		}

	}

	public void sum(int []arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];

		System.out.println("Sum of your marks: "+sum);
	}

	public void avg(int []arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];

		System.out.println("Average marks: "+(double)sum/5);
	}

	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		Number obj = new Number();

		int arrSize = 5;

		int marks[] = new int[arrSize];
		boolean validInput;

		do{
			validInput = true;
			System.out.println("Enter your "+arrSize+" subjects Makrs (between 0-100) \n");

			for(int i = 0; i < marks.length; i++){
				System.out.print("Enter marks for subject "+(i+1)+":  ");
				marks[i] = in.nextInt();

				if(marks[i] < 0 || marks[i] > 100){
					validInput = false;
		            System.out.println("Invalid marks entered! Marks must be between 0-100.");
					System.out.println("Try Again..\n\n");
					break;
				}

			}

		}while(!validInput);

		int choise;

		do{
			System.out.println("\n\nMenu");
			System.out.println("1. Display Marks");
			System.out.println("2. Sum");
			System.out.println("3. Average");
			System.out.println("4. Exit");

			System.out.print("Enter your choise: ");
			choise = in.nextInt();

			switch(choise){

				case 1: obj.display(marks);
					break;

				case 2: obj.sum(marks);
					break;

				case 3: obj.avg(marks);
					break;

				case 4: System.out.println("Program ended successfully.");
					break;

				default:  System.out.println("Invalid Input, Please try again!");
					break;
			}
		}while(choise != 4);
	}
}