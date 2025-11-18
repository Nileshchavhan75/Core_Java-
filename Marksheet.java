import java.util.Scanner;

public class Marksheet{

    private int[] rollNos;
    private String[] names;
    private int[] marks1;
    private int[] marks2;
    private int[] marks3;
    private char[] grade;
    private double[] per;

    public void getStudentData(int n){
        Scanner in = new Scanner(System.in);

        rollNos = new int[n];
        names = new String[n];
        marks1 = new int[n];
        marks2 = new int[n];
        marks3 = new int[n];
        grade = new char[n];
        per = new double[n];

        System.out.println("Enter data for "+n+" students:");

        for (int i = 0; i < n; i++){
            System.out.println("\nStudent "+(i+1));
            System.out.print("Roll No: ");
            rollNos[i] = in.nextInt();

            System.out.print("Name: ");
            in.nextLine();
            names[i] = in.nextLine();

            System.out.print("Mark 1: ");
            marks1[i] = in.nextInt();

            System.out.print("Mark 2: ");
            marks2[i] = in.nextInt();

            System.out.print("Mark 3: ");
            marks3[i] = in.nextInt();
        }
    }

    public void calGradePer(int n){

        for (int i = 0; i < n; i++){

            per[i] = (marks1[i] + marks2[i] + marks3[i]) / 3.0;

            if(per[i] > 90){
                grade[i] = 'A';

            }else if (per[i] > 80){
                grade[i] = 'B';

            }else if (per[i] > 65){
                grade[i] = 'C';
            }else if (per[i] >= 35){
                grade[i] = 'D';
            }else{
                grade[i] = 'F';
            }
        }
    }

    public void displayMarksheet(int n){
        System.out.println("\nMCA Department 2024\n");
        System.out.println("RollNO\tName\t\tMark1\tMark2\tMark3\tPercentage\tGrade");

        for(int i = 0; i < n; i++){

            System.out.println(rollNos[i]+"\t"+names[i]+"\t\t"+marks1[i]+"\t"+marks2[i]+"\t"+marks3[i]+"\t"+ String.format("%.2f", per[i]) +"\t\t"+grade[i]+"\n");
        }
    }

    public static void main(String[]args){
	        Marksheet obj = new Marksheet();
	        Scanner in = new Scanner(System.in);

	        System.out.print("How many student's marksheets would you like to create: ");
	        int n = in.nextInt();

	        obj.getStudentData(n);
	        obj.calGradePer(n);
	        obj.displayMarksheet(n);
    }
}
