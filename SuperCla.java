class Person{
    int legs;

    // Person(int legs){
    //     this.legs = legs;
    // }

    public void show(){
        System.out.println("There are "+legs+" legs");
    }
}
class Men extends Person{
    int legs = 5;

    public void show(){
        System.out.println("There are "+super.legs+" legs");
        super.show();
    }
}

public class SuperCla{
    public static void main(String[]args){
        Men obj = new Men();
        obj.show();
    }
}