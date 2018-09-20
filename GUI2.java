import javax.swing.*;


import java.awt.*;

import javax.swing.BoxLayout;

import java.awt.event.*;

class GUI2
{
  JFrame frame;
  
  JMenuBar menuBar;
  
  JPanel firstNamePanel, lastNamePanel, addressPanel, phoneNumberPanel, licensePlatePanel, carTypePanel, modelPanel, carCompanyPanel,
            firstNamePanel1, lastNamePanel1, licensePlatePanel1, carTypePanel1, modelPanel1, carCompanyPanel1,licensePlatePanel2, combinePanel, combinePanel1,
            selectionPanel, selectionPanel1, addCarPanel, removeCarPanel, editCarPanel;
  
  JTextField firstNameTextBox, lastNameTextBox, addressTextBox, phoneNumberTextBox, licensePlateTextBox, carTypeTextBox, modelTextBox, carCompanyTextBox,
                   firstNameTextBox1, lastNameTextBox1, licensePlateTextBox1, carTypeTextBox1, modelTextBox1, carCompanyTextBox1, licensePlateTextBox2; 
  
  JLabel firstNameLabel, lastNameLabel, addressLabel, phoneNumberLabel, licensePlateLabel, carTypeLabel, modelLabel, carCompanyLabel,
            firstNameLabel1, lastNameLabel1, licensePlateLabel1, carTypeLabel1, modelLabel1, carCompanyLabel1, licensePlateLabel2,
            removeACar, editLabel;
  
  JButton submit, submit1, submit2;
  
  JCheckBox carWash, interiorCleaning, oilChange, engineChange, windowsChange,
                  carWash1, interiorCleaning1, oilChange1, engineChange1, windowsChange1;
  
  JComboBox <String> carTypeDropBox;
  JComboBox <String> carTypeDropBox1;
  String[] carTypes = { "Convertible", "Coupe", "Electric", "Hybrid", "Motorcycle", "Sedan", "Sports Car", "Truck", "Van", "Others"};
  
