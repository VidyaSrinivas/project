package event;


import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuDemo extends JFrame{
	MenuDemo()
	{
		JMenuBar menubar=new JMenuBar();
		JMenu menu=new JMenu("Employee details");
		JMenuItem menuitem1=new JMenuItem("NAME");
		JMenuItem menuitem2=new JMenuItem("ID");
		menu.add(menuitem1);
		menu.add(menuitem2);
		menubar.add(menu);
		
		setJMenuBar(menubar);
		setSize(400, 400);
		setTitle("MenuDemo");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MenuDemo();
	}

}


