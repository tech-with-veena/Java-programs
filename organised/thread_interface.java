class example implements Runnable{
public void run(){
try{
System.out.println("The current thread is ruuning");
}
catch(Exception e){
System.out.println(e);
}
}
}
public class fifteen_b{
public static void main(String args[]){
example t1=new example();
example t2=new example();
example t3=new example();
Thread t4=new Thread(t1);
Thread t5=new Thread(t2);
Thread t6=new Thread(t3);
t4.start();
t5.start();
t6.start();
}
}