class Solution33 {
    public int magicalString(int n) {

        if (n <= 0) return 0;
        if (n <= 3) return 1;

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;

        int i = 2;      // pointer
        int num = 1;    // next number to fill
        int count = 1;  // count of 1s

        int index = 3;

        while (index < n) {

            for (int j = 0; j < arr[i] && index < n; j++) {
                arr[index] = num;

                if (num == 1) count++;
                index++;
            }

            num = (num == 1) ? 2 : 1;
            i++;
        }

        return count;
    }
}