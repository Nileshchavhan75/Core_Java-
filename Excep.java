public class Excep {
    public static void main(String[] args) {
        try{
            int arr[] = {10,20,30};
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("it out off index");
        }finally{
            System.out.println("program executed");
        }
    }
}
