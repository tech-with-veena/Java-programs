class A{
public void display(int a){
System.out.println("Argument in a:"+a);
}
public void display(int a,int b){
System.out.println("Arguement of a " + a  + "And b" + " " + b);
}

}
class module14{
public static void main(String args[]){
A obj=new A();
obj.display(4);
obj.display(4,5);

}
}

