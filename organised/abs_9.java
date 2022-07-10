abstract class A{
abstract void display();
}
class B extends A{
public void display(){
System.out.println("Defined in B");
}
}
public class abs{
public static void main(String args[]){
A obj=new  B();
obj.display();
}
}

