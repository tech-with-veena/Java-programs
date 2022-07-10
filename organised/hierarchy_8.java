class A{
final int a=10;
A(){
System.out.println("Constructor of A calld");
}
public void display(){
System.out.println("IN A");
}
}
class B extends A{
public void display(){
System.out.println("IN B");
}
}
class C extends A{
C(){
System.out.println("Constructor in c");
}
public void display(){
System.out.println("IN C");
super.display();
}
}
public class hierarchy{
public static void main(String args[]){
C obj=new C();
obj.display();
int a=20;
System.out.println(a);

}
}
