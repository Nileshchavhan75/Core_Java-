public class PrintingNum2 {
    public static void main(String[] args) {
        int i = 15;
        printNum(i);
    }
    static void printNum(int n){
        if(n<1){
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }
}
