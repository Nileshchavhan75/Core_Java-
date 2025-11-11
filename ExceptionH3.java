import java.util.Scanner;

public class ExceptionH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        System.out.println("Enter the index: ");
            int ind = sc.nextInt();
        try{
            System.out.println("Welcome first try: ");
            try{
                System.out.print(marks[ind]);{}
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception occured: ");
            }
        }catch(Exception e){
            System.out.println("Exception level 1");
        }

    }
}
