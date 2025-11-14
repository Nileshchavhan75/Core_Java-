class Person{
    String name;
    int age;

    public Person(String name, int age){
            this.name = name;
            this.age = age;
    }
    public void PersonDisplay(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
    }
}
class Student extends Person{
    String studentId;
    String course;

    public Student(String name, int age,String studentId,String course){
        super(name, age);
        this.studentId =studentId;
        this.course = course;
    }

    public void displayStudent(){
        PersonDisplay();
        System.out.println("StudentId: "+ studentId);
        System.out.println("Course: "+ course);
    }
}
class Faculty extends Person{
    String FacultyId;
    String department;

    public Faculty(String name, int age,String FacultyId,String department){
        super(name, age);
        this.FacultyId = FacultyId;
        this.department = department;

    }
    public void displayFaculty(){
        PersonDisplay();
        System.out.println("FacultyID: "+FacultyId);
        System.out.println("Departmnet: "+department);
    }
}
public class HierarchicalInheri {
    public static void main(String[] args) {
        Student s = new Student("Nilesh", 22, "12", "MCa");
        s.displayStudent();
        Faculty f = new Faculty("Rutuja", 21, "14", "MCA");
        f.displayFaculty();

    }
}
