import java.util.Scanner;
public class ExceptionH12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[4];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40; 
        try{
            System.out.println("Enter the index that you want to access: ");
            int ind = sc.nextInt();
            System.out.println("The array you entered: "+ array[ind]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Invalid index entered!");
        }
        sc.close();
    }
}
