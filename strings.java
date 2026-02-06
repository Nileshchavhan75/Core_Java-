import java.util.Scanner;
class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("your name is: "+ name);
        System.out.println(name.length());
 
        for(int i = 0; i < name.length(); i++){
           System.out.println(name.charAt(i));
        }

        String Uppercase = name.toUpperCase();
        System.out.println("Before upperCase: "+ name);
        System.out.println("After upperCase: "+ Uppercase);

        String Lower = name.toLowerCase();
        System.out.println("Before LowerCasee: "+ name);
        System.out.println("After LowerCase: "+ Lower);

        String Repla = name.replace( 'e' , 'l');
        System.out.println("Before Replace : "+ name);
        System.out.println("After Replace : "+ Repla);
        
     
    }
}