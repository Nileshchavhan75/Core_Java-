import java.util.*;;
public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> la = new ArrayList<>();
        la.add("John");
        la.add("Emma");
        la.add("Sophia");
        la.add( "Michael" );
        la.add("Liam");

        System.out.println(la);
        la.add(2, "Oliver");
        System.out.println(la);
        la.remove(3);
        System.out.println(la);
        la.add(0,"Lucas");
        System.out.println(la);

        Iterator<String> iterator = la.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}
                        
                         