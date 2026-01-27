public class sortArray {
    public static void main(String [] args){
        int [] arr = {1,3,5,7};
        int [] arr2 = {2,4,6,9};


        int mergeArray[] = new int[arr.length + arr2.length];

        int i = 0,j = 0, k = 0;

        while (i<arr.length && j<arr2.length) {
            if(arr[i] < arr2[j]){
                mergeArray[k++] = arr[i++];
            }else{
                mergeArray[k++] = arr2[j++];
            }
        }

        while (i<arr.length) {
            mergeArray[k++] = arr[i++];
        }
        while (j<arr.length) {
            mergeArray[k++] = arr2[j++];
        }

        for(int x : mergeArray){
            System.out.println(x+" ");
        }
    }
}
