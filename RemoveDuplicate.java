public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        int ind = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[ind]){
                ind++;
                arr[ind] = arr[i];
            }
        }
        for(int i = 0; i<=ind; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
