class CheckEvenOdd{
    void checkEvenO(int number){
        class LInner{
            void checkNu(){
                if(number % 2 == 0){
                    System.out.println("Number is even:");
                }else{
                    System.out.println("Number is odd");
                }
            }
        }
        LInner in = new LInner();
        in.checkNu();
    }
}
public class localInner2 {
    public static void main(String[] args) {
        CheckEvenOdd c = new CheckEvenOdd();
        c.checkEvenO(2);
    }
}
