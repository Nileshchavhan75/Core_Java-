import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {8,14,44,12,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int [] arr){
        for(int i = 0; i<arr.length-1; i++){
            boolean isSort = false;
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSort = true;
                }
            }
            if(!isSort){
                break;
            }
        }
    }
}
