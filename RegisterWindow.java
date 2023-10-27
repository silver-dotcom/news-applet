import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class RegisterWindow extends JFrame implements ActionListener
{
	 String c="";
	 String d="";
	 String h="";
	 JLabel name, phone, newpasswd, rg, extra;
	 JButton sub1;
	 JTextField user, mob, newpass;
	 Font font;
	 JFrame f1;

	 RegisterWindow()
	 {
		 //main frame
		  f1=new JFrame("Registration");
		  f1.setIconImage(Toolkit.getDefaultToolkit().getImage("n.jpg"));
		  f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		  font = new Font("TimesRoman", Font.PLAIN, 24);

		  extra=new JLabel("Welcome!", JLabel.CENTER);
		  extra.setFont(new Font("TimesRoman", Font.BOLD, 60));
		  extra.setBounds(0,50,685,80);
		  extra.setBackground(new Color(255,0,0));
		  extra.setForeground(new Color(255,255,255));
		  extra.setOpaque(true);
		  f1.add(extra);

		  //registration label
 		  rg=new JLabel("REGISTRATION", JLabel.CENTER);
 		  rg.setBounds(0,150,685,60);
		  rg.setFont(new Font("TimesRoman", Font.BOLD, 34));
		  rg.setBackground(new Color(255,0,0));
		  rg.setForeground(new Color(255,255,255));
		  rg.setOpaque(true);
		  f1.add(rg);

  		  //name label
   		  name=new JLabel("NAME");
  		  name.setBounds(150,250,200,30);
		  name.setFont(font);
		  f1.add(name);

		  //phone label
		  phone=new JLabel("MOBILE NO.");
		  phone.setBounds(150,300,200,30);
		  phone.setFont(font);
		  f1.add(phone);

		  //new password label
		  newpasswd=new JLabel("NEW PASSWORD");
		  newpasswd.setBounds(150,350,200,30);
		  newpasswd.setFont(font);
		  f1.add(newpasswd);

		  //Register button
		  sub1=new JButton("Register");
		  sub1.setBounds(250,450,175,30);
		  sub1.setFont(new Font("TimesRoman", Font.BOLD, 24));
		  f1.add(sub1);

		  //name textfield
		  user=new JTextField();
		  user.setBounds(350,250,200,30);
   		  user.setFont(font);
		  f1.add(user); 

		  //mob textfield
		  mob=new JTextField();
		  mob.setBounds(350,300,200,30);
		  mob.setFont(font);
		  f1.add(mob);

		  //new password textfield
		  newpass=new JTextField();
		  newpass.setBounds(350,350,200,30);
		  newpass.setFont(font);
		  f1.add(newpass);

		  f1.setLayout(null);
		  f1.setSize(700,600);
		  f1.setLocationRelativeTo(null);
		  f1.setVisible(true);

		  sub1.addActionListener(this);

	 }
	 
	 public void actionPerformed(ActionEvent e)
	 {
		 if(e.getSource()==sub1)
		  {
			   c=user.getText();
			   d=mob.getText();
			   h=newpass.getText();
			   if(!Pattern.matches("[a-zA-Z]+",c))
			   {
				    JOptionPane.showMessageDialog(f1, "Please enter valid name","Alert",JOptionPane.WARNING_MESSAGE);
			   }
			   else if(!Pattern.matches("[0-9]+",d))
			   {
				    JOptionPane.showMessageDialog(f1, "Please enter valid mobile number","Alert",JOptionPane.WARNING_MESSAGE);
			   }
			   else if(!Pattern.matches("[a-zA-Z0-9]+",h))
			   {
				    JOptionPane.showMessageDialog(f1, "Please enter valid password","Alert",JOptionPane.WARNING_MESSAGE);
			   }
			   else
			   {
				    JOptionPane.showMessageDialog(f1,"Registered successfully! Thank you for registering!","Successful Registration",JOptionPane.INFORMATION_MESSAGE);
				    f1.dispose();
 			   }
		  }
	 }
}