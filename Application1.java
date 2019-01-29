package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;	
public class Application extends JFrame implements ActionListener{     
	static String name,email,contno;
static	int id;
	static String gender;
JLabel lblEName, lblEID, lblESex, lblEmail, lblCN, lblDepart;
JButton btnSubmit, btnCancel; 
JTextField txtEName, txtEID, txtEmail, txtCN; 
JRadioButton rbtnMale, rbtnFemale;
JCheckBox cbInfra, cbFood, cbCab, cbWE;
ButtonGroup bg;
 Application(){       
lblEName = new JLabel("Full Name:");
lblEID = new JLabel("Employee ID:");
lblESex = new JLabel("Sex:");
lblEmail = new JLabel("Email:");
lblCN = new JLabel("Contact No:");
btnSubmit = new JButton("Submit");
btnCancel = new JButton("Cancel");
btnSubmit.addActionListener(this);
btnCancel.addActionListener(this);
txtEName = new JTextField();
txtEID = new JTextField();	         
txtEmail = new JTextField();	        
txtCN = new JTextField();
rbtnMale = new JRadioButton("Male");        
rbtnFemale = new JRadioButton("Female"); 
bg= new ButtonGroup();
bg.add(rbtnMale);
bg.add(rbtnFemale);
setTitle("Employee Applcation Form");   
setSize(580,560);	      
 setVisible(true);
}
public void addComponent()     
{	         
setLayout(null);
lblEName.setBounds(10, 20, 100, 20);    
add(lblEName);        
txtEName.setBounds(120, 20, 150, 20);         
add(txtEName);    
lblEID.setBounds(280, 20, 100, 20);         
add(lblEID);       
txtEID.setBounds(370, 20, 150, 20);         
add(txtEID);	         
lblESex.setBounds(10, 50, 50, 20);         
add(lblESex);        
rbtnMale.setBounds(120, 50, 70, 20);    
 add(rbtnMale);  
rbtnFemale.setBounds(200, 50, 100, 20);   
add(rbtnFemale);
 lblEmail.setBounds(10,80, 100,20);        
 add(lblEmail);     
 txtEmail.setBounds(120, 80, 150, 20);     
 add(txtEmail);    
 lblCN.setBounds(280, 80, 150, 20);    
 add(lblCN);      
txtCN.setBounds(370, 80, 150, 20);     
 add(txtCN);            
 btnSubmit.setBounds(200,120,100,25);
add(btnSubmit);        
 btnCancel.setBounds(350,120,100,25);         
add(btnCancel); 
setResizable(false); 


 }  


@Override
public void actionPerformed(ActionEvent e ) {
	// TODO Auto-generated method stub
	ArrayList<Employee>list = new ArrayList<>(); 
	String cmd =e.getActionCommand();
	System.out.println(cmd);
	if(cmd=="Submit")
	{
		name=txtEName.getText();
	    email=txtEmail.getText();
	    contno=txtCN.getText();
	    id= Integer.parseInt(txtEID.getText());
	   
	    if(rbtnMale.isSelected())
	 
	    	gender="male";
	    else
	    	gender="female";
	    Employee E1 = new Employee(name,email,contno,gender,id);
		
		   list.add(E1);
		   Iterator it = list.iterator();
			while(it.hasNext())
		 System.out.println(it.next());
	}
	
	    
	else if(cmd=="Cancel") {
		txtEName.setText("");
		txtEID.setText("");
		txtEmail.setText("");
	}
}
	 public static void main(String[] args) 
	 {       
	 Application obj = new Application();    
	obj.addComponent();	   
	
	 }

}
		
	





