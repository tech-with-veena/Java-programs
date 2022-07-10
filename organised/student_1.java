import java.util.Scanner;
class student{
String name;
String usn;
String branch;
String phonenum;
public String getUsn() {
	return usn;
	    }

	public void setUsn(String usn) 
	{
	this.usn = usn;
	}

	public String getName() 
	{
	return name;
    }

	public void setName(String name)
	{
	        this.name = name;
	}

	public String getBranch() 
	{
	return branch;
	}

	public void setBranch(String branch) 
	{
	this.branch = branch;
	}

	public String getPhonenum() 
	{
	return phonenum;
	}

	public void setPhonenum(String phonenum) 
	{
	this.phonenum= phonenum;
	}


}
public class stu{
public static void main(String[] args){
System.out.println("Enter the number of students");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
student[] studentList=new student[n];
for(int i=0;i<n;i++){
studentList[i]=new student();
}
for(int i=0;i<n;i++){
System.out.println("Enter the student " + i+1 + "details");
System.out.println("The details are:");
System.out.println("Enter name:");
studentList[i].setName(sc.next());
System.out.println("Enter usn:");
studentList[i].setUsn(sc.next());
System.out.println("Enter branch:");
studentList[i].setBranch(sc.next());
System.out.println("Enter phonenum:");
studentList[i].setPhonenum(sc.next());
}
for(int i=0;i<n;i++){
System.out.println("The details are:");
System.out.println("Name:"+studentList[i].getName());
System.out.println("usn:"+studentList[i].getUsn());
System.out.println("branch:"+studentList[i].getBranch());
System.out.println("phonenum:"+studentList[i].getPhonenum());
}
}
}

























