import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;

import ticket_package.TicketPrice;		//Import TicketPrice class from ticket_package package

class TicketReview extends JFrame implements ActionListener {

    private Container c;		//Container of JFrame

    private JLabel title;       //title header
	private JLabel tInfo;		//Ticket Information
	private JLabel tPrice;		//Ticket Price
	private JLabel name;		//Name inside Ticket Info
	private JLabel nameV;		//Name noAdult inside Ticket Info
	private JLabel tCat;		//Ticket Category inside Ticket Info
	private JLabel tCatV;		//Ticket Category noAdult inside Ticket Info
	private JLabel noa; 		//Number of Adult inside Ticket Info
	private JLabel noaV; 		//Number of Adult noAdult inside Ticket Info
	private JLabel noc;			//Number of Children inside Ticket Info
	private JLabel nocV;		//Number of Children noAdult inside Ticket Info
	private JLabel item;		//Item inside Ticket Price
	private JLabel price;		//Price inside Ticket Price
	private JLabel priceAdult;	//Ticket price for Adult
	private JLabel priceChild;	//Ticket price for Children
	private JLabel adultTicket;	//Adult Ticket inside Ticket price
	private JLabel childTicket;	//Child Ticket inside Ticket price
	private JLabel category;	//Category inside Ticket Price
	private JLabel ticketCategoryV;	//Value of ticket category
	private JLabel qty;			//Quantity inside Ticket Price
	private JLabel qtyAdult;	//Number of Adult ticket
	private JLabel qtyChild;	//Number of Children ticket
	private JLabel total;		//Total inside Ticket Price
	private JLabel totalAdult;	//Total amount of Adult ticket
	private JLabel totalChild;	//Total amount of Children ticket
	private JLabel totalAmount;	//Total amount of Adult and Children ticket label
	private JLabel totalAdultChild; //Total amount of Adult and Children ticket value
	private JLabel colon;		// :
	
	private JPanel top;			//Top panel of JFrame
	private JPanel top1;		//Top panel of 'top' panel
	private JPanel top2;		//Bottom panel of 'top' panel
	private JPanel top22;		//A panel inside 'top2' panel
	private JPanel bottom;		//Bottom panel of JFrame
	private JPanel bottom1;		//Top panel of 'bottom' panel
	private JPanel bottom2;		//Bottom panel of 'bottom' panel
	private JPanel bottom11;	//A panel inside 'bottom1' panel

	private JButton proceed;	//Button inside 'bottom2' panel
	private JButton cancel;		//Button inside 'bottom2' panel
	

    public TicketReview(){

		//--------JFrame-------
        setTitle("Theme Park Ticket System");
		setBounds(300, 90, 800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

        c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(new Color(56, 62, 61)); //grey

		//--------Setting up top panel---------
		//Top panel
		top = new JPanel();
		top.setPreferredSize(new Dimension(700,230)); 
		top.setLayout(new BorderLayout());
		top.setBackground(new Color(56, 62, 61)); //grey
		c.add(top, BorderLayout.NORTH);

		//top 1 panel (inside top panel)
		top1 = new JPanel();
		top1.setPreferredSize(new Dimension(700,40));
		top1.setBackground(new Color(12, 12, 12)); //black
		top.add(top1, BorderLayout.NORTH);

		//top 2 panel (inside top panel)
		top2 = new JPanel();
		top2.setPreferredSize(new Dimension(400,180));
		top2.setBackground(new Color(56, 62, 61)); //grey
		top.add(top2, BorderLayout.SOUTH);

		//top 22 panel (inside top 2 panel)
		top22 = new JPanel();
		top22.setPreferredSize(new Dimension(600,165));
		top22.setBackground(new Color(140, 220, 222));
		top22.setLayout(null);
		top2.add(top22, BorderLayout.CENTER);

		//------Content inside 'top22' panel------
		//Ticket info label
		tInfo = new JLabel("Ticket Information");
		tInfo.setFont(new Font("Arial", Font.BOLD, 15));
		tInfo.setSize(150, 20);
		tInfo.setLocation(20, 10);
		top22.add(tInfo);

		//Name label
		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 14));
		name.setSize(150, 20);
		name.setLocation(20, 40);
		top22.add(name);

		//Ticket Category label
		tCat = new JLabel("Ticket Category");
		tCat.setFont(new Font("Arial", Font.PLAIN, 14));
		tCat.setSize(150, 20);
		tCat.setLocation(20, 60);
		top22.add(tCat);

		//Number of Adult label
		noa = new JLabel("Number of Adult");
		noa.setFont(new Font("Arial", Font.PLAIN, 14));
		noa.setSize(150, 20);
		noa.setLocation(20, 80);
		top22.add(noa);

