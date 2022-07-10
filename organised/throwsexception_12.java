class throws1{
public void display() throws ArithmeticException{
System.out.println("It throws");
throw new ArithmeticException("demo");
}
}
public class throwsexception{
public static void main(String args[]){
try{
throws1 obj=new throws1();
obj.display();

}
catch(ArithmeticException e){
System.out.println("Error");
}
}
}



