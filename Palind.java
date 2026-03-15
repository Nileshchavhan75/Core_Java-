public class Palind {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(palindrom(s));
    }
    static boolean palindrom(String s){

        
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int start = 0;
        int end = s.length()-1;
        while (start<end) {
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
