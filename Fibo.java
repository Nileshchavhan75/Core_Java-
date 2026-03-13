public class Fibo {
    public static void main(String[] args) {
        int i = 7;
        System.out.println(fiboNa(i));
    }
    static int fiboNa(int i){
        if(i < 2){
            return i;
        }
        return fiboNa(i-1) + fiboNa(i-2);
    }
}
