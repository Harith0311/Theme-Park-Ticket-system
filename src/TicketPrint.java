import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class TicketPrint extends JFrame implements ActionListener  {

    private Container c;			//Container of JFrame

    private JPanel top;				//top panel of JFrame
	private JPanel top1;			//top1 panel inside top panel
	private JPanel top2;			//top2 panel inside top panel
    private JPanel topTix1;			//topTix1 panel inside top2 panel
    private JPanel topTix2;			//topTix2 panel inside top2 panel
    private JPanel qty1;			//qty1 panel inside top2 panel
    private JPanel bottom;			//bottom panel of JFrame
    private JPanel bottom1;			//bottom1 panel inside bottom panel
    private JPanel bottom2;			//bottom2 panel inside bottom panel
    private JPanel bottomTix1;		//bottomTix1 panel inside bottom2 panel
    private JPanel bottomTix2;		//bottomTix2 panel inside bottom2 panel
    private JPanel qty2;			//qty2 panel inside bottom2 panel

	//Adult
	private JLabel title;			//Title label
    private JLabel colon;			//colon (:) label
    private JLabel txAdult;			//Adult ticket label in topTix1 panel
    private JLabel txAdult2;		//Adult ticket label in topTix2 panel
    private JLabel tCat;			//Ticket category label
    private JLabel tDate;			//Date label
    private JLabel orderCreated;	//Order created label
    private JLabel price;			//Price label
    private JLabel tCatVA;			//value of ticket category 
    private JLabel tDateVA;			//value of date
    private JLabel orderCreatedVA;	//value of order created
    private JLabel pType;			//pass type 
	private JLabel lQty;			//Quantity label
	private JLabel lQty1;			//quantity value for adult
	private JLabel lQty2;			//quantity value for children

	public JLabel priceVA;			//price value for adult topTix1 panel
	public JLabel priceVA2;			//price value for adult topTix2 panel
	public JLabel priceVC;			//price value for children bottomTix1 panel
	public JLabel priceVC2;			//price value for children bottomTix2 panel
    
   
	//Children
    private JLabel txChildren;		//Children ticket label in topTix1 panel
    private JLabel txChildren2;		//Children ticket label in topTix2 panel
    private JLabel tCatVC;			//Value of ticket category for children
    private JLabel tDateVC;			//Value of date for children
    private JLabel orderCreatedVC;	//Value of order created for children
	private JLabel serialAdult;		//Serial number for Adult
	private JLabel serialAdultVal;	//Value of serial number for Adult
	private JLabel serialChild;		//Serial number for Children
	private JLabel serialChildVal;	//Value of serial number for Children

	private JButton print;			//Print button

    public TicketPrint(){
		//-----------Set up title for JFrame---------------
        setTitle("Theme Park Ticket System");
		setBounds(300, 90, 800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
        setVisible(true);

        c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(new Color(56, 62, 61)); //grey

        //-------------Set up Top panel-----------------
		//top panel
        top = new JPanel();
		top.setPreferredSize(new Dimension(700,230)); 
		top.setLayout(new BorderLayout());
		top.setBackground(new Color(56, 62, 61)); //grey
		c.add(top, BorderLayout.NORTH);

		//top1 panel (inside top panel)
		top1 = new JPanel();
		top1.setPreferredSize(new Dimension(700,40));
		top1.setBackground(new Color(12, 12, 12)); //black
		top.add(top1, BorderLayout.NORTH);

		//top2 panel (inside top panel)
		top2 = new JPanel();
		top2.setPreferredSize(new Dimension(400,180));
		top2.setBackground(new Color(56, 62, 61)); //grey
        top2.setLayout(new FlowLayout(FlowLayout.CENTER,3,5));
		top.add(top2, BorderLayout.SOUTH);

		//topTix1 panel (inside top2 panel)
        topTix1 = new JPanel();
        topTix1.setPreferredSize(new Dimension(380,160));
        topTix1.setBackground(new Color(196, 241, 240)); //light blue
        topTix1.setLayout(null);
		topTix1.setBorder(new BevelBorder(BevelBorder.RAISED));
        top2.add(topTix1);

		//topTix2 panel (inside top2 panel)
        topTix2 = new JPanel();
        topTix2.setPreferredSize(new Dimension(180,160));
        topTix2.setBackground(new Color(196, 241, 240)); //light blue
        topTix2.setLayout(null);
		topTix2.setBorder(new BevelBorder(BevelBorder.RAISED));
        top2.add(topTix2);

		//qty1 panel (inside top2 panel)
        qty1 = new JPanel();
        qty1.setPreferredSize(new Dimension(70,160));
        qty1.setBackground(new Color(56, 62, 61)); //grey
		qty1.setLayout(null);
        top2.add(qty1);

		//title header
		title = new JLabel("Theme Park Ticket Generator");
		title.setFont(new Font("Arial", Font.BOLD, 20));
		title.setSize(300, 30);
		title.setLocation(250, 30);
		title.setForeground(new Color(140, 220, 222)); //blue
		top1.add(title);

        //-----------------Content topTix1----------------------
        //Adult ticket label
        txAdult = new JLabel("Adult Ticket");
        txAdult.setFont(new Font("Arial", Font.BOLD, 15));
		txAdult.setSize(150, 20);
		txAdult.setLocation(20, 10);
		topTix1.add(txAdult);

		//Ticket Category label
        tCat = new JLabel("Ticket Category");
		tCat.setFont(new Font("Arial", Font.PLAIN, 14));
		tCat.setSize(150, 20);
		tCat.setLocation(20, 40);
		topTix1.add(tCat);

		//Date label
        tDate = new JLabel("Date");
		tDate.setFont(new Font("Arial", Font.PLAIN, 14));
		tDate.setSize(150, 20);
		tDate.setLocation(20, 60);
		topTix1.add(tDate);

		//Order created label
        orderCreated = new JLabel("Order Created");
		orderCreated.setFont(new Font("Arial", Font.PLAIN, 14));
		orderCreated.setSize(150, 20);
		orderCreated.setLocation(20, 80);
		topTix1.add(orderCreated);

		//Price label
        price = new JLabel("Price");
		price.setFont(new Font("Arial", Font.PLAIN, 14));
		price.setSize(150, 20);
		price.setLocation(20, 100);
		topTix1.add(price);

		//Serial number label
		serialAdult = new JLabel("Serial No. :");
		serialAdult.setFont(new Font("Serif", Font.PLAIN, 12));
		serialAdult.setSize(150, 20);
		serialAdult.setLocation(20, 135);
		topTix1.add(serialAdult);

		//-------------- colon (:) ---------------------
        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(160, 100);
		topTix1.add(colon);

        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(160, 80);
		topTix1.add(colon);

        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(160, 60);
		topTix1.add(colon);

        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(160, 40);
		topTix1.add(colon);

        //------------- label value --------------
		//Value for ticket category
        tCatVA = new JLabel(TicketGenerator.customer1.getCategory());
		tCatVA.setFont(new Font("Arial", Font.PLAIN, 14));
		tCatVA.setSize(150, 20);
		tCatVA.setLocation(170, 40);
		topTix1.add(tCatVA);

		// Java Program to Illustrate the getDateTimeInstance() Method of DateFormat Class
		SimpleDateFormat SDFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String str_date = SDFormat.format(date);

		// Java Program to Illustrate getTimeInstance() Method of DateFormat Class
		DateFormat DFormat = DateFormat.getTimeInstance();
		String str_time = DFormat.format(new Date());

        tDateVA = new JLabel(str_date);
		tDateVA.setFont(new Font("Arial", Font.PLAIN, 14));
		tDateVA.setSize(150, 20);
		tDateVA.setLocation(170, 60);
		topTix1.add(tDateVA);

        orderCreatedVA = new JLabel(str_time);
		orderCreatedVA.setFont(new Font("Arial", Font.PLAIN, 14));
		orderCreatedVA.setSize(150, 20);
		orderCreatedVA.setLocation(170, 80);
		topTix1.add(orderCreatedVA);

        priceVA = new JLabel("");
		priceVA.setFont(new Font("Arial", Font.PLAIN, 14));
		priceVA.setSize(150, 20);
		priceVA.setLocation(170, 100);
		topTix1.add(priceVA);

		serialAdultVal = new JLabel(" 0001");
		serialAdultVal.setFont(new Font("Serif", Font.PLAIN, 12));
		serialAdultVal.setSize(150, 20);
		serialAdultVal.setLocation(80, 135);
		topTix1.add(serialAdultVal);

        //--------------------- End content topTix1 ---------------------

        //--------------------- Content topTix2 -------------------------
        //Adult Ticket label
        txAdult2 = new JLabel("Adult Ticket");
        txAdult2.setFont(new Font("Arial", Font.BOLD, 15));
		txAdult2.setSize(150, 20);
		txAdult2.setLocation(45, 10);
		topTix2.add(txAdult2);

		//Pass typee label
        pType = new JLabel("Pass Type:");
        pType.setFont(new Font("Arial", Font.PLAIN, 10));
		pType.setSize(150, 20);
		pType.setLocation(60, 40);
		topTix2.add(pType);

		//Ticket category label
        tCatVA = new JLabel(TicketGenerator.customer1.getCategory());
		tCatVA.setFont(new Font("Arial", Font.BOLD, 12));
		tCatVA.setSize(150, 20);
		tCatVA.setLocation(55, 55);
		topTix2.add(tCatVA);

		//Date label
		tDate = new JLabel("Date:");
        tDate.setFont(new Font("Arial", Font.PLAIN, 10));
		tDate.setSize(150, 20);
		tDate.setLocation(75, 70);
		topTix2.add(tDate);

		//Value of ticket date
        tDateVA = new JLabel(str_date);
		tDateVA.setFont(new Font("Arial", Font.BOLD, 12));
		tDateVA.setSize(150, 20);
		tDateVA.setLocation(50, 85);
		topTix2.add(tDateVA);

		//Price label
		price = new JLabel("Price:");
        price.setFont(new Font("Arial", Font.PLAIN, 10));
		price.setSize(150, 20);
		price.setLocation(74, 100);
		topTix2.add(price);

		//Value for price
        priceVA2 = new JLabel("");
		priceVA2.setFont(new Font("Arial", Font.BOLD, 12));
		priceVA2.setSize(150, 20);
		priceVA2.setLocation(62, 115);
		topTix2.add(priceVA2);

		//Serial number label
		serialAdult = new JLabel("Serial No :");
		serialAdult.setFont(new Font("Serif", Font.PLAIN, 12));
		serialAdult.setSize(150, 20);
		serialAdult.setLocation(20, 135);
		topTix2.add(serialAdult);

		//Value of serial number
		serialAdultVal = new JLabel(" 0001");
		serialAdultVal.setFont(new Font("Serif", Font.PLAIN, 12));
		serialAdultVal.setSize(150, 20);
		serialAdultVal.setLocation(75, 135);
		topTix2.add(serialAdultVal);

		
        //--------------Label Quantity 1----------------
		//Quantity label
        lQty = new JLabel("Quantity:");
        lQty.setFont(new Font("Arial", Font.PLAIN, 11));
		lQty.setSize(150, 20);
		lQty.setLocation(15, 60);
		lQty.setForeground(new Color(255, 255, 255)); //white
		qty1.add(lQty);

		//Value of adult ticket quantity
		lQty1 = new JLabel(TicketGenerator.customer1.getNoOfAdult());
        lQty1.setFont(new Font("Arial", Font.PLAIN, 11));
		lQty1.setSize(150, 20);
		lQty1.setLocation(35, 75);
		lQty1.setForeground(new Color(255, 255, 255)); //white
		qty1.add(lQty1);


        //------------------- Bottom panel -----------------------
		//bottom panel
        bottom = new JPanel();
		bottom.setPreferredSize(new Dimension(700,230)); 
		bottom.setLayout(new BorderLayout());
		bottom.setBackground(new Color(56, 62, 61));//grey
		c.add(bottom, BorderLayout.SOUTH);

		//bottom1 panel (inside bottom panel)
        bottom1 = new JPanel();
		bottom1.setPreferredSize(new Dimension(700,40));
		bottom1.setBackground(new Color(56, 62, 61)); //grey
		bottom.add(bottom1, BorderLayout.SOUTH);

		//bottom2 panel (inside bottom panel)
		bottom2 = new JPanel();
		bottom2.setPreferredSize(new Dimension(400,180));
		bottom2.setBackground(new Color(56, 62, 61)); //grey
        bottom2.setLayout(new FlowLayout(FlowLayout.CENTER,3,5));
		bottom.add(bottom2, BorderLayout.NORTH);

		//bottomTix1 panel (inside bottom2 panel)
        bottomTix1 = new JPanel();
        bottomTix1.setPreferredSize(new Dimension(380,160));
        bottomTix1.setBackground(new Color(196, 241, 240)); //light blue
        bottomTix1.setLayout(null);
		bottomTix1.setBorder(new BevelBorder(BevelBorder.RAISED));
        bottom2.add(bottomTix1);
        
		//bottomTix2 panel (inside bottom2 panel)
        bottomTix2 = new JPanel();
        bottomTix2.setPreferredSize(new Dimension(180,160));
        bottomTix2.setBackground(new Color(196, 241, 240)); //light blue
        bottomTix2.setLayout(null);
		bottomTix2.setBorder(new BevelBorder(BevelBorder.RAISED));
        bottom2.add(bottomTix2);

		//qty2 panel (inside bottom2 panel)
        qty2 = new JPanel();
        qty2.setPreferredSize(new Dimension(70,160));
		qty2.setLayout(null);
        qty2.setBackground(new Color(56, 62, 61)); //grey
        bottom2.add(qty2);

		//------------------ Content of bottom panel ----------------------
		//Content of bottomTix1
		//Children ticket Label
		txChildren = new JLabel("Children Ticket");
        txChildren.setFont(new Font("Arial", Font.BOLD, 15));
		txChildren.setSize(150, 20);
		txChildren.setLocation(20, 10);
		bottomTix1.add(txChildren);

		//Ticket category label
		tCat = new JLabel("Ticket Category");
		tCat.setFont(new Font("Arial", Font.PLAIN, 14));
		tCat.setSize(150, 20);
		tCat.setLocation(20, 40);
		bottomTix1.add(tCat);

		//date label
        tDate = new JLabel("Date");
		tDate.setFont(new Font("Arial", Font.PLAIN, 14));
		tDate.setSize(150, 20);
		tDate.setLocation(20, 60);
		bottomTix1.add(tDate);

		//order created label
        orderCreated = new JLabel("Order Created");
		orderCreated.setFont(new Font("Arial", Font.PLAIN, 14));
		orderCreated.setSize(150, 20);
		orderCreated.setLocation(20, 80);
		bottomTix1.add(orderCreated);

		//price label
        price = new JLabel("Price");
		price.setFont(new Font("Arial", Font.PLAIN, 14));
		price.setSize(150, 20);
		price.setLocation(20, 100);
		bottomTix1.add(price);

		//serial number label
		serialChild = new JLabel("Serial No :");
		serialChild.setFont(new Font("Serif", Font.PLAIN, 12));
		serialChild.setSize(150, 20);
		serialChild.setLocation(20, 135);
		bottomTix1.add(serialChild);

		//colon (:) label
        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(160, 100);
		bottomTix1.add(colon);

        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(160, 80);
		bottomTix1.add(colon);

        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(160, 60);
		bottomTix1.add(colon);

        colon = new JLabel(": ");
		colon.setFont(new Font("Arial", Font.PLAIN, 14));
		colon.setSize(150, 20);
		colon.setLocation(160, 40);
		bottomTix1.add(colon);

		//Value of ticket category for children
		tCatVC = new JLabel(TicketGenerator.customer1.getCategory());
		tCatVC.setFont(new Font("Arial", Font.PLAIN, 14));
		tCatVC.setSize(150, 20);
		tCatVC.setLocation(170, 40);
		bottomTix1.add(tCatVC);

		//Value of date for children
        tDateVC = new JLabel(str_date);
		tDateVC.setFont(new Font("Arial", Font.PLAIN, 14));
		tDateVC.setSize(150, 20);
		tDateVC.setLocation(170, 60);
		bottomTix1.add(tDateVC);

		//Value of order created for children
        orderCreatedVC = new JLabel(str_time);
		orderCreatedVC.setFont(new Font("Arial", Font.PLAIN, 14));
		orderCreatedVC.setSize(150, 20);
		orderCreatedVC.setLocation(170, 80);
		bottomTix1.add(orderCreatedVC);

		//Value of price for children
        priceVC = new JLabel("");
		priceVC.setFont(new Font("Arial", Font.PLAIN, 14));
		priceVC.setSize(150, 20);
		priceVC.setLocation(170, 100);
		bottomTix1.add(priceVC);

		//Value of serial number for children
		serialChildVal = new JLabel(" 0005");
		serialChildVal.setFont(new Font("Serif", Font.PLAIN, 12));
		serialChildVal.setSize(150, 20);
		serialChildVal.setLocation(80, 135);
		bottomTix1.add(serialChildVal);

		//Content bottomTix2
        //Children ticket Label
		txChildren2 = new JLabel("Children Ticket");
        txChildren2.setFont(new Font("Arial", Font.BOLD, 15));
		txChildren2.setSize(150, 20);
		txChildren2.setLocation(30, 10);
		bottomTix2.add(txChildren2);

		//Pass type label
        pType = new JLabel("Pass Type:");
        pType.setFont(new Font("Arial", Font.PLAIN, 10));
		pType.setSize(150, 20);
		pType.setLocation(60, 40);
		bottomTix2.add(pType);

		//Value of Ticket category for children
        tCatVC = new JLabel(TicketGenerator.customer1.getCategory());
		tCatVC.setFont(new Font("Arial", Font.BOLD, 12));
		tCatVC.setSize(150, 20);
		tCatVC.setLocation(55, 55);
		bottomTix2.add(tCatVC);

		//date label
		tDate = new JLabel("Date:");
        tDate.setFont(new Font("Arial", Font.PLAIN, 10));
		tDate.setSize(150, 20);
		tDate.setLocation(75, 70);
		bottomTix2.add(tDate);

		//Value of date for children
        tDateVC = new JLabel(str_date);
		tDateVC.setFont(new Font("Arial", Font.BOLD, 12));
		tDateVC.setSize(150, 20);
		tDateVC.setLocation(50, 85);
		bottomTix2.add(tDateVC);

		//price label
		price = new JLabel("Price:");
        price.setFont(new Font("Arial", Font.PLAIN, 10));
		price.setSize(150, 20);
		price.setLocation(74, 100);
		bottomTix2.add(price);

		//Value of price for children
        priceVC2 = new JLabel("");
		priceVC2.setFont(new Font("Arial", Font.BOLD, 12));
		priceVC2.setSize(150, 20);
		priceVC2.setLocation(62, 115);
		bottomTix2.add(priceVC2);

		//Serial number label
		serialChild = new JLabel("Serial No :");
		serialChild.setFont(new Font("Serif", Font.PLAIN, 12));
		serialChild.setSize(150, 20);
		serialChild.setLocation(20, 135);
		bottomTix2.add(serialChild);

		//Value of serial number for children
		serialChildVal = new JLabel(" 0005");
		serialChildVal.setFont(new Font("Serif", Font.PLAIN, 12));
		serialChildVal.setSize(150, 20);
		serialChildVal.setLocation(75, 135);
		bottomTix2.add(serialChildVal);

		//Label Quantity 2
        lQty = new JLabel("Quantity:");
        lQty.setFont(new Font("Arial", Font.PLAIN, 11));
		lQty.setSize(150, 20);
		lQty.setLocation(15, 60);
		lQty.setForeground(new Color(255, 255, 255)); //white
		qty2.add(lQty);

		//Value of quantity of child ticket
		lQty2 = new JLabel(TicketGenerator.customer1.getNoOfChild());
        lQty2.setFont(new Font("Arial", Font.PLAIN, 11));
		lQty2.setSize(150, 20);
		lQty2.setLocation(35, 75);
		lQty2.setForeground(new Color(255, 255, 255)); //white
		qty2.add(lQty2);

		//Button print
		print = new JButton("Confirm and Print");
		print.setFont(new Font("Arial", Font.PLAIN, 15));
		print.setPreferredSize(new Dimension(170,28));
		print.setLocation(330, 320);
		print.setBackground(new Color(8, 210, 239)); //biru button
		print.setBorder(new BevelBorder(BevelBorder.RAISED));
		print.addActionListener(this);
		bottom1.add(print, BorderLayout.CENTER);
    }

	public void actionPerformed(ActionEvent e) {
		// Show message that ticket printed successfully
		JOptionPane.showMessageDialog(null, "Tickets printed successfully");
		// Close current frame then open TicketSuccess frame
		setVisible(false);
		new TicketSuccess();
	}

}





