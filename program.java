import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter "+i+" Element: ");
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int x : arr){
            System.out.print(x+ " ");
        }
        sc.close();
    }
}

    
