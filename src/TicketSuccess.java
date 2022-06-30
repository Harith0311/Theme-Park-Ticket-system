import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

class TicketSuccess extends JFrame implements ActionListener{

    private Container c;		//Container of JFrame

    private JLabel thank;		//Thank you label
    private JLabel take;		//Take another ticket message
    private JLabel another;		//Press button command
    
    private JButton buy;		//Buy ticket button

    public TicketSuccess(){
		//---------- Set up JFrame title ---------------
        setTitle("Theme Park Ticket System");
		setBounds(300, 90, 800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
        setVisible(true);

        c = getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(41, 41, 41)); //grey

		//Display "Thank you!" message
        thank = new JLabel("Thank you!");
        thank.setFont(new Font("Arial", Font.BOLD, 35));
		thank.setSize(300, 40);
		thank.setLocation(310, 150);
		thank.setForeground(new Color(140, 220, 222)); //blue
		c.add(thank);

		//Display "Please take your ticket" message
        take = new JLabel("Please take your ticket");
        take.setFont(new Font("Arial", Font.PLAIN, 18));
		take.setSize(300, 30);
		take.setLocation(310, 190);
		take.setForeground(new Color(255, 255, 255)); //white
		c.add(take);

		//Display "Press the button to buy another ticket" message
        another = new JLabel("Press the button to buy another ticket");
        another.setFont(new Font("Arial", Font.BOLD, 18));
		another.setSize(400, 30);
		another.setLocation(225, 320);
		another.setForeground(new Color(255, 255, 255)); //white
		c.add(another);

		//Buy ticket button
        buy = new JButton("Buy Ticket");
		buy.setFont(new Font("Arial", Font.PLAIN, 15));
		buy.setSize(100, 30);
		buy.setLocation(350, 380);
		buy.setBackground(new Color(8, 210, 239)); //biru button
		buy.setBorder(new BevelBorder(BevelBorder.RAISED));
		buy.addActionListener(this);
		c.add(buy);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// Close current frame then open TicketGenerator frame
		setVisible(false);
		new TicketGenerator();
	}
}
