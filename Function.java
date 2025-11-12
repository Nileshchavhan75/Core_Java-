import java.util.Scanner;
public class Function {
    public static void smallerr(int a, int b){
        if(a<b){
            System.out.print("smaller " + a);
        }
    }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
   smallerr(a,b);
   }
}
