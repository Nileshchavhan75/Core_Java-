public class SecondLargest1 {
    public static void main(String[] args) {
        int[] arr = new int[]{8,5,12,14,44,55,99,77};
        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                SecondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > SecondLargest && arr[i] != largest){
                SecondLargest = arr[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+SecondLargest);
    }
}
