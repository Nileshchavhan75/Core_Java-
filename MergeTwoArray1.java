public class MergeTwoArray1 {
    public static void main(String[] args) {
        int arr[]= {1,3,5};
        int arr2[] = {2,4,6};

        int merge[] = new int[arr.length+arr2.length];

        int k =0, i = 0, j = 0;

        while (i<arr.length && j<arr.length) {
            if(arr[i] < arr2[j]){
                merge[k++] = arr[i++];
            }else{
                merge[k++] = arr2[j++];
            }
        }

        while(i<arr.length){
            merge[k++] = arr[i++];
        }
        while (j<arr.length) {
            merge[k++] = arr2[j++];
        }

        for(int x:merge){
            System.out.println(x+" ");
        }
    }
}
