class  A extends Exception{
public A(String a){
System.out.println("MY Execption");
}
}
public class userexception{
public static void main(String args[]){
try{
throw new A("goes to a");
}
catch(A e){
System.out.println("And printed");
}
}
}
