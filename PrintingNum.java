public class PrintingNum {
    public static void main(String[] args) {
        int n = 1;
        printingNum(n);
    }
    static void printingNum(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        printingNum(n+1);
    }
}
