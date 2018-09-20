import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;

import javax.swing.BoxLayout;


import java.awt.event.*;


public class mainProgram extends JFrame {
	ArrayList <phoneBook> contacts = new ArrayList <phoneBook> ();

	JFrame frame;
	JMenuBar menuBar;
	public static void main (String [] args)
	{
		new mainProgram().go();
	}
	public void go()
	{
		
	    
	    menuBar = new JMenuBar();
	    JMenu addMenu = new JMenu("Delete");
	    JMenuItem addService = new JMenuItem("Add Service");
	    addService.setMnemonic(KeyEvent.VK_A);
	    addService.addActionListener(new addServiceListener());
	    JMenuItem addCarType = new JMenuItem("Add Car Type");
	    addCarType.setMnemonic(KeyEvent.VK_C);
	    addCarType.addActionListener(new addCarTypeListener());
	    addMenu.setMnemonic(KeyEvent.VK_F);
	    addMenu.add(addService);
	    addMenu.add(addCarType);
	    menuBar.add(addMenu);
	        
	    frame.setJMenuBar(menuBar);
		    frame.getContentPane ();
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		    frame.setResizable(true);
		    frame.setSize (764, 500);
	}
	   class addServiceListener implements ActionListener
	      {
	      public void actionPerformed (ActionEvent event)
	      {
	        //jdialog to add service
	        JOptionPane.showMessageDialog(null, "Service Added");
	      }
	    }
	    class addCarTypeListener implements ActionListener
	      {
	      public void actionPerformed (ActionEvent event)
	      {
	        //jdialog to add car type
	      }
	    }
}
