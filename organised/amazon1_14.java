class amazon extends Thread{
static int avail=1;
synchronized public void run(){
if(avail>0){
--avail;
System.out.println("The book is available:"+Thread.currentThread().getName());
}
else{
System.out.println("Out of stock");
}
}
}
public class amazon1{
public static void main(String args[]){
amazon t1=new amazon();
amazon t2=new amazon();
amazon t3=new amazon();
amazon t4=new amazon();
t1.start();
t2.start();
t3.start();
t4.start();

}
}