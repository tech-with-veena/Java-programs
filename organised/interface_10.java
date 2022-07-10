interface A{
public void sq(int a);
}
interface B {
public void display(int b);
}
class  C implements A,B{
public void sq(int a){
System.out.println(a*a);
}
public void display(int a){
System.out.println(a*a*a);
}
}

public class interface1{
public static void main(String args[]){
C obj3=new C();
obj3.display(5);
obj3.sq(5);

}
}




