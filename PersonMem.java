public class PersonMem {
    String address = "Newyouk";
    String city = "Jamod";
    int code = 230;
    class address{
       void displayAddress(){
            System.out.println("address: "+address);
            System.out.println("City: "+ city);
            System.out.println("Code: "+ code);
        }
    }
    public static void main(String[] args) {
        PersonMem m = new PersonMem();
        PersonMem.address ad = m.new address();
        ad.displayAddress();
    }
}
