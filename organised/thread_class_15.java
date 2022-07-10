class multi extends Thread{
public void run(){
try{
System.out.println("The current thread is :"+currentThread().getName());
}
catch(Exception e ){
System.out.println(e);
}
}
}
public class fifteen_a{
public static void main(String args[]){
multi t1=new multi();
multi t2=new multi();
multi t3=new multi();
multi t4=new multi();
t1.start();
t2.start();
t3.start();
t4.start();
}
}