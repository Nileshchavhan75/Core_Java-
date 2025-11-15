class MathOperations{
    void  calculateSquare(int number){
    
        class SquareCalculator{
           void getSquare(){
                System.out.println("Square of number: "+ number * number);
            }
        }
        SquareCalculator inner = new SquareCalculator();
            inner.getSquare();
    }
}
public class localInner {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        m.calculateSquare(5);
    }
}
