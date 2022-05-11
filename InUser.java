import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class InUser extends JFrame{
	public InUser(){
    super("InUser");
	JButton b1;
    JButton b2;
    JButton b3;
    JButton T;
    JButton b5;
    JButton x ;
    JButton in,ba;
    final JLabel L1,L2,L3;
    final JTextField T1,T2;
    final JRadioButton R1,R2;
    final JTextField ad,ph;
    final JLabel a,p,B;
    JComboBox   combo;
    String  names[ ] = { "O-positive", "O-negative", "A-positive", "A-negative" ,"B-positive", "B-negative " };
    //f.setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(850, 567);
	setLocationRelativeTo(null);
	setVisible(true);
	setResizable(false);
    JLabel wall = new JLabel();
    setLayout(null);
     JLabel h= new JLabel();
     h.setIcon(new ImageIcon(((new ImageIcon("medical-records.png")).getImage()).getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH)));
     h.setOpaque(false);
     h.setFont(new java.awt.Font("Arial", 3, 20));
	 add(h);
	 h.setBounds(390,140,270,100);
//
     L1= new JLabel("ID:");
     L1.setFont(new java.awt.Font("Arial", 1, 20));
	 add(L1);

     L1.setBounds(240,220,200,30);
     T1 = new JTextField(10);
	 add(T1);
     T1.setBounds(320,220,100,30);
//
     L2= new JLabel("NAME:");
     L2.setFont(new java.awt.Font("Arial", 1, 20));
	 add(L2);

     L2.setBounds(240,270,200,30);
     T2 = new JTextField(20);
	 add(T2);
     T2.setBounds(320,270,100,30);
//
     L3= new JLabel("Gender:");
     L3.setIcon(new ImageIcon(((new ImageIcon("genders.png")).getImage()).getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH)));
	 L3.setOpaque(false);
     L3.setFont(new java.awt.Font("Arial", 1, 17));
	 add(L3);
     L3.setBounds(240,320,200,50);


	 R1=new JRadioButton("Male",false);
	 add(R1);
     R1.setBounds(260,370,100,30);

	 R2=new JRadioButton("Female",false);
	 add(R2);
	 R2.setBounds(370,370,100,30);
//
	 a= new JLabel("Address:");
	 a.setFont(new java.awt.Font("Arial", 1, 18));
	 add(a);

	 a.setBounds(240,420,200,30);
	 ad = new JTextField(20);
	 add(ad);
     ad.setBounds(320,420,100,30);
//
 	 p= new JLabel("Phone:");
	 p.setFont(new java.awt.Font("Arial", 1, 18));
	 add(p);

	 p.setBounds(240,460,200,30);
	 ph = new JTextField(20);
	 add(ph);
     ph.setBounds(320,460,100,30);
//
     combo = new JComboBox( names );
     add(combo);
     combo.setBounds(480,250,100,20);
     JLabel t = new JLabel("Blood type:");
     t.setIcon(new ImageIcon(((new ImageIcon("blood-sample.png")).getImage()).getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH)));
     t.setOpaque(false);
     t.setFont(new java.awt.Font("Arial", 1,15));
     add(t);
     t.setBounds(450,180,200,100);
	 String blood =names[combo.getSelectedIndex()];
	 B = new JLabel(blood);

