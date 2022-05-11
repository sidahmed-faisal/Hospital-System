import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class Insert extends JFrame{
	public Insert(){
    super("Insert");
	JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton x ;
    JButton in,ba;
    JComboBox   combo;
    String  names[ ] = { "Anatomy", "Cancer Biology", "Emergency", "Medicine Research" };
    final JLabel L1,L2,L3,L4;
    final JTextField T1,T2;
    final JRadioButton R1,R2;
    final JTextField ad,ph;
    final JLabel a,p,de,D;

    //f.setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(735, 502);
	setLocationRelativeTo(null);
	setVisible(true);
	setResizable(false);
    JLabel wall = new JLabel();
    setLayout(null);
     L4= new JLabel("Fill the informations below:");
     L4.setFont(new java.awt.Font("Arial", 3, 20));
	 add(L4);
	 L4.setBounds(30,1,270,100);
//
     L1= new JLabel("ID:");
     L1.setFont(new java.awt.Font("Arial", 1, 20));
	 add(L1);

     L1.setBounds(140,100,200,30);
     T1 = new JTextField(10);
	 add(T1);
     T1.setBounds(220,100,100,30);
//
     L2= new JLabel("NAME:");
     L2.setFont(new java.awt.Font("Arial", 1, 20));
	 add(L2);

     L2.setBounds(140,152,200,30);
     T2 = new JTextField(20);
	 add(T2);
     T2.setBounds(220,150,100,30);
//
     L3= new JLabel("Gender");
     L3.setIcon(new ImageIcon(((new ImageIcon("icons8-gender-50.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
     L3.setFont(new java.awt.Font("Arial", 1, 15));
     L3.setOpaque(false);
     add(L3);
     L3.setBounds(135,220,200,30);
//

	 R1=new JRadioButton("Male",false);
	 add(R1);
     R1.setBounds(200,270,100,30);

	 R2=new JRadioButton("Female",false);
	 add(R2);
	 R2.setBounds(350,270,100,30);
//
	 a= new JLabel("Address:");
	 a.setFont(new java.awt.Font("Arial", 1, 18));
	 add(a);

	 a.setBounds(140,320,200,30);
	 ad = new JTextField(4);
	 add(ad);
     ad.setBounds(220,320,100,30);
//
 	 p= new JLabel("Phone:");
	 p.setFont(new java.awt.Font("Arial", 1, 18));
	 add(p);

	 p.setBounds(140,370,200,30);
	 ph = new JTextField(20);
	 add(ph);
     ph.setBounds(220,370,100,30);
//
     combo = new JComboBox( names );
     add(combo);
     combo.setBounds(430,100,200,30);
     de = new JLabel("Department:");
     de.setFont(new java.awt.Font("Arial", 1, 20));
     add(de);
     de.setBounds(430,20,200,100);
	 String dep =names[combo.getSelectedIndex()];
	 D = new JLabel(dep);

//
	 in = new JButton("Insert",new ImageIcon(((new ImageIcon("icons8-hospital-50 (1).png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
     in.setContentAreaFilled(false);
   	 in.setBorderPainted(false);
     in.setOpaque(false);
	 in.setFont(new java.awt.Font("Arial", 1, 20));
	 add(in);
     in.setBounds(300,340,200,50);
//
     JLabel  mail;
      mail = new JLabel("sidahmedfaisal.sf");
      mail.setFont(new java.awt.Font("Arial", 1, 15));
      mail.setIcon(new ImageIcon(((new ImageIcon("google-plus.png")).getImage()).getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH)));
	  mail.setOpaque(false);
	  //add(mail);
      mail.setBounds(300,420,200,50);
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
     String d  =  D.getText();

     //int IDD= Integer.parseInt(i);
     //int PHH =Integer.parseInt(P);

     System.out.println(r);
	      	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	      	  System.out.println("Driver loaded");

	 		// Establish a connection
	         Connection  connection = DriverManager.getConnection("jdbc:odbc:admin");
	         System.out.println("Database connected");
	         Statement statement = connection.createStatement( );

	      statement.executeUpdate("INSERT INTO admin(ID,Name,Gender,Department,address,phone) Values('"+i+"','"+n+"' ,'"+r+"','"+d+"','"+A+"','"+P+"')");
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
		  //Hospital x = new Hospital();
		  new admin().setVisible(true);
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
					          ); // end call to addActionListen

 wall.setIcon(new javax.swing.ImageIcon("0abc1d0820e83eb30bd4b25266cdf79f.jpg")); // NOI18N

		  add(wall);
wall.setBounds(0, 0,735, 502);

	}
	public static void main(String[]args){
		new Insert();
		}
	}