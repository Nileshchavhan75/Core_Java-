public class Student1 {
    String name;
    int roll_no;
    double marks;

    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll_no);
        System.out.println("Marks: "+marks);
    }
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name = "Nilesh";
        s.roll_no = 12;
        s.marks = 84;

        Student1 s2 = new Student1();
        s2.name = "Sakshi";
        s2.roll_no = 21;
        s2.marks = 83;

        s.showDetails();
        System.out.println("-------------------------------");
        s2.showDetails();
    }
}
