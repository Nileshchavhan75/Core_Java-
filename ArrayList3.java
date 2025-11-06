import java.util.*;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elederburry");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        Boolean s = list.contains("banana");
        System.out.println(s);
        list.add(2, "Citrus");
        System.out.println(list);
        System.out.println(list.size());

        ListIterator<String> li = list.listIterator();
        
        while (li.hasNext()) {
            System.out.print(li.next()+" ");
        }
    }
}
//rotate an array of n elementn to right by k steps.,
//for exmaple, with n = 7 and k = 3, the array [1,2,3,4,5,6,7,8,9] is rotated to [5,6,7,1,2,3,4]. 
//how many different
//ways do you know to solve this problem