		//Number of Children label
		noc = new JLabel("Number of Children");
		noc.setFont(new Font("Arial", Font.PLAIN, 14));
		noc.setSize(150, 20);
		noc.setLocation(20, 100);
		top22.add(noc);

		//colon label (:)
		colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(190, 100);
		top22.add(colon);

        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(190, 80);
		top22.add(colon);

        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(190, 60);
		top22.add(colon);

        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(190, 40);
		top22.add(colon);

		// -----------Setting the value of the `noOfAdult` variable in the `Customer` class to the value of the `tnoa`---------------
  		// variable in the 'TicketGenerator' class.
		//Retrieve the name value
		nameV = new JLabel(TicketGenerator.customer1.getFullName());
		nameV.setFont(new Font("Arial", Font.PLAIN, 14));
		nameV.setSize(150, 20);
		nameV.setLocation(200, 40);
		top22.add(nameV);

		//Retrieve the ticket category value
		tCatV = new JLabel(TicketGenerator.customer1.getCategory());
		tCatV.setFont(new Font("Arial", Font.PLAIN, 14));
		tCatV.setSize(150, 20);
		tCatV.setLocation(200, 60);
		top22.add(tCatV);

		noaV = new JLabel(TicketGenerator.customer1.getNoOfAdult());
		noaV.setFont(new Font("Arial", Font.PLAIN, 14));
		noaV.setSize(150, 20);
		noaV.setLocation(200, 80);
		top22.add(noaV);

		nocV = new JLabel(TicketGenerator.customer1.getNoOfChild());
		nocV.setFont(new Font("Arial", Font.PLAIN, 14));
		nocV.setSize(150, 20);
		nocV.setLocation(200, 100);
		top22.add(nocV);


		//---------------Title Header------------------
        title = new JLabel("Theme Park Ticket Generator");
		title.setFont(new Font("Arial", Font.BOLD, 20));
		title.setSize(300, 30);
		title.setLocation(250, 30);
		title.setForeground(new Color(140, 220, 222)); //blue
		top1.add(title);

		//---------------Setting up bottom panel--------------------
		//bottom panel
		bottom = new JPanel();
		bottom.setPreferredSize(new Dimension(400,230)); 
		bottom.setBackground(new Color(56, 62, 61)); //grey
		c.add(bottom, BorderLayout.SOUTH);

		//bottom 1 panel (inside bottom panel)
		bottom1 = new JPanel();
		bottom1.setPreferredSize(new Dimension(600,180));
		bottom1.setBackground(new Color(56, 62, 61)); //grey
		bottom.add(bottom1, BorderLayout.NORTH);

		//bottom 11 panel (inside bottom 1 panel)
		bottom11 = new JPanel();
		bottom11.setPreferredSize(new Dimension(600,165));
		bottom11.setBackground(new Color(140, 220, 222));
		bottom11.setLayout(null);
		bottom1.add(bottom11, BorderLayout.CENTER);

		//Content inside 'bottom11' panel
		//Ticket price label
		tPrice = new JLabel("Ticket Price");
		tPrice.setFont(new Font("Arial", Font.BOLD, 15));
		tPrice.setSize(150, 20);
		tPrice.setLocation(20, 10);
		bottom11.add(tPrice);

		//Item label
		item = new JLabel("Item");
		item.setFont(new Font("Arial", Font.PLAIN, 14));
		item.setSize(150, 20);
		item.setLocation(20, 40);
		bottom11.add(item);

		//Price label
		price = new JLabel("Price");
		price.setFont(new Font("Arial", Font.PLAIN, 14));
		price.setSize(150, 20);
		price.setLocation(150, 40);
		bottom11.add(price);

		//Category label
		category = new JLabel("Category");
		category.setFont(new Font("Arial", Font.PLAIN, 14));
		category.setSize(150, 20);
		category.setLocation(230, 40);
		bottom11.add(category);

		//Quantity label
		qty = new JLabel("Quantity");
		qty.setFont(new Font("Arial", Font.PLAIN, 14));
		qty.setSize(150, 20);
		qty.setLocation(360, 40);
		bottom11.add(qty);

		//Total label
		total = new JLabel("Total");
		total.setFont(new Font("Arial", Font.PLAIN, 14));
		total.setSize(150, 20);
		total.setLocation(480, 40);
		bottom11.add(total);

		// Creating a new JLabel object with the text "Adult Ticket" 
		adultTicket = new JLabel("Adult Ticket");
		adultTicket.setFont(new Font("Arial", Font.PLAIN, 14));
		adultTicket.setSize(150, 20);
		adultTicket.setLocation(20, 60);
		bottom11.add(adultTicket);

