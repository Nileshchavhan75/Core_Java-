public class Sorted {
    public static void main(String[] args) {
        int[] arr = {44,8,14,5,14};
        boolean isSorted = true;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                isSorted = false;
                break;
            }
        }
        System.out.println("Array is sorted or not: "+isSorted);
    }
}
