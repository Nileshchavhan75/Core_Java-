import java.util.*;
class VectorEx{
public static void main(String [] args){
int n = 6;
Vector v1 = new Vector();
System.out.println("Default Capacity of vector =" + v1. capacity());
Vector v = new Vector(n);
for(int i = 1; i<=n; i++){
  v.add(i);

}
System.out.print(v);
v.remove(3);
System.out.println(v);
for(int i = 0; i < v.size(); i++){
System.out.println(v.get(i));
}
System.out.println("First Elemnet is = "+ v.firstElement());
}
}
