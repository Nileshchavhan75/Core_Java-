import java.util.*;
public class Test
{
public static void NameOfName(String name)
{
System.out.println(name);
}
public static int Maltiplication(int a , int b){
int mul = a * b;
return mul;
}
public static int Factorial(int n){
int fact = 1;
for(int i = 1; i <=n; i++){
 fact *= i;
}
return fact;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine();
NameOfName(name);
System.out.print("Enter two number: ");
int x = sc.nextInt();
int y = sc.nextInt();
System.out.println(Maltiplication(x, y));
System.out.print(Factorial(x));
System.out.println("Enter number for factorial: ");
int fact = sc.nextInt();
System.out.println(Factorial(fact));
sc.close();
}
}