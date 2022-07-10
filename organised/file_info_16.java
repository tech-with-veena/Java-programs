import java.io.File;
public class sixteen_a{
public static void main(String args[]){
File my=new File("Hello.txt");
if (my.exists()){
System.out.println("Filename:"+ my.getName());
System.out.println("Reaerabel or not"+ my.canRead());
System.out.println("Writable"+ my.canWrite());
System.out.println("Absolutepath"+ my.getAbsolutePath());
System.out.println("File size"+ my.length());
}
else{
System.out.println("error");
}
}
}


