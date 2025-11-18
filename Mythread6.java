class Mythread6 implements Runnable{
 String name;
 Thread t;
 Mythread6(String tname){
 name = tname;
 t = new Thread(this, name);
 t.start();
}

public void run(){
for(int i = 1; i<=5; i++){
System.out.println(name + " count "+ i);
}
}
public static void main(String args[]) {
 Mythread6 m1 = new Mythread6("Nilesh  ");
 Mythread6 m2 = new Mythread6("Chavhan ");
 }
}