		// Creating a new Jlabel object with the text "Children Ticket"
		childTicket = new JLabel("Children Ticket");
		childTicket.setFont(new Font("Arial", Font.PLAIN, 14));
		childTicket.setSize(150, 20);
		childTicket.setLocation(20, 80);
		bottom11.add(childTicket);

		// Creating a new JLabel object called qtyAdult and setting it to the value of the number of adults in the customer1 object.
		qtyAdult = new JLabel(TicketGenerator.customer1.getNoOfAdult());
		qtyAdult.setFont(new Font("Arial", Font.PLAIN, 14));
		qtyAdult.setSize(150, 20);
		qtyAdult.setLocation(360, 60);
		bottom11.add(qtyAdult);

		// Creating a new JLabel object called qtyChild and setting it to the value of the number of children in the customer1 object.
		qtyChild = new JLabel(TicketGenerator.customer1.getNoOfChild());
		qtyChild.setFont(new Font("Arial", Font.PLAIN, 14));
		qtyChild.setSize(150, 20);
		qtyChild.setLocation(360, 80);
		bottom11.add(qtyChild);

		// Declaring two variables, totalAllAdult and totalAllChildren, and setting them to 0.
		int totalAllAdult = 0;
		int totalAllChildren = 0;
		// Creating a new object called tp of the TicketPrice class.
		TicketPrice tp = new TicketPrice();
		// If user choose all themepark category from previous frame
		if (TicketGenerator.all.isSelected()){
			// Creating a new JLabel called priceAdult and setting the text to the value of the getAllAdult method in the TicketPrice class.
			priceAdult = new JLabel("RM " + Integer.toString(tp.getAllAdult()) + ".00");
			// Creating a new JLabel called priceChild and setting the text to the value of the getAllChildren method in the TicketPrice class.
			priceChild = new JLabel("RM " + Integer.toString(tp.getAllChildren()) + ".00");
			// Multiplying the number of adults by the price of the ticket.
			totalAllAdult = Integer.valueOf(qtyAdult.getText()) * tp.getAllAdult();
			// Creating a new JLabel called totalAdult and setting the text to the String value of totalAllAdult that is converts from integer
			totalAdult = new JLabel("RM " + Integer.toString(totalAllAdult) + ".00"); 
			// Multiplying the number of children by the price of the ticket.
			totalAllChildren = Integer.valueOf(qtyChild.getText()) * tp.getAllChildren();
			// Creating a new JLabel called totalChild and setting the text to the String value of totalAllChildren that is converts from integer
			totalChild = new JLabel("RM " + Integer.toString(totalAllChildren) + ".00");

		}
		// If user choose waterpark only category from previous frame
			else if (TicketGenerator.water.isSelected()){
			// Creating a new JLabel called priceAdult and setting the text to the value of the getWaterparkAdult method in the TicketPrice class.
			priceAdult = new JLabel("RM " + Integer.toString(tp.getWaterparkAdult()) + ".00");
			// Creating a new JLabel called priceChild and setting the text to the value of the getWaterparkChildren method in the TicketPrice class.
			priceChild = new JLabel("RM " + Integer.toString(tp.getWaterparkChildren()) + ".00");
			// Multiplying the number of adults by the price of the ticket.
			totalAllAdult = Integer.valueOf(qtyAdult.getText()) * tp.getWaterparkAdult();
			// Creating a new JLabel called totalAdult and setting the text to the String value of totalAllAdult that is converts from integer
			totalAdult = new JLabel("RM " + Integer.toString(totalAllAdult) + ".00");
			// Multiplying the number of children by the price of the ticket.
			totalAllChildren = Integer.valueOf(qtyChild.getText()) * tp.getWaterparkChildren();
			// Creating a new JLabel called totalChild and setting the text to the String value of totalAllChildren that is converts from integer
			totalChild = new JLabel("RM " + Integer.toString(totalAllChildren) + ".00");
		}

		// Setting the font, size, and location of the priceAdult label.
		priceAdult.setFont(new Font("Arial", Font.PLAIN, 14));
		priceAdult.setSize(150, 20);
		priceAdult.setLocation(150, 60);
		bottom11.add(priceAdult);

		// Setting the font, size, and location of the priceChild label.
		priceChild.setFont(new Font("Arial", Font.PLAIN, 14));
		priceChild.setSize(150, 20);
		priceChild.setLocation(150, 80);
		bottom11.add(priceChild);
		
		// Creating a new JLabel object called ticketCategoryV (top).
		ticketCategoryV = new JLabel(TicketGenerator.customer1.getCategory());
		ticketCategoryV.setFont(new Font("Arial", Font.PLAIN, 14));
		ticketCategoryV.setSize(150, 20);
		ticketCategoryV.setLocation(230, 60);
		bottom11.add(ticketCategoryV);

