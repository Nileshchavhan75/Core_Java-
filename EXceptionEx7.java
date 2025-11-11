import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}

class EXceptionEx7{
    public static void checkAge(int age) throws InvalidAgeException{
        if(age <18){
            throw new InvalidAgeException("Age is Small not eligible");
        }else{
            System.out.println(": eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try{
            checkAge(age);
        }catch(InvalidAgeException e){
            System.out.println("Exception caught: "+ e.getMessage());
        }
        sc.close();
    }
}
