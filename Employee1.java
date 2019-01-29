package event;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	String name,email,cntno,gender;
	int id;

Employee(String name,String email,String cntno,String gender,int id)
{
	this.name=name;
	this.email=email;
	this.cntno=cntno;
	this.gender=gender;
	this.id=id;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", email=" + email + ", cntno=" + cntno + ", gender=" + gender + ", id=" + id
			+ "]";
}

public static void main(String[] args) {
	
		
	   
}
}
	// TODO Auto-generated method stub
  