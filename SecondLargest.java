import java.util.Scanner;


public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter "+i+" Element: ");
            arr[i] = sc.nextInt();
        }

        int largest = -1;
        int secondcLargest = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                secondcLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondcLargest && arr[i] != largest){
                secondcLargest = arr[i];
            }
        }

        System.out.println("Second Largest Number: "+secondcLargest);
        sc.close();
    }
}
