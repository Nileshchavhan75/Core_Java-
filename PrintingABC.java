public class printingABC {
    public static void main(String[] args) {
        char ch = 'A';

        for(int i = 0; i<26;i++){
            ch = (char)(ch + i);
            System.out.print(ch);
        }
    }
}
