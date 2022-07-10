class A{
public void display(int a){
System.out.println(a);
}
}
class B extends A{
public void display(int a){
System.out.println(a*a);
}
}
class C extends A{
public void display(int a){
System.out.println(a*a*a);
}
}
class dynamic{
public static void main(String args[]){
A obj1=new C(); //imppppp
obj1.display(2);
B obj2=new B();
obj2.display(2);
A obj3=new  A();
obj3.display(2);
}
}
