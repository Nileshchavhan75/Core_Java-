import java.util.Scanner;

class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String msa){
        super(msa);
    }
}
public class ExceptionEX8 {
    public static void validSalary(double salary) throws InvalidSalaryException{
        if(salary<5000){
            throw new InvalidSalaryException("\"Salary is too low. Minimum salary must be 5000.\"");
        }else if(salary > 100000){
            throw new InvalidSalaryException("Salary exceeds the maximum limit of 100000.");
        }else{
            System.out.println("You are eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        try{
            validSalary(salary);
        }catch(InvalidSalaryException e){
            System.out.println("Exception caught: "+ e.getMessage());
        }
        sc.close();
    }
}
