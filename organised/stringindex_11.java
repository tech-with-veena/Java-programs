public class stringindex{
public static void main(String ars[]){
try{
String a="abc";
System.out.println("The character at :"+ a.charAt(4));
}
catch(StringIndexOutOfBoundsException e){
System.out.println("Error");
}
}
}

