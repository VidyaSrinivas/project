package assignmentdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Contact{
	String name;
	String phno;
public Contact(String name,String phno){
	this.name=name;
	this.phno=phno;
}


	@Override
public String toString() {
	return "Contact [name=" + name + ", phno=" + phno + "]";
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Contact C1 = new Contact("nidhi","9986354378");
	   Contact C2 = new Contact("sowmya","9986354371");
	   Contact C3 = new Contact("geeta","9986354373");
	   Contact C4 = new Contact("shami","9986354374");
	   Contact C5 = new Contact("uma","9986354379");
	   ArrayList<Contact>list = new ArrayList<>(); 
	   list.add(C1);
	   list.add(C2);
	   list.add(C3);
	   list.add(C4);
	   list.add(C5);
	   Iterator it = list.iterator();
		while(it.hasNext())
	 System.out.println(it.next());
		
	   

	}

}
