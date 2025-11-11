import java.util.Scanner;

public class ExceptionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[4];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        try{
        System.out.print("Enter the index that you want to access: ");
        int ind = sc.nextInt();
        System.out.print("Enter the number that you want divide with: ");
        int number = sc.nextInt();

        System.out.println("Number at Index that you Entered: "+ marks[ind]);
        System.out.println("Division of: "+ marks[ind]/ number);
        }catch(ArithmeticException e){
            System.out.println("Can not divide with zero: ");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured: Array out of bond");
        }finally{
            System.out.println("Program executed successfully");
        }
        sc.close();

    }
}