  public static void main (String args [])
  {
    new GUI2().go();
  }
  private void go()
  {
    //creating the JFrame
    frame = new JFrame();
    
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
        
    // Add menu panel labels, panels, text boxes, and buttons
    firstNameLabel = new JLabel ("First Name:");
    firstNameTextBox = new JTextField ("",20);
    firstNamePanel = new JPanel ();
    firstNamePanel.setLayout (new FlowLayout(FlowLayout.LEFT));
    firstNamePanel.add(firstNameLabel);
    firstNamePanel.add(firstNameTextBox);
    
    lastNameLabel = new JLabel ("Last Name:");
    lastNameTextBox = new JTextField ("",20);
    lastNamePanel = new JPanel ();
    lastNamePanel.setLayout (new FlowLayout(FlowLayout.LEFT));
    lastNamePanel.add(lastNameLabel);
    lastNamePanel.add(lastNameTextBox);
    
    addressLabel = new JLabel ("Address:");
    addressTextBox = new JTextField ("",20);
    addressPanel = new JPanel ();
    addressPanel.setLayout (new FlowLayout(FlowLayout.LEFT));
    addressPanel.add(addressLabel);
    addressPanel.add(addressTextBox);
    
    phoneNumberLabel = new JLabel ("Phone Number:");
    phoneNumberTextBox = new JTextField ("",20);
    phoneNumberPanel = new JPanel ();
    phoneNumberPanel.setLayout (new FlowLayout(FlowLayout.LEFT));
    phoneNumberPanel.add(phoneNumberLabel);
    phoneNumberPanel.add(phoneNumberTextBox);
    
    licensePlateLabel = new JLabel ("License Plate:");
    licensePlateTextBox = new JTextField ("",20);
    licensePlatePanel = new JPanel ();
    licensePlatePanel.setLayout (new FlowLayout(FlowLayout.LEFT));
    licensePlatePanel.add(licensePlateLabel);
    licensePlatePanel.add(licensePlateTextBox);
    
    carCompanyLabel = new JLabel ("Car Company:");
    carCompanyTextBox = new JTextField ("",20);
    carCompanyPanel = new JPanel ();
    carCompanyPanel.setLayout (new FlowLayout(FlowLayout.LEFT));
    carCompanyPanel.add(carCompanyLabel);
    carCompanyPanel.add(carCompanyTextBox);

    modelLabel = new JLabel ("Model:");
    modelTextBox = new JTextField ("",20);
    modelPanel = new JPanel ();
    modelPanel.setLayout (new FlowLayout(FlowLayout.LEFT));
    modelPanel.add(modelLabel);
    modelPanel.add(modelTextBox);
    
    carTypeLabel = new JLabel ("Car Type:");
    carTypeDropBox = new JComboBox<String> (carTypes);
    carTypePanel = new JPanel ();
    carTypePanel.setLayout (new FlowLayout(FlowLayout.LEFT));
    carTypePanel.add(carTypeLabel);
    carTypePanel.add(carTypeDropBox);
    submit = new JButton ("Submit Information");
    submit.addActionListener(new AddButtonListener ());
    
    
    // Edit menu
    firstNameLabel1 = new JLabel ("First Name:");
    firstNameTextBox1 = new JTextField ("",20);
    firstNamePanel1 = new JPanel ();
    firstNamePanel1.setLayout (new FlowLayout(FlowLayout.LEFT));
    firstNamePanel1.add(firstNameLabel1);
    firstNamePanel1.add(firstNameTextBox1);
    
    lastNameLabel1 = new JLabel ("Last Name:");
    lastNameTextBox1 = new JTextField ("",20);
    lastNamePanel1 = new JPanel ();
    lastNamePanel1.setLayout (new FlowLayout(FlowLayout.LEFT));
    lastNamePanel1.add(lastNameLabel1);
    lastNamePanel1.add(lastNameTextBox1);
    
    licensePlateLabel1 = new JLabel ("License Plate:");
    licensePlateTextBox1 = new JTextField ("",20);
    licensePlatePanel1 = new JPanel ();
    licensePlatePanel1.setLayout (new FlowLayout(FlowLayout.LEFT));
    licensePlatePanel1.add(licensePlateLabel1);
    licensePlatePanel1.add(licensePlateTextBox1);
    
    carCompanyLabel1 = new JLabel ("Car Company:");
    carCompanyTextBox1 = new JTextField ("",20);
    carCompanyPanel1 = new JPanel ();
    carCompanyPanel1.setLayout (new FlowLayout(FlowLayout.LEFT));
    carCompanyPanel1.add(carCompanyLabel1);
    carCompanyPanel1.add(carCompanyTextBox1);

    modelLabel1 = new JLabel ("Model:");
    modelTextBox1 = new JTextField ("",20);
    modelPanel1 = new JPanel ();
    modelPanel1.setLayout (new FlowLayout(FlowLayout.LEFT));
    modelPanel1.add(modelLabel1);
    modelPanel1.add(modelTextBox1);
    
    carTypeLabel1 = new JLabel ("Car Type:");
    carTypeDropBox1 = new JComboBox<String> (carTypes);
    carTypePanel1 = new JPanel ();
    carTypePanel1.setLayout (new FlowLayout(FlowLayout.LEFT));
    carTypePanel1.add(carTypeLabel1);
    carTypePanel1.add(carTypeDropBox1);
    
    submit1 = new JButton ("Submit Information");
    submit1.addActionListener(new EditSubmitButtonListener ());
    submit2 = new JButton ("Submit Information");
    submit2.addActionListener(new RemoveButtonListener ());
    
    licensePlatePanel2 = new JPanel ();
    licensePlateLabel2 = new JLabel ("License Plate:");
    licensePlateTextBox2 = new JTextField ("", 20);
    licensePlatePanel2.setLayout (new FlowLayout(FlowLayout.LEFT));
    licensePlatePanel2.add(licensePlateLabel2);
    licensePlatePanel2.add(licensePlateTextBox2);
    
    selectionPanel = new JPanel ();
    carWash = new JCheckBox ("Car Wash");
    interiorCleaning = new JCheckBox ("Interior Cleaning");
    oilChange = new JCheckBox ("Oil Change");
    engineChange = new JCheckBox ("Engine Change");
    windowsChange = new JCheckBox ("Windows Change");
    selectionPanel.setLayout (new FlowLayout());
    selectionPanel.add (carWash);
    selectionPanel.add (interiorCleaning);
    selectionPanel.add (oilChange);
    selectionPanel.add (engineChange);
    selectionPanel.add (windowsChange);
    
    selectionPanel1 = new JPanel ();
    carWash1 = new JCheckBox ("Car Wash");
    interiorCleaning1 = new JCheckBox ("Interior Cleaning");
    oilChange1 = new JCheckBox ("Oil Change");
    engineChange1 = new JCheckBox ("Engine Change");
    windowsChange1 = new JCheckBox ("Windows Change");
    selectionPanel1.setLayout (new FlowLayout());
    selectionPanel1.add (carWash1);
    selectionPanel1.add (interiorCleaning1);
    selectionPanel1.add (oilChange1);
    selectionPanel1.add (engineChange1);
    selectionPanel1.add (windowsChange1);
         
    combinePanel = new JPanel();
    combinePanel.setLayout (new GridLayout(6,1));
    combinePanel.add(firstNamePanel);
    combinePanel.add(lastNamePanel);
    combinePanel.add(addressPanel);
    combinePanel.add(phoneNumberPanel);
    combinePanel.add(licensePlatePanel);
    combinePanel.add(carCompanyPanel);
    combinePanel.add(modelPanel);
    combinePanel.add(carTypePanel);
    
    combinePanel1 = new JPanel();
    combinePanel1.setLayout (new GridLayout(6,1));
    combinePanel1.add(firstNamePanel1);
    combinePanel1.add(lastNamePanel1);
    combinePanel1.add(licensePlatePanel1);
    combinePanel1.add(carCompanyPanel1);
    combinePanel1.add(modelPanel1);
    combinePanel1.add(carTypePanel1);
      
    addCarPanel = new JPanel();   
    removeCarPanel = new JPanel();
    editCarPanel = new JPanel();
    
    addCarPanel.setLayout (new BoxLayout(addCarPanel, BoxLayout.Y_AXIS));
    addCarPanel.add(combinePanel);
    addCarPanel.add(selectionPanel);
    addCarPanel.add(submit);
    
    removeCarPanel.setLayout (new BoxLayout(removeCarPanel, BoxLayout.Y_AXIS));
    removeACar = new JLabel ("Please enter the license plate to remove the car");
    removeCarPanel.add (removeACar);
    removeCarPanel.add(licensePlatePanel2);
    removeCarPanel.add(submit2);
    
    editLabel = new JLabel ("Please enter the license plate to edit the information");
    
    editCarPanel.setLayout (new BoxLayout(editCarPanel, BoxLayout.Y_AXIS));
    editCarPanel.add(editLabel);
    editCarPanel.add(combinePanel1);
    editCarPanel.add(selectionPanel1);
    editCarPanel.add(submit1);
            
    //Creating and adding tabs to the tabbed pane
    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.addTab ("Add", addCarPanel);
    tabbedPane.addTab ("Remove", removeCarPanel);
    tabbedPane.addTab("Edit", editCarPanel);
    
    //adding tabbed pane to frame
    frame.setJMenuBar(menuBar);
    frame.getContentPane ().add(tabbedPane);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(true);
    frame.setSize (764, 500);
  }
    
