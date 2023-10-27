import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;

public class NewsApp extends JFrame implements MenuListener, ActionListener
{	
	JMenu Briefs, COVID, India, World, Tech, Sports, Login; //menu
	JMenuItem TopStories, Economy, Education, Health, US, EU, Africa, SA, Gadgets, CyberSecurity, Space, Cricket, Football, Tennis; //menu items
	JFrame mainFrame; //main window
	JPanel paneleg; //main panel
	JMenuBar menuBar; //menu bar
	JEditorPane lbb, lbn, lbts, lbed, lbec, lbh, lbus, lbeu, lba, lbsa, lbcs, lbg, lbs, lbc, lbf, lbt; //editor pane to implement html codes
	JScrollPane jsp, jsp2, jsp3, jsp4, jsp5, jsp6, jsp7, jsp8, jsp9, jsp10, jsp11, jsp12, jsp13, jsp14, jsp15, jsp16; //used for scroll bar
	

	NewsApp()
	{	
		paneleg = new JPanel(new CardLayout()); //card layout
		paneleg.setSize(1366,768);

		mainFrame = new JFrame("News"); //frame is the applet window 
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //command prompt becomes unresponsive after closing so this code is added
		mainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("n.jpg")); //this line is to set icon of the window

		menuBar=new JMenuBar();
		
		//initializing menus and setting icon images

		Briefs=new JMenu("Briefs");
		Briefs.setIcon(new ImageIcon("briefs.png")); //to add icons to menu and menu items
		COVID=new JMenu("COVID-19");
		COVID.setIcon(new ImageIcon("covid.png"));
		World=new JMenu("World");
		World.setIcon(new ImageIcon("globe.png"));
		Tech=new JMenu("Technology");
		Tech.setIcon(new ImageIcon("tech.png"));
		Sports=new JMenu("Sports");
		Sports.setIcon(new ImageIcon("sports.png"));
		India=new JMenu("India");
		India.setIcon(new ImageIcon("india.png"));
		Login=new JMenu("LOGIN");
		Login.setIcon(new ImageIcon("login.png"));		

		//initializing menu items and setting icon images

		TopStories=new JMenuItem("Top Stories");
		TopStories.setIcon(new ImageIcon("topstories.png"));
		Economy=new JMenuItem("Economy");
		Economy.setIcon(new ImageIcon("economy.png"));
		Education=new JMenuItem("Education");
		Education.setIcon(new ImageIcon("education.png"));
		Health=new JMenuItem("Health");
		Health.setIcon(new ImageIcon("health.png"));
		US=new JMenuItem("US");
		US.setIcon(new ImageIcon("US.png"));
		EU=new JMenuItem("EU");
		EU.setIcon(new ImageIcon("EU.png"));
		Africa=new JMenuItem("Africa");
		Africa.setIcon(new ImageIcon("africa.png"));
		SA=new JMenuItem("South Asia");
		SA.setIcon(new ImageIcon("SA.png"));
		Gadgets=new JMenuItem("Gadgets");
		Gadgets.setIcon(new ImageIcon("gadgets.png"));
		CyberSecurity=new JMenuItem("Cyber Security");
		CyberSecurity.setIcon(new ImageIcon("cybersecurity.png"));
		Space=new JMenuItem("Space");
		Space.setIcon(new ImageIcon("space.png"));
		Cricket=new JMenuItem("Cricket");
		Cricket.setIcon(new ImageIcon("cricket.png"));
		Football=new JMenuItem("Football");
		Football.setIcon(new ImageIcon("football.png"));
		Tennis=new JMenuItem("Tennis");
		Tennis.setIcon(new ImageIcon("tennis.png"));

		mainFrame.add(paneleg);
		mainFrame.setJMenuBar(menuBar);

		menuBar.add(Box.createHorizontalStrut(5)); //add 5 px space between each menu
		menuBar.add(Briefs);
		menuBar.add(Box.createHorizontalStrut(5));
		menuBar.add(COVID);
		menuBar.add(Box.createHorizontalStrut(5));
		menuBar.add(India);
		menuBar.add(Box.createHorizontalStrut(5));
		menuBar.add(World);
		menuBar.add(Box.createHorizontalStrut(5));
		menuBar.add(Tech);
		menuBar.add(Box.createHorizontalStrut(5));
		menuBar.add(Sports);
		menuBar.add(Box.createHorizontalGlue()); //to add Login menu to the right side
		menuBar.add(Login);
		menuBar.add(Box.createHorizontalStrut(10)); //add 10 px space after Login menu

		India.add(TopStories);
		India.add(Economy);
		India.add(Education);
		India.add(Health);
		World.add(US);
		World.add(EU);
		World.add(Africa);
		World.add(SA);
		Tech.add(Gadgets);
		Tech.add(CyberSecurity);
		Tech.add(Space);
		Sports.add(Cricket);
		Sports.add(Football);
		Sports.add(Tennis);



		//BRIEFS

