class A{
int a=10;
A(){
System.out.println("IN A");
}
}
class B extends A{
int b=10;
B(){
System.out.println("IN B");
}
}
class multilevel{
public static void main(String args[]){
B obj=new B();
System.out.println(obj.a+obj.b);
}
}