		// Creating a new JLabel object called ticketCategoryV (bottom).
		ticketCategoryV = new JLabel(TicketGenerator.customer1.getCategory());
		ticketCategoryV.setFont(new Font("Arial", Font.PLAIN, 14));
		ticketCategoryV.setSize(150, 20);
		ticketCategoryV.setLocation(230, 80);
		bottom11.add(ticketCategoryV);

		// Setting the font, size, and location of the totalAdult label.
		totalAdult.setFont(new Font("Arial", Font.PLAIN, 14));
		totalAdult.setSize(150, 20);
		totalAdult.setLocation(480, 60);
		bottom11.add(totalAdult);

		// Setting the font, size, and location of the totalChild label.
		totalChild.setFont(new Font("Arial", Font.PLAIN, 14));
		totalChild.setSize(150, 20);
		totalChild.setLocation(480, 80);
		bottom11.add(totalChild);

		// Creating a Jlabel called totalAmount and setting its font, size and location.
		totalAmount = new JLabel("Total Amount");
		totalAmount.setFont(new Font("Arial", Font.BOLD, 15));
		totalAmount.setSize(150, 20);
		totalAmount.setLocation(20, 120);
		bottom11.add(totalAmount);

		// Adding the total price of all adults and children.
		int jumlahHarga = totalAllAdult + totalAllChildren;
		// Creating a JLabel called totalAdultChild and setting the text to the value of total price ticket of all adults and children
		totalAdultChild = new JLabel("RM " + Integer.toString(jumlahHarga) + ".00");
		totalAdultChild.setFont(new Font("Arial", Font.BOLD, 15));
		totalAdultChild.setSize(150, 20);
		totalAdultChild.setLocation(480, 120);
		bottom11.add(totalAdultChild);

		//bottom2 panel (inside bottom panel)
		bottom2 = new JPanel();
		bottom2.setPreferredSize(new Dimension(270,30));
		bottom2.setBackground(new Color(56, 62, 61)); //grey
		bottom2.setLayout(new BorderLayout());
		bottom.add(bottom2, BorderLayout.SOUTH);

		//Cancel button inside bottom2 panel
		cancel = new JButton("Cancel");
		cancel.setFont(new Font("Arial", Font.PLAIN, 15));
		cancel.setPreferredSize(new Dimension(100,28));
		cancel.addActionListener(this);
		cancel.setBackground(new Color(8, 210, 239)); //blue
		cancel.setBorder(new BevelBorder(BevelBorder.RAISED));

		//Proceed button inside bottom2 panel
		proceed = new JButton("Proceed");
		proceed.setFont(new Font("Arial", Font.PLAIN, 15));
		proceed.setPreferredSize(new Dimension(100,28));
		proceed.addActionListener(this);
		proceed.setBackground(new Color(8, 210, 239)); //blue
		proceed.setBorder(new BevelBorder(BevelBorder.RAISED));

		//Adding the button into bottom2 panel
		bottom2.add(cancel, BorderLayout.WEST);
		bottom2.add(proceed, BorderLayout.EAST);
		
		setVisible(true);
    }

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == proceed) {
			// If user click proceed button
            try{
				// Insert data into database using MySQL
				String sql = "INSERT INTO ticketinfo (name, category, `no. of adult`, `no. of children`, `total price`) VALUES('" + nameV.getText() + "','" + tCatV.getText() + "','" + qtyAdult.getText() + "','" + qtyChild.getText() + "','" + totalAdultChild.getText() + "')";
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/themepark", "root", "");
				PreparedStatement pstm = conn.prepareStatement(sql);
				pstm.execute();
				// Close PreparedStatement and Connection
				pstm.close();
				conn.close();
			}catch(HeadlessException | SQLException evException){
				// Display of database error
				JOptionPane.showMessageDialog(this, evException.getMessage());
			}
			// Close current frame
			setVisible(false);
			// Creating a new object of the class TicketPrint.
			TicketPrint TPrint = new TicketPrint();
			// Transfer priceAdult and priceChild values to TicketPrint frames
			TPrint.priceVA.setText(priceAdult.getText());
			TPrint.priceVA2.setText(priceAdult.getText());
	
			TPrint.priceVC.setText(priceChild.getText());
			TPrint.priceVC2.setText(priceChild.getText());
			// Open TicketPrint frame
			TPrint.setVisible(true);

        }else if (e.getSource() == cancel) {
			// If user click cancel button
			// Close current frame then open TicketGenerator frame
			setVisible(false);
			new TicketGenerator();
		}
	}
}

