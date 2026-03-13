import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {44,14,12,8,5};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSorting(int[]arr){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length-i-1;
            int max = maxi(arr, 0, last);
            swap(arr, max, last);
        }
    }
    static int maxi(int[] arr, int start, int last){
        int s = start;
        for(int i = start; i<=last; i++){
            if(arr[s] < arr[i]){
                s = i;
            }
        }
        return s;
    }
    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
