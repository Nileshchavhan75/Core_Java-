class Student{
    String name;
    int age;
    int rolln;

    public void displayDetails(){
        System.out.println(name+ " "+ age+" "+rolln);
    }
}
public class DisplayStudent{
    public static void main(String args[]){
        Student s = new Student();
        s.name = "Nilesh";
        s.age = 22;
        s.rolln = 12;

        s.displayDetails();
    }
}