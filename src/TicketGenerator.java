import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import ticket_package.Customer; 		//import Customer class from ticket_package package

class TicketGenerator extends JFrame implements ActionListener  {

	// Components of the Form
	private Container c;			//Container inside JFrame
	private JLabel title;			//Title
	private JLabel name;			//Name in form
	private JTextField tname;		//Name text field in form
	private JLabel tCat;			//Ticket Category
	private JLabel noa;				//Number of adult
	private JLabel noc;				//Number of Children
	private JButton sub;			//Submit button
	private ButtonGroup bg; 		//Button Group
	private JTextField tnoa;		//Textfield for Number of Adult
	private JTextField tnoc;		//Textfield for Number of Children
	
	public static JRadioButton all;						//Radio Button for All waterpark
	public static JRadioButton water;					//Radio Button for Waterpark only
	public static Customer customer1 = new Customer();	//Customer object

	// constructor, to initialize the components with default values.
	public TicketGenerator()
	{	
		//----------------- Set the title for JPanel --------------
		setTitle("Theme Park Ticket System");
		setBounds(300, 90, 800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

		c = getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(41, 41, 41));
		
		//title Header
		title = new JLabel("Theme Park Ticket Generator");
		title.setFont(new Font("Arial", Font.BOLD, 20));
		title.setSize(300, 30);
		title.setLocation(250, 30);
		title.setForeground(new Color(140, 220, 222)); //blue
		c.add(title);

		//------------------- Set up form -----------------------
		//Full Name
		name = new JLabel("Full Name");
		name.setFont(new Font("Arial", Font.PLAIN, 18));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		name.setForeground(new Color(255, 255, 255)); //white
		c.add(name);

		//Full name text field
		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(400, 30);
		tname.setLocation(250, 100);
		c.add(tname);

		//Ticket category
		tCat = new JLabel("Ticket for");
		tCat.setFont(new Font("Arial", Font.PLAIN, 18));
		tCat.setSize(100, 20);
		tCat.setLocation(100, 150);
		tCat.setForeground(new Color(255, 255, 255)); //white
		c.add(tCat);

		//All theme park radio button
		all = new JRadioButton("All Theme Park");
		all.setFont(new Font("Arial", Font.PLAIN, 15));
		all.setSize(140, 30);
		all.setLocation(250, 145);
		all.setForeground(new Color(255, 255, 255)); //white
		all.setBackground(new Color(41, 41, 41));
		c.add(all);

		//Waterpark only radio button
		water = new JRadioButton("Waterpark Only");
		water.setFont(new Font("Arial", Font.PLAIN, 15));
		water.setSize(140, 30);
		water.setLocation(410, 145);
		water.setForeground(new Color(255, 255, 255)); //white
		water.setBackground(new Color(41, 41, 41));
		c.add(water);

		//Button group for the radio button
		bg = new ButtonGroup();
		bg.add(all); 
		bg.add(water);

		//No of Adult
		noa = new JLabel("No of Adult");
		noa.setFont(new Font("Arial", Font.PLAIN, 18));
		noa.setSize(100, 20);
		noa.setLocation(100, 200);
		noa.setForeground(new Color(255, 255, 255)); //white
		c.add(noa);

		//No of Adult text field
		tnoa = new JTextField();
		tnoa.setFont(new Font("Arial", Font.PLAIN, 15));
		tnoa.setSize(400, 30);
		tnoa.setLocation(250, 200);
		c.add(tnoa);

		//No of Children
		noc = new JLabel("No of Children");
		noc.setFont(new Font("Arial", Font.PLAIN, 18));
		noc.setSize(150, 20);
		noc.setLocation(100, 250);
		noc.setForeground(new Color(255, 255, 255)); //white
		c.add(noc);

		//Number of Children text field
		tnoc = new JTextField();
		tnoc.setFont(new Font("Arial", Font.PLAIN, 15));
		tnoc.setSize(400, 30);
		tnoc.setLocation(250, 250);
		c.add(tnoc);
 
		//Submit button
		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 30);
		sub.setLocation(330, 320);
		sub.setBackground(new Color(8, 210, 239)); 
		sub.setBorder(new BevelBorder(BevelBorder.RAISED));
		sub.addActionListener(this);
		c.add(sub);
	}

	// The function of this action listener is to obtain information about the visitor’s ticket description based on the visitor’s input
	public void actionPerformed(ActionEvent e)
	{
		// Setting the value of the full name, no of adult and no of child to the object customer1.
		customer1.setFullname(tname.getText());
		customer1.setNoOfAdult(tnoa.getText());
		customer1.setNoOfChild(tnoc.getText());
		
		// Setting the category of the ticket to the object customer1.
		if(all.isSelected()){
			customer1.setCategory("All Theme Park");
			// Close current frame then open TicketReview frame
			setVisible(false);
			new TicketReview();
		}
		if(water.isSelected()){
			customer1.setCategory("Waterpark Only");
			setVisible(false);
			new TicketReview();
		}
        
	}
}