public class Subsets {
    public static void main(String[] args) {
        skip("", "bcaacab");
    }
    static void skip(String s, String up){
        if(up.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(s, up.substring(1));
        }else{
            skip(s+ch, up.substring(1));
        }
    }
}
