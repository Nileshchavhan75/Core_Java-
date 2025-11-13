public class Garbage {
    Garbage() {
        System.out.println("Object is created");
    }
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
        super.finalize();
    }

    public static void main(String args[]) {
        Garbage G = new Garbage();
        G = null;
        System.gc(); 
    }
}

