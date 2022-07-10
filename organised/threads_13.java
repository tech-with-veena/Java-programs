class threadmethod extends Thread{
public void run(){
try{
System.out.println("The current thread is:"+Thread.currentThread().getName());
sleep(2500);
}
catch(Exception e){
System.out.println(e);
}
}
}
public class threads{
public static void main(String args[]){
threadmethod t1=new threadmethod();
threadmethod t2=new threadmethod();
threadmethod t3=new threadmethod();
System.out.println("The default name of t1 is:"+t1.getName());
System.out.println("The default name of t2 is:"+t2.getName());
System.out.println("The default name of t2 is:"+t3.getName());
System.out.println("The default priority of t1 is:"+t1.getPriority());
System.out.println("The default priority of t2 is:"+t2.getPriority());
System.out.println("The default priority of t3 is:"+t3.getPriority());
t1.setName("first");
t2.setName("second");
t3.setName("third");
t1.start();
t2.start();
t3.start();
t1.setPriority(2);
t2.setPriority(5);
t3.setPriority(8);
System.out.println("The default priority of t1 is:"+t1.getPriority());
System.out.println("The default priority of t2 is:"+t2.getPriority());
System.out.println("The default priority of t3 is:"+t3.getPriority());
System.out.println("Thethread is alive:"+t3.isAlive());
System.out.println("Thethread is alive:"+t2.isAlive());
System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
Thread.currentThread().setPriority(8);
System.out.println("Now the main thread priority is:"+Thread.currentThread().getPriority());

}
}





















