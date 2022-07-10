class numberformat{
public static void main(String args[]){
try{
String a="1r";
int x=Integer.parseInt(a);
}
catch(NumberFormatException e){
System.out.println("Error");
}
}
}