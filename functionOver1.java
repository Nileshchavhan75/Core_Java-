public class functionOver1 {
    public void show(String massage){
        System.out.println(massage);
    }
    public void show(String massage, int number){
        System.out.println("massage: " + massage + ", Number: " + number );
    }
    public static void main(String[] args) {
        functionOver1 obj = new functionOver1();
        obj.show("Hello");
        obj.show("Hello",20);

    }
}
