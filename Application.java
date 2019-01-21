package term2design;
import javax.swing.*;	
public class Application extends JFrame
{	     
JLabel lblEName, lblEID, lblESex, lblEmail, lblCN, lblDepart;
JButton btnSubmit, btnCancel; 
JTextField txtEName, txtEID, txtEmail, txtCN; 
JRadioButton rbtnMale, rbtnFemale;
JCheckBox cbInfra, cbFood, cbCab, cbWE;
 Application(){       
lblEName = new JLabel("Full Name:");
lblEID = new JLabel("Employee ID:");
lblESex = new JLabel("Sex:");
lblEmail = new JLabel("Email:");
lblCN = new JLabel("Contact No:");
btnSubmit = new JButton("Submit");
btnCancel = new JButton("Cancel");
txtEName = new JTextField();
txtEID = new JTextField();	         
txtEmail = new JTextField();	        
txtCN = new JTextField();
rbtnMale = new JRadioButton("Male");        
rbtnFemale = new JRadioButton("Female");        
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
 public static void main(String[] args) 
 {       
 Application obj = new Application();    
obj.addComponent();	   
 }
	}




