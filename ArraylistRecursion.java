import java.util.ArrayList;

public class ArraylistRecursion {
    public static void main(String[] args) {
        int [] arr= {5,8,12,14,14,14,44};
        System.out.println(linear(arr, 14, 0));
    }
    static ArrayList<Integer> linear(int[] arr, int target, int ind){
    ArrayList<Integer> list = new ArrayList<>();

    if(ind == arr.length){
        return list;
    }

    if(arr[ind] == target){
        list.add(ind);
    }

    ArrayList<Integer> belowCalls = linear(arr, target, ind+1);
    list.addAll(belowCalls);

    return list;
}
}
