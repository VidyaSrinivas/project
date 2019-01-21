package employee;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Emp {
	int employee_id;;
	String employee_name;
	String department;
	String designation;
	int date_of_joining;
	int date_of_birth;
	String emailid;
	String Phoneno;
	String martial_status;
	int date_of_marriage;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Employee Details");
		System.out.println("enter employee id:");
		employee_id=sc.nextInt();
		System.out.println("enter employee name:");
		employee_name=sc.next();
		System.out.println("enter department:");
	     department=sc.next();
		System.out.println("enter designation:");
		designation=sc.next();
		System.out.println("enter date of joining:");
		date_of_joining=sc.nextInt();
		System.out.println("enter date of birth:");
		date_of_birth=sc.nextInt();
		System.out.println("enter Email Id:");
		emailid=sc.next();
		boolean valid=isValid(emailid);
	  if(!valid) {
		System.out.println("Email Id is invalid");
		System.out.println("enter Email Id:");
		emailid=sc.next();
		}
	
		System.out.println("Enter Phone Number:");
		Phoneno=sc.next();
		System.out.println("enter martial status:");
		martial_status=sc.next();
		System.out.println("enter date of marriage:");
		date_of_marriage=sc.nextInt();
	}
boolean isValid(String emailid){
	Pattern P1 = Pattern.compile("(^[a-z1-9]*)\\ @([a-z]*)\\.([a-zA-Z]*)");
  Matcher m1 =P1.matcher(emailid);
	if(m1.find()) { 
		return true;
	}
	else
		return	false;	
}

	public void display() {
		System.out.println("employee id:" + employee_id);
		System.out.println("employee name:" + employee_id);
		System.out.println("department:" + department);
		System.out.println("designation:" + designation);
		System.out.println("date of joining:" + date_of_joining);
		System.out.println("date of birth:" + date_of_birth);
		System.out.println("Email ID:" + emailid);
		System.out.println("Phone number:" + Phoneno);
		System.out.println("martial status:" + martial_status);
		System.out.println("date of marriage:" + date_of_marriage);
	}
}

class Employee{
	public static void main(String[] args){
		Emp[] E=new Emp[3];
		for(int i=0;i<3;i++){
			E[i]=new Emp();
		E[i].accept();
		E[i].display();
		}
}
}
