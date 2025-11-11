import java.util.Scanner;
public class ExceptionH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        marks [0] = 60;
        marks [1] = 70;
        marks [2] = 80;
        marks [3] = 90;
        System.out.println("Enter the the Index: ");
        int ind = sc.nextInt();
        System.out.print("Enter the number you want to divide with :");
        int number = sc.nextInt();
        try{
            System.out.println("the Index you entered is "+ marks[ind]);
            System.out.println("the divison: "+ marks[ind]/number);
        }catch( ArithmeticException e){
            System.out.println(" ArithmeticExceptio occured that is: "+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException" +e);

        }
        }
}