    class AddButtonListener implements ActionListener 
    {
      public void actionPerformed (ActionEvent event)
      {
        boolean a = carWash.isSelected();
        boolean b = interiorCleaning.isSelected();
        boolean c = oilChange.isSelected();
        boolean d = engineChange.isSelected();
        boolean e = windowsChange.isSelected();
        String type =(String) (carTypeDropBox.getSelectedItem());
        
		// Get basic customer information
		String name = firstNameTextBox.getText() + " " + lastNameTextBox.getText();
		String address = addressTextBox.getText();
		String phoneNumber = phoneNumberTextBox.getText();
		//Client customer = new Client(name,address,phoneNumber);
//		customer.add(car);
//		clients.add(customer);
        
        JOptionPane.showMessageDialog(null, "Box 1 is: " + a +"\n Box 2 is:" + b +"\nBox 3 is: " + c +"\n Box 4 is:" + d +"\nBox 5 is: " + e  +"\nCar Type is: " + type);
      }
    }
    class RemoveButtonListener implements ActionListener 
    {
      public void actionPerformed (ActionEvent event)
      {
        //insert code here (remove the car) and make an invoice
    	  
      }
    }
    class EditSubmitButtonListener implements ActionListener 
    {
      public void actionPerformed (ActionEvent event)
      {
        //insert code here (first check if license plate is saved then edit the other information)
      }
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