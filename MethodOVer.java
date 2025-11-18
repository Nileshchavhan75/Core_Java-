public class MethodOVer {
    public int add(int a, int b){
        return a + b;
    }
    public float add(float a, float b){
        return a + b;
    }
    public void add(String Fname, String lname){
        System.out.println("Name of the student: "+ Fname +" "+ lname);
    }

    public static void main(String[] args) {
        MethodOVer m = new MethodOVer();
        int x = 10;
        int y = 15;

        System.out.println(m.add(x,y));
        System.out.println(m.add(15.5f,12.3f));
        m.add("Nilesh", "Rutuja");

    }
}