		lbn= new JEditorPane();
		lbn.setContentType("text/html");
		lbn.setText(getTxtFile("Briefs.txt"));
		lbn.setEditable(false);
		
		//scrollbar for briefs
		jsp=new JScrollPane(lbn);
		paneleg.add("Briefs", jsp);
		
		//COVID

		lbb= new JEditorPane();
		lbb.setContentType("text/html");
		lbb.setText(getTxtFile("Covid.txt"));
		lbb.setEditable(false);
		
		//scrollbar for covid
		jsp2=new JScrollPane(lbb);
		paneleg.add("COVID-19", jsp2);

		//TOP STORIES

		lbts= new JEditorPane();
		lbts.setContentType("text/html");
		lbts.setText(getTxtFile("TopStories.txt"));
		lbts.setEditable(false);
		
		//scrollbar for top stories
		jsp3=new JScrollPane(lbts);
		paneleg.add("Top Stories", jsp3);

		//ECONOMY

		lbec= new JEditorPane();
		lbec.setContentType("text/html");
		lbec.setText(getTxtFile("Economy.txt"));
		lbec.setEditable(false);
		
		//scrollbar for economy		
		jsp4=new JScrollPane(lbec);
		paneleg.add("Economy", jsp4);

		//EDUCATION
		
		lbed= new JEditorPane();
		lbed.setContentType("text/html");
		lbed.setText(getTxtFile("Education.txt"));
		lbed.setEditable(false);
		
		//scrollbar for education
		jsp5=new JScrollPane(lbed);
		paneleg.add("Education", jsp5);

		//HEALTH

		lbh= new JEditorPane();
		lbh.setContentType("text/html");
		lbh.setText(getTxtFile("Health.txt"));
		lbh.setEditable(false);
		
		//scrollbar for health		
		jsp6=new JScrollPane(lbh);
		paneleg.add("Health", jsp6);

		//US

		lbus= new JEditorPane();
		lbus.setContentType("text/html");
		lbus.setText(getTxtFile("US.txt"));
		lbus.setEditable(false);

		//scrollbar for US		
		jsp7=new JScrollPane(lbus);
		paneleg.add("US", jsp7);

		//EU

		lbeu= new JEditorPane();
		lbeu.setContentType("text/html");
		lbeu.setText(getTxtFile("EU.txt"));
		lbeu.setEditable(false);

		//scrollbar for EU		
		jsp8=new JScrollPane(lbeu);
		paneleg.add("EU", jsp8);

		//AFRICA

		lba= new JEditorPane();
		lba.setContentType("text/html");
		lba.setText(getTxtFile("Africa.txt"));
		lba.setEditable(false);

		//scrollbar for Africa		
		jsp9=new JScrollPane(lba);
		paneleg.add("Africa", jsp9);

		//SA

		lbsa= new JEditorPane();
		lbsa.setContentType("text/html");
		lbsa.setText(getTxtFile("SA.txt"));
		lbsa.setEditable(false);

		//scrollbar for SA		
		jsp10=new JScrollPane(lbsa);
		paneleg.add("South Asia", jsp10);

		//GADGETS

		lbg= new JEditorPane();
		lbg.setContentType("text/html");
		lbg.setText(getTxtFile("Gadgets.txt"));
		lbg.setEditable(false);

		//scrollbar for gadgets		
		jsp11=new JScrollPane(lbg);
		paneleg.add("Gadgets", jsp11);

		//CS

		lbcs= new JEditorPane();
		lbcs.setContentType("text/html");
		lbcs.setText(getTxtFile("CS.txt"));
		lbcs.setEditable(false);

		//scrollbar for CS		
		jsp12=new JScrollPane(lbcs);
		paneleg.add("Cyber Security", jsp12);

		//SPACE

		lbs= new JEditorPane();
		lbs.setContentType("text/html");
		lbs.setText(getTxtFile("Space.txt"));
		lbs.setEditable(false);

		//srollbar for space		
		jsp13=new JScrollPane(lbs);
		paneleg.add("Space", jsp13);
		
		//CRICKET

		lbc= new JEditorPane();
		lbc.setContentType("text/html");
		lbc.setText(getTxtFile("Cricket.txt"));
		lbc.setEditable(false);

		//scrollbar for cricket		
		jsp14=new JScrollPane(lbc);
		paneleg.add("Cricket", jsp14);

		//FOOTBALL

		lbf= new JEditorPane();
		lbf.setContentType("text/html");
		lbf.setText(getTxtFile("Football.txt"));
		lbf.setEditable(false);

		//scrollbar for football		
		jsp15=new JScrollPane(lbf);
		paneleg.add("Football", jsp15);

		//TENNIS

		lbt= new JEditorPane();
		lbt.setContentType("text/html");
		lbt.setText(getTxtFile("Tennis.txt"));
		lbt.setEditable(false);

		//scrollbar for tennis		
		jsp16=new JScrollPane(lbt);
		paneleg.add("Tennis", jsp16);



