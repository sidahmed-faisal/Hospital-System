
import java.awt.event.*;
import  java.awt.*;
import javax.swing.*;
public class Hospital extends JFrame {
public Hospital() {
super("Hospital");
setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(735, 502);
setLocationRelativeTo(null);
setResizable(false);
setVisible(true);
JTextField newItemField;
JList itemsList;
JButton b1;
JButton b2;
JLabel  wall   = new JLabel();
JLabel  admin  = new JLabel("admin");
JLabel  user   = new JLabel("user");

setLayout(null);

JLabel logo = new JLabel();
logo.setFont(new java.awt.Font("Arial", 1, 15));
logo.setIcon(new ImageIcon(((new ImageIcon("icons8-hospital-3-50.png")).getImage()).getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH)));
logo.setOpaque(false);
add(logo);
logo.setBounds(335,1,150,70);
//The Add button
b1 = new JButton(new ImageIcon(((new ImageIcon("icons8-therapy-50.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
b1.setContentAreaFilled(false);
b1.setBorderPainted(false);
b1.setOpaque(false);
b1.setLocation(120,250);
b1.setSize(100,65);
add(user);
user.setBounds(160,300,100,30);
add(b1);
          b1.addActionListener( new ActionListener()
             {
                // process leftButton event
               public void actionPerformed( ActionEvent event )
                {
setVisible(false);
user x = new user();

                }
            }
          ); // end call to addActionListener


b2 = new JButton(new ImageIcon(((new ImageIcon("icons8-doctor-male-50.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
b2.setContentAreaFilled(false);
b2.setBorderPainted(false);
b2.setOpaque(false);
b2.setLocation(120,150);
b2.setSize(100,65);
add(admin);
admin.setBounds(152,200,100,30);
add(b2);

  b2.addActionListener( new ActionListener()
             {
                // process leftButton event
               public void actionPerformed( ActionEvent event )
                {
setVisible(false);
admin x = new admin();                }
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
//
   JLabel mail = new JLabel("sidahmedfaisal.sf");
    mail.setFont(new java.awt.Font("Arial", 1, 15));
    mail.setIcon(new ImageIcon(((new ImageIcon("google-plus.png")).getImage()).getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH)));
	mail.setOpaque(false);
	//add(mail);
    mail.setBounds(300,420,200,50);
//
          wall.setIcon(new javax.swing.ImageIcon("f.png")); // NOI18N

		  add(wall);
wall.setBounds(0, 0,735, 502);
}

public static void main(String[] args) {

Hospital f  = new Hospital();
f.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}

