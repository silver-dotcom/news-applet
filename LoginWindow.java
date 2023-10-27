import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.JOptionPane;


public class LoginWindow extends JFrame implements ActionListener
{
 	 String msg="";
 	 String a="";
	 String b="";
	 JLabel lg, uname, passwd, extra, extra2;
	 JButton reg;
	 JButton sub;
	 JTextField us, pwd;
	 JFrame f;
	 Font font;
	 
	 LoginWindow()
	 {
		  //main frame
		  f=new JFrame("Login");
		  f.setIconImage(Toolkit.getDefaultToolkit().getImage("n.jpg"));
		  f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		  f.setAlwaysOnTop(true); //to display this frame on top of the main window

		  font = new Font("TimesRoman", Font.PLAIN, 24);
		  
		  extra2=new JLabel("Welcome back!", JLabel.CENTER);
		  extra2.setFont(new Font("TimesRoman", Font.BOLD, 60));
		  extra2.setBounds(0,50,685,80);
		  extra2.setBackground(new Color(255,0,0));
		  extra2.setForeground(new Color(255,255,255));
		  extra2.setOpaque(true);
		  f.add(extra2);
	
		 //Login label
		  lg=new JLabel("LOGIN", JLabel.CENTER);
		  lg.setFont(new Font("TimesRoman", Font.BOLD, 34));
		  lg.setBounds(0,150,685,60);
		  lg.setBackground(new Color(255,0,0));
		  lg.setForeground(new Color(255,255,255));
		  lg.setOpaque(true);
		  f.add(lg);

		  //username and password label
		  uname=new JLabel("USERNAME");
		  passwd=new JLabel("PASSWORD");
		  uname.setBounds(150,250,200,30);
		  passwd.setBounds(150,300,200,30);
		  uname.setFont(font);
		  passwd.setFont(font);
		  f.add(uname);
		  f.add(passwd);

		  //username textfield
		  us=new JTextField();
		  us.setBounds(350,250,200,30);
		  us.setFont(font);
		  f.add(us);

		  //password textfield
		  pwd=new JTextField();
		  pwd.setBounds(350,300,200,30);
		  pwd.setFont(font);
		  f.add(pwd);

  		  //login button
  		  sub=new JButton("Login");
 		  sub.setBounds(250,400,175,30);
		  sub.setFont(new Font("TimesRoman", Font.BOLD, 24));
 		  f.add(sub);


		  
		  extra=new JLabel("Not a member?");
		  extra.setBounds(265,440,200,30);
		  extra.setFont(font);
		  extra.setForeground(new Color(255,0,0));
		  extra.setOpaque(true);
		  f.add(extra);

		  reg=new JButton("Register now!");
		  reg.setBounds(250,475,175,30);
		  reg.setFont(new Font("TimesRoman", Font.BOLD, 24));
		  f.add(reg);



		  f.setLayout(null);
		  f.setSize(700,600);
		  f.setLocationRelativeTo(null);
		  f.setVisible(true);

		  //listeners
  
		  reg.addActionListener(this);
		  sub.addActionListener(this);	

 	 }

	 public void actionPerformed(ActionEvent e)
	 {
		  if(e.getSource()==reg)
		  {
			   new RegisterWindow();
			   f.dispose();
		  } 
		  if(e.getSource()==sub)
		  {
			   a=us.getText();
		 	   b=pwd.getText();
			   if(!Pattern.matches("[a-zA-Z]+",a))
			   {
			  	   JOptionPane.showMessageDialog(f, "Username must contain only alphabets","Alert",JOptionPane.ERROR_MESSAGE);
			   }
			   else if(!Pattern.matches("[a-zA-Z0-9]+",b))
			   {
				   JOptionPane.showMessageDialog(f, "Password must contain alphabets and numbers","Alert",JOptionPane.ERROR_MESSAGE);
			   }
			   else
			   {
				   JOptionPane.showMessageDialog(f, "Logged in successfully!","Succeful Login",JOptionPane.INFORMATION_MESSAGE);
				   f.dispose();
			   }	  
		  }		 
	 }
}