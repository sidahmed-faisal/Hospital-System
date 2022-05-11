import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class Delete extends JFrame{
	public Delete(){
    super("Delete");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(735, 502);
	setLocationRelativeTo(null);
	setVisible(true);
	setResizable(false);
	JLabel wall = new JLabel();
    setLayout(null);
    JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
    JButton x,de ;
    final JLabel L1,L2,L3,L4;
    final JTextField T1,T2;

    L4= new JLabel("Fill the informations below:");
    L4.setFont(new java.awt.Font("Arial", 3, 20));
	add(L4);
	L4.setBounds(50,30,270,100);
//
    L1= new JLabel("ID:");
    L1.setFont(new java.awt.Font("Arial", 1, 20));
	add(L1);

    L1.setBounds(120,120,200,30);
    T1 = new JTextField(4);
	add(T1);
    T1.setBounds(200,120,150,30);
    de = new JButton("Delete:");


	 de.setFont(new java.awt.Font("Arial", 1, 20));
	 add(de);
     de.setBounds(120,350,200,30);
//
    JLabel  mail;
    mail = new JLabel("sidahmedfaisal.sf");
    mail.setFont(new java.awt.Font("Arial", 1, 15));
    mail.setIcon(new ImageIcon(((new ImageIcon("google-plus.png")).getImage()).getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH)));
	mail.setOpaque(false);
	//add(mail);
    mail.setBounds(300,420,200,50);
     de.addActionListener( new ActionListener()
	 		  	     {
	 		  	        // process 2Button event
	 		  	       public void actionPerformed( ActionEvent event )
	 		  	        {
	    try{
	      	// Load the JDBC driver for Access database
	 String i = T1.getText();
     System.out.println(i);
	      	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	      	  System.out.println("Driver loaded");

	 		// Establish a connection
	         Connection  connection = DriverManager.getConnection("jdbc:odbc:admin");
	         System.out.println("Database connected");
	         Statement statement = connection.createStatement( );

	      statement.executeUpdate("DELETE  FROM  admin WHERE  ID='"+i+"'");
T1.setText("");
	      ResultSet  resultSet =
		       statement.executeQuery("select * from admin");
		       String  output = "ID \t Name \t Gender \t Department \t Address \t Phone ";

		        // Processing ResultSet
		  	   while ( resultSet.next( ) ){
        output += "\n"+ resultSet.getString(1) + " \t" +resultSet.getString(2)+" \t"+resultSet.getString(3)+" \t"+resultSet.getString(4)+" \t"+resultSet.getString(5)+" \t"+resultSet.getString(6);
      } //end of while
 JOptionPane.showMessageDialog(null, "Record Deleted Succesfully. \n "+output,

                        "Record Updated",JOptionPane.INFORMATION_MESSAGE);

//            clearControls();

        }catch(Exception e)

        {

            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",

                        JOptionPane.ERROR_MESSAGE);

        }


	 		  	        }
	 		  	    }
	           ); // end call to addActionListener

                x = new JButton(new ImageIcon(((new ImageIcon("back.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
			    x.setContentAreaFilled(false);
			    x.setBorderPainted(false);
			    x.setOpaque(false);
			  	x.setFont(new java.awt.Font("Arial", 1, 20));
			  	x.setFont(new java.awt.Font("Arial", 0, 12));
			  	x.setLocation(1,430);
			  	x.setSize(50,30);
	//b1.setForeground(new java.awt.Color(25, 157, 171));
			  	add(x);
			  	  x.addActionListener( new ActionListener()
			  	             {
			  	                // process leftButton event
			  	               public void actionPerformed( ActionEvent event )
			  	                {
			  setVisible(false);
			  new admin().setVisible(true);
			  	                }
			  	            }
		            ); // end call to addActionListener
//
		                JButton e = new JButton(new ImageIcon(((new ImageIcon("cancel.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
					    e.setContentAreaFilled(false);
					   	e.setBorderPainted(false);
					    e.setOpaque(false);
					    //
						e.setFont(new java.awt.Font("Arial", 1, 20));

						e.setFont(new java.awt.Font("Arial", 0, 12));
						e.setLocation(668,430);
						e.setSize(50,30);
						add(e);
						  e.addActionListener( new ActionListener()
						             {
						                // process leftButton event
						               public void actionPerformed( ActionEvent event )
						                {
					System.out.println("Thanks for visiting us");
					System.exit(0);
						                }
						            }
					          ); // end call to addActionListener
//
wall.setIcon(new javax.swing.ImageIcon("0abc1d0820e83eb30bd4b25266cdf79f.jpg")); // NOI18N

		  add(wall);
wall.setBounds(0, 0,735, 502);

}
public static void main(String[]args){
	Delete d = new Delete();
	}
}