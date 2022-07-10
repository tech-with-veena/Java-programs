class A{
int i,j;
public A(){
i=5;
System.out.println(i);
}
public A(int k){
i=k;
System.out.println(k);
}
}
public class module141{
public static void main(String args[]){
A obj=new A();
A obj1=new A(9);
}
}