                	                 //This code is for customization
		
		//menu
		menuBar.setBackground(new Color(189,0,0)); // Color(R,G,B)   this code is to color the menubar 
		menuBar.setOpaque(true); //we have to set the menu bar opaque in order for the color to be visible

		Font font = new Font("TimesRoman", Font.PLAIN, 32);

		India.setForeground(new Color(255,255,255));
		India.setFont(font);
		Briefs.setForeground(new Color(255,255,255));
		Briefs.setFont(font);
		COVID.setOpaque(false);
		COVID.setForeground(new Color(255,255,255));
		COVID.setFont(font);
		World.setForeground(new Color(255,255,255));
		World.setFont(font);
		Tech.setForeground(new Color(255,255,255));
		Tech.setFont(font);
		Sports.setForeground(new Color(255,255,255));
		Sports.setFont(font);
		Login.setForeground(new Color(255,255,255));
		Login.setFont(new Font("TimesRoman", Font.BOLD, 36));
		

		//menuitem
		TopStories.setBackground(new Color(50,50,255));
		Economy.setBackground(new Color(50,50,255));
		Education.setBackground(new Color(50,50,255));
		Health.setBackground(new Color(50,50,255));
		US.setBackground(new Color(50,50,255));
		EU.setBackground(new Color(50,50,255));
		Africa.setBackground(new Color(50,50,255));
		SA.setBackground(new Color(50,50,255));
		Gadgets.setBackground(new Color(50,50,255));
		CyberSecurity.setBackground(new Color(50,50,255));
		Space.setBackground(new Color(50,50,255));
		Cricket.setBackground(new Color(50,50,255));
		Football.setBackground(new Color(50,50,255));
		Tennis.setBackground(new Color(50,50,255));
		
		TopStories.setForeground(new Color(255,255,255));
		Economy.setForeground(new Color(255,255,255));
		Education.setForeground(new Color(255,255,255));
		Health.setForeground(new Color(255,255,255));
		US.setForeground(new Color(255,255,255));
		EU.setForeground(new Color(255,255,255));
		Africa.setForeground(new Color(255,255,255));
		SA.setForeground(new Color(255,255,255));
		Gadgets.setForeground(new Color(255,255,255));
		CyberSecurity.setForeground(new Color(255,255,255));
		Space.setForeground(new Color(255,255,255));
		Cricket.setForeground(new Color(255,255,255));
		Football.setForeground(new Color(255,255,255));
		Tennis.setForeground(new Color(255,255,255));

		TopStories.setFont(font);
		Economy.setFont(font);
		Education.setFont(font);
		Health.setFont(font);
		US.setFont(font);
		EU.setFont(font);
		Africa.setFont(font);
		SA.setFont(font);
		Gadgets.setFont(font);
		CyberSecurity.setFont(font);
		Space.setFont(font);
		Cricket.setFont(font);
		Football.setFont(font);
		Tennis.setFont(font);

		paneleg.setBounds(40,80,200,200);
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setVisible(true);
		paneleg.setVisible(true);

		COVID.addMenuListener(this);
		Briefs.addMenuListener(this);
		Login.addMenuListener(this);

		TopStories.addActionListener(this);
		Economy.addActionListener(this);
		Education.addActionListener(this);
		Health.addActionListener(this);
		US.addActionListener(this);
		EU.addActionListener(this);
		Africa.addActionListener(this);
		SA.addActionListener(this);
		Gadgets.addActionListener(this);
		CyberSecurity.addActionListener(this);
		Space.addActionListener(this);
		Cricket.addActionListener(this);
		Football.addActionListener(this);
		Tennis.addActionListener(this);
	}

	public void menuSelected(MenuEvent e)
	{
		 CardLayout cl = (CardLayout)(paneleg.getLayout());
		 JMenu menu = (JMenu)e.getSource();
		 if(menu.getText()=="LOGIN")
		 {
			new LoginWindow();
		 }
		 cl.show(paneleg, (String)menu.getText());
	}

	public void menuCanceled(MenuEvent e) 
	{	
		JMenu menu = (JMenu)e.getSource();
	}

	public void menuDeselected(MenuEvent e) 
	{	 
		JMenu menu = (JMenu)e.getSource();
	}

	public void actionPerformed(ActionEvent e)
	{
		CardLayout cl = (CardLayout)(paneleg.getLayout());
		 JMenuItem menu = (JMenuItem)e.getSource();
		 cl.show(paneleg, (String)menu.getText());
	}

	public String getTxtFile(String FileName)
	{	
		String news="", line="";
		try
		{	
			FileReader fr=new FileReader(FileName);
			BufferedReader br=new BufferedReader(fr);
			while((line=br.readLine())!= null)
			{
				news=news+line;
			}
			br.close();
			
		}
		catch(IOException e)
		{
			System.out.println("Error in reading the file");
		}
		return(news);
	}
	
	public static void main(String []args)
	{
		new NewsApp();
	}			
}