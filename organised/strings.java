import java.util.*;
public class string{
public static void main(String args[]){
String s1 = "hello";
String s2="hello ";
String s3="Hello";
System.out.println("The lenght is"+s1.length());
if(!s1.isEmpty()){
System.out.println("Its not empty");
}
else{
System.out.println("Its empty");
}
System.out.println("blank : "+s1.isBlank());
System.out.println("Charater at:"+s1.charAt(2));
System.out.println("Equals to: "+s1.equals(s2));
System.out.println("Equals ignore case: "+s1.equalsIgnoreCase(s3));
System.out.println("Compare to: " +s1.compareTo("hello"));
System.out.println("Compare to ignore case: "+s1.compareToIgnoreCase(s3));
System.out.println("Starts with : "+ s1.startsWith("F"));
System.out.println("Starts with : "+s1.startsWith("H"));
System.out.println("Ends with: " +s1.endsWith("lo"));
System.out.println("Substrinh: " +s1.substring(1,4));
System.out.println("Concat: " +s1.concat(s3));
System.out.println("Replace: " +s1.replace("e","a"));
System.out.println("Replace: " +s1.replaceAll("o","u"));
System.out.println("Contains: " +s1.contains("ll"));
StringBuffer sbfr = new StringBuffer(s1);
System.out.println("Reverse : " +sbfr.reverse());
String text = "Java is a fun ";
    String[] result = text.split(" ");
    System.out.print("result = ");
    for (String str : result) {
      System.out.print(str + ", ");
    }
System.out.println("Join: "+s1.join(s2));
System.out.println("Upper case:"+s1.toUpperCase());
System.out.println("Lower case:"+s3.toLowerCase());
System.out.println("Trim: " + s1.trim());


}
}