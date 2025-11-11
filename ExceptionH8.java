import java.util.Scanner;
public class ExceptionH8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5] ;
        marks [0] = 50;
        marks [1] = 60;
        marks [2] = 70;
        marks [3] = 80;
        try{
        System.out.println("Enter the index number that you want to access: ");
        int ind = sc.nextInt();
        System.out.println("the index number you entered: "+ marks[ind]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Ocuured: "+ e);
        }
        sc.close();

    }
}
