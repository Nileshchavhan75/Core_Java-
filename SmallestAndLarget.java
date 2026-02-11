public class SmallestAndLarget {
    public static void main(String[] args) {
        int[] arr = {5,8,10,12,14};
        int small = Integer.MAX_VALUE;
        int larg = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > larg){
                larg = arr[i];
            }
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println("Largest: "+larg);
        System.out.println("Smallest: "+small);
    }
}
