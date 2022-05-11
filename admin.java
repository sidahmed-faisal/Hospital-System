import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class admin extends JFrame{
private	JButton b1;
private	JButton b2;
private	JButton b3;
private	JButton b4;
private	JButton b5,e;
private JLabel  jLabel2 = new JLabel();
private JLabel  mail;
	public admin(){
	super("Admin");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(735, 502);
	setLocationRelativeTo(null);
	setVisible(true);
	setResizable(true);
	setLayout(null);

    b1 = new JButton(new ImageIcon(((new ImageIcon("back.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
    b1.setContentAreaFilled(false);
   	b1.setBorderPainted(false);
    b1.setOpaque(false);
	b1.setFont(new java.awt.Font("Arial", 1, 20));

	b1.setFont(new java.awt.Font("Arial", 0, 12));
	b1.setLocation(1,430);
	b1.setSize(50,30);
	b1.setForeground(new java.awt.Color(25, 157, 171));
	add(b1);
	  b1.addActionListener( new ActionListener()
	             {
	                // process leftButton event
	               public void actionPerformed( ActionEvent event )
	                {
setVisible(false);
//Hospital x = new Hospital();
new Hospital().setVisible(true);
	                }
	            }
          ); // end call to addActionListener
    e = new JButton(new ImageIcon(((new ImageIcon("cancel.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
    e.setContentAreaFilled(false);
   	e.setBorderPainted(false);
    e.setOpaque(false);
	e.setFont(new java.awt.Font("Arial", 1, 20));

	e.setFont(new java.awt.Font("Arial", 0, 12));
	e.setLocation(668,430);
	e.setSize(50,30);
	e.setForeground(new java.awt.Color(25, 157, 171));
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
    mail = new JLabel("sidahmedfaisal.sf");
    mail.setFont(new java.awt.Font("Arial", 1, 15));
    mail.setIcon(new ImageIcon(((new ImageIcon("google-plus.png")).getImage()).getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH)));
	mail.setOpaque(false);
	//add(mail);
    mail.setBounds(300,420,200,50);
//
    b2 = new JButton("Insert",new ImageIcon(((new ImageIcon("prescription.png")).getImage()).getScaledInstance(56, 56, java.awt.Image.SCALE_SMOOTH)));
    b2.setContentAreaFilled(false);
    b2.setBorderPainted(false);
    b2.setOpaque(false);
	b2.setLocation(270,40);
	b2.setSize(200,200);
    b1.setFont(new java.awt.Font("Arial", 1, 15));
	add(b2);
 b2.addActionListener( new ActionListener()
	             {
	                // process 2Button event
	               public void actionPerformed( ActionEvent event )
	                {
setVisible(false);

Insert i = new Insert();
	                }
	            }
          ); // end call to addActionListener
    b3 = new JButton("Delete",new ImageIcon(((new ImageIcon("fired.png")).getImage()).getScaledInstance(56, 56, java.awt.Image.SCALE_SMOOTH)));
    b3.setFont(new java.awt.Font("Arial", 1, 15));
    b3.setContentAreaFilled(false);
   	b3.setBorderPainted(false);
    b3.setOpaque(false);
    b3.setLocation(350,140);
    b3.setSize(200,200);
	add(b3);
b3.addActionListener( new ActionListener()
		  	     {
		  	        // process 2Button event
		  	       public void actionPerformed( ActionEvent event )
		  	        {
setVisible(false);
Delete d = new Delete();

		  	        }
		  	    }
          ); // end call to addActionListener

    b4 = new JButton("Update",new ImageIcon(((new ImageIcon("exchange.png")).getImage()).getScaledInstance(56, 56, java.awt.Image.SCALE_SMOOTH)));
    b4.setFont(new java.awt.Font("Arial", 1, 15));
    b4.setContentAreaFilled(false);
   	b4.setBorderPainted(false);
    b4.setOpaque(false);
    b4.setLocation(300,240);
    b4.setSize(200,200);
	add(b4);
b4.addActionListener( new ActionListener()
		  	     {
		  	        // process 2Button event
		  	       public void actionPerformed( ActionEvent event )
		  	        {
setVisible(false);
update d = new update();
		  	        }
		  	    }
          ); // end call to addActionListener
//View opreation
    b5 = new JButton("View",new ImageIcon(((new ImageIcon("smartphone.png")).getImage()).getScaledInstance(56, 56, java.awt.Image.SCALE_SMOOTH)));
    b5.setFont(new java.awt.Font("Arial", 1, 15));
    b5.setContentAreaFilled(false);
	b5.setBorderPainted(false);
    b5.setOpaque(false);
    b5.setLocation(170,170);
    b5.setSize(230,180);
	add(b5);
b5.addActionListener( new ActionListener()
		  	     {
		  	        // process 2Button event
		  	       public void actionPerformed( ActionEvent event )
		  	        {
   try{
     	// Load the JDBC driver for Access database
     	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     	  System.out.println("Driver loaded");

		// Establish a connection
        Connection  connection = DriverManager.getConnection("jdbc:odbc:admin");
        System.out.println("Database connected");

		// Create a statement
        Statement statement = connection.createStatement( );

ResultSet  resultSet =
     statement.executeQuery("select * from admin");
     String  output = "ID \t Name \t Gender \t Department \t Address \t Phone ";

      // Processing ResultSet
	   while ( resultSet.next( ) ){
        output += "\n"+ resultSet.getString(1) + " \t" +                  	resultSet.getString(2)+" \t"+resultSet.getString(3)+" \t"+resultSet.getString(4)+" \t"+resultSet.getString(5)+" \t"+resultSet.getString(6);
      } //end of while
      JTextArea textArea = new JTextArea(output);
      textArea.setOpaque(true);
	JOptionPane.showMessageDialog( null, textArea , "Display Doctors informations", JOptionPane.INFORMATION_MESSAGE );

connection.close( );
 } //end of try
catch (SQLException  Sql){
  JOptionPane.showMessageDialog( null,Sql.getMessage(), "Database Error",JOptionPane.ERROR_MESSAGE );
	 System.exit( 1 );
 }
 catch(ClassNotFoundException  e){
  JOptionPane.showMessageDialog( null,"CLASS NOT FOUND", "Error CLASS NOT FOUND",JOptionPane.ERROR_MESSAGE );
	System.exit( 1 ); }

		  	        }
		  	    }
          ); // end call to addActionListener

          jLabel2.setIcon(new javax.swing.ImageIcon("u.png")); // NOI18N
		   add(jLabel2);
 jLabel2.setBounds(0, 0,735, 502);
	}

	public static void main(String[]args){
		new admin();
		}
	}