//
	 in = new JButton("Insert",new ImageIcon(((new ImageIcon("wheelchair.png")).getImage()).getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH)));
	 in.setContentAreaFilled(false);
	 in.setBorderPainted(false);
	 in.setOpaque(false);
	 in.setFont(new java.awt.Font("Arial", 1, 20));
	 add(in);
     in.setBounds(400,420,200,70);

     in.addActionListener( new ActionListener()
	 		  	     {
	 		  	        // process 2Button event
	 		  	       public void actionPerformed( ActionEvent event )
	 		  	        {
	    try{
	      	// Load the JDBC driver for Access database

String r="";
	 if(R1.isSelected()==true)
	  r = R1.getText();
	 else if(R2.isSelected()==true)
	  r = R2.getText();

     //System.out.println(r);
	 String i  = T1.getText();
     String n  = T2.getText();
     String A  = ad.getText();
     String P  = ph.getText();
     String b  =  B.getText();


     //int IDD= Integer.parseInt(i);
     //int PHH =Integer.parseInt(P);

     System.out.println(r);
	      	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	      	  System.out.println("Driver loaded");

	 		// Establish a connection
	         Connection  connection = DriverManager.getConnection("jdbc:odbc:admin");
	         System.out.println("Database connected");
	         Statement statement = connection.createStatement( );

	      statement.executeUpdate("INSERT INTO user(ID,Name,Gender,Blood,address,phone) Values('"+i+"','"+n+"','"+r+"','"+b+"','"+A+"','"+P+"')");
	 T1.setText("");
	 T2.setText("");
	 ad.setText("");
	 ph.setText("");

 JOptionPane.showMessageDialog(null, "Record Update Succesfully.",

                        "Record Updated",JOptionPane.INFORMATION_MESSAGE);

//            clearControls();

        }catch(Exception e)

        {

            JOptionPane.showMessageDialog(null,"This ID is already exist try again or you may didn't fill correctly","Error",

                        JOptionPane.ERROR_MESSAGE);

        }



	 	/*JOptionPane.showMessageDialog( null, null,"Display Doctors informations", JOptionPane.INFORMATION_MESSAGE );

	 connection.close( );
	  } //end of try
	 catch (SQLException  Sql){
	   JOptionPane.showMessageDialog( null,Sql.getMessage(), "Database Error",JOptionPane.ERROR_MESSAGE );
	 	// System.exit( 1 );
	  }
	  catch(ClassNotFoundException  e){
	   JOptionPane.showMessageDialog( null,"CLASS NOT FOUND", "Error CLASS NOT FOUND",JOptionPane.ERROR_MESSAGE );
	 	System.exit( 1 ); }
**/
	 		  	        }
	 		  	    }
	           ); // end call to addActionListener



//

            x = new JButton(new ImageIcon(((new ImageIcon("back.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
	        x.setContentAreaFilled(false);
		    x.setBorderPainted(false);
		    x.setOpaque(false);
			x.setFont(new java.awt.Font("Arial", 1, 20));
		    x.setFont(new java.awt.Font("Arial", 0, 12));
		  	x.setLocation(1,495);
		  	x.setSize(50,30);
		  	x.setForeground(new java.awt.Color(25, 157, 171));
		  	add(x);
		  	  x.addActionListener( new ActionListener()
		  	             {
		  	                // process leftButton event
		  	               public void actionPerformed( ActionEvent event )
		  	                {
		  setVisible(false);
		  //Hospital x = new Hospital();
		  new user().setVisible(true);
		  	                }
		  	            }
		            ); // end call to addActionListener
    JButton e = new JButton(new ImageIcon(((new ImageIcon("cancel.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
    e.setContentAreaFilled(false);
   	e.setBorderPainted(false);
    e.setOpaque(false);
    //
	e.setFont(new java.awt.Font("Arial", 1, 20));

	e.setFont(new java.awt.Font("Arial", 0, 12));
	e.setLocation(785,495);
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
          ); // end call to addActionListner
 JLabel mail = new JLabel("sidahmedfaisal.sf");
	mail.setFont(new java.awt.Font("Arial", 1, 15));
    mail.setIcon(new ImageIcon(((new ImageIcon("google-plus.png")).getImage()).getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH)));
    mail.setOpaque(false);
    //add(mail);
    mail.setBounds(350,483,200,50);

 wall.setIcon(new javax.swing.ImageIcon("171.jpg")); // NOI18N

		  add(wall);
wall.setBounds(0, 0,850,567);

	}
	public static void main(String[]args){
		new InUser();
		}
	}