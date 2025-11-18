import java.util.Scanner;
public class Mark {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num >=90){
            System.out.print("A");
        }else if(num >=70 && num <80){
            System.out.print("B");
        }else if(num >= 50 && num < 70){
            System.out.print("c");
        }else{
            System.out.print("fail");
        }
    }
    
}
