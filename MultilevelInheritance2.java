class Student{
    String name;
    int rollNumber;

    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void DisplayStudent(){
        System.out.println("Name: "+name);
        System.out.println("rollNumber: "+rollNumber);
     }
}
     
class UndergraduateStudent extends Student  {
    String course;
    int prnNumber;

    public UndergraduateStudent(String name,int rollNumber,String course,int prnNumber){
        super(name,rollNumber);
        this.course = course;
        this.prnNumber = prnNumber;
    }
    public void DisUndergraduateStudent(){
        DisplayStudent();
        System.out.println("course: "+course);
        System.out.println("prnNmber: "+prnNumber);
    
    }
    
}
class GraduateStudent extends UndergraduateStudent{
    String thesisTopic = "MCA";

     public GraduateStudent(String name,int rollNumber,String course,int prnNumber,String thesisTopic){
        super(name,rollNumber,course, prnNumber);
        this.thesisTopic = thesisTopic;
    }
    public void DisGraduateStudent(){
        DisUndergraduateStudent();
        System.out.println("thesisTopic: "+ thesisTopic);
    }

}
public class MultilevelInheritance2 {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("Nilesh",12,"mca",231,"mca");
        GraduateStudent g2 = new GraduateStudent("Rutuja", 14, "MCA", 452, "MCA");
                        g.DisGraduateStudent();
                        g2.DisGraduateStudent();
    } 

}
