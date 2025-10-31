import java.util.Arrays;

public class StringFrequency {
    public static void main(String[] args) {
        String str = "SanSStahhttn";
        char[] arr = str.toCharArray();

        int[] charCount = new int[arr.length];
        boolean[] visitedChar = new boolean[arr.length];

        for (int i = 0; i < arr.length; ++i) {
            int count = 1;
            char ch = arr[i];

            for (int k = 0; k < visitedChar.length; ++k) {
                if (visitedChar[k] == true) {
                    continue;
                }
            }

            for (int j = i+1; j < arr.length; ++j) {
                if (ch == arr[j]) {
                    ++count;
                }
            }
            charCount[i] = count;
            visitedChar[i] = true;
        }
    }
}

