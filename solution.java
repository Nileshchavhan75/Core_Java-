import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return;
        }

        int[] newResult = new int[nums.length];
        k = k % nums.length;
        int j = 0;

        for (int i = nums.length - k; i < nums.length; ++i) {
            newResult[j] = nums[i];
            j++;
        }

        for (int i = 0; i < nums.length - k; i++) {
            newResult[j] = nums[i];
            j++;
        }

        System.arraycopy(newResult, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Take input for array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Take input for k (number of rotations)
        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        // Call the rotate function
        Solution solution = new Solution();
        solution.rotate(nums, k);

        // Print rotated array
        System.out.println("Rotated array: " + Arrays.toString(nums));

        sc.close();
    }
}
