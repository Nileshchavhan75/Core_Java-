public class Patter {
    public static void main(String[] args) {
        printPatter(10, 0);
        System.out.println("______________________________");
        printPatter2(10, 0);
    }
    static void printPatter(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print(" *");
            printPatter(row, col+1);
        }else{
            System.out.println();
            printPatter(row-1, 0);
        }
    }
    static void printPatter2(int row, int col){
        if(row==0){
            return;
        }
        if(col < row){
            printPatter2(row, col+1);
            System.out.print(" *");
        }else{
            printPatter2(row-1, 0);
            System.out.println();
        }
    }
}
