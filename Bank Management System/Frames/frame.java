package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.border.*;
import java.io.*;
//import Classes.*;

public class frame extends JFrame implements ActionListener,MouseListener
{
	JLabel name,pass,f1,logo,cmlog,lay,log,s5,s6,bName,blog,jlogo2,nAme,pAss,accn,panellogo;
	JPanel panel,pan2;
	JTextField jname;
	JPasswordField jpass;
	Color mycolor,mycolor2,mycolor3;
	Font myfont,font2,font;
	JButton button,button2;
	ImageIcon icon,ipan,iframe,cmlogp,pan22,blo,logo2,eyeI,notEye;
	JToggleButton tglB,TglB;
	JCheckBox check1,check2,check3;
	ButtonGroup bg;
	File file;
	FileReader freader;
	BufferedReader br;
	
	user u = null;
	users us = null;

	
	public frame(users us)
	{
		super("Bank Management System");
		this.setSize(850,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(250,100);
		iframe = new ImageIcon("Images/mm.png");
		this.setIconImage(iframe.getImage());
		
		this.us=us;
		
		mycolor = new Color(210, 230, 135);
		mycolor2 = new Color(180, 196, 240);
		mycolor3 = new Color(114, 121, 141);
		Color coloor = new Color(29,76,189);
		Color color1 = new Color(219,227,224);
		
		
		ipan = new ImageIcon("Images/solid.jpg");
		cmlogp = new ImageIcon("Images/iBank.png");
		Image i2 = cmlogp.getImage().getScaledInstance(250,150,Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);
		pan22 = new ImageIcon("Images/sky2.jpg");
		blo = new ImageIcon("Images/bank logo.png");
		logo2 = new ImageIcon("Images/panel.jpg");
		Image j2 = logo2.getImage().getScaledInstance(400,650,Image.SCALE_SMOOTH);
		ImageIcon j3 = new ImageIcon(j2);
		eyeI = new ImageIcon("Images/icon3.png");
		notEye = new ImageIcon("Images/icon2.png");
		ImageIcon m5 = new ImageIcon("Images/icon.png");
		
		
		myfont = new Font("Segoe UI", Font.PLAIN, 16);
		font2 = new Font("Segoe UI", Font.BOLD, 26);
		font = new Font("Segoe UI",Font.PLAIN,18);
		
		
		panel = new JPanel();
		panel.setBounds(0,0,365,650);
		panel.setBackground(Color.CYAN);
		panel.setLayout(null);
		
		panellogo = new JLabel();
		panellogo.setBounds(0,0,365,650);
		panel.add(panellogo);

		
		pan2 = new JPanel();
		pan2.setBounds(430,0,520,650);
		pan2.setBackground(coloor);
		pan2.setLayout(null);
		
		//s6 = new JLabel(pan22);
		//s6.setBounds(0,0,365,590);
		
		
		log = new JLabel("Log In");
		log.setBounds(510,40,100,40);
		log.setForeground(Color.WHITE);
		log.setFont(font2);
		pan2.add(log);
		
		
		name = new JLabel("User Name:");
		name.setFont(font);
		name.setBounds(420,140,150,30);
		name.setForeground(Color.WHITE);
		pan2.add(name);
		
		accn = new JLabel(m5);
		accn.setBounds(570,90,200,200);
		pan2.add(accn);
		
		nAme = new JLabel("________________________________");
		nAme.setBounds(420,180,350,30);
		nAme.setForeground(Color.white);
		nAme.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		pan2.add(nAme);
		jname = new JTextField();
		jname.setBounds(420,175,210,30);
		jname.setFont(myfont);
		jname.setForeground(Color.white);
        jname.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jname.setCaretColor(Color.white);
        jname.setBorder(null);
		jname.setOpaque(false);
		pan2.add(jname);
		
		pass = new JLabel("PIN");
		pass.setBounds(420,230,100,30);
		pass.setFont(font);
		pass.setForeground(Color.WHITE);
		pan2.add(pass);
		
		pAss = new JLabel("________________________________");
		pAss.setBounds(420,270,350,30);
		pAss.setForeground(Color.white);
		pAss.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		pan2.add(pAss);
		
		
		tglB = new JToggleButton("",eyeI);
		tglB.setBounds(640,270,65,35);
		tglB.setBorder(null);
		tglB.setOpaque(false);
		tglB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tglB.setFocusPainted(false);
        tglB.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        tglB.setContentAreaFilled(false);
		tglB.addMouseListener(this);
		//tglB.setVisible(false);
		
		
		TglB = new JToggleButton("",notEye);
		TglB.setBounds(640,270,65,35);
		TglB.setBorder(null);
		TglB.setOpaque(false);
		TglB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        TglB.setFocusPainted(false);
        TglB.setContentAreaFilled(false);
		TglB.addMouseListener(this);
		TglB.setVisible(false);
		
		
		jpass = new JPasswordField();
		jpass.setBounds(420,265,210,30);
		jpass.setForeground(Color.WHITE);
		jpass.setEchoChar('*');
		jpass.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		jpass.setCaretColor(Color.WHITE);
		jpass.setBorder(null);
		jpass.setOpaque(false);
		jpass.setFont(myfont);
		pan2.add(jpass);
		

		check1 = new JCheckBox("  Admin Login");
		check1.setBounds(420,350,150,40);
		check1.setFont(new Font("Segoe UI",Font.BOLD,17));
		check1.setForeground(Color.WHITE);
		check1.setOpaque(false);
		check1.setContentAreaFilled(false);
		check1.setBorder(null);
		pan2.add(check1);
		
		check2 = new JCheckBox("  User Login");
		check2.setBounds(600,350,150,40);
		check2.setFont(new Font("Segoe UI",Font.BOLD,17));
		check2.setForeground(Color.WHITE);
		check2.setOpaque(false);
		check2.setContentAreaFilled(false);
		check2.setBorder(null);
		pan2.add(check2);
		
		bg = new ButtonGroup();
		bg.add(check1);
		bg.add(check2);
		
		button = new JButton("Sign In");
		button.setBounds(420,440,250,30);
		button.setBackground(Color.WHITE);
		button.setBorder(new LineBorder(Color.YELLOW));
		button.setFont(new Font("segoe UI",Font.BOLD,18));
		button.addActionListener(this);
		button.addMouseListener(this);
		pan2.add(button);
		
		button2 = new JButton("Sign Up");
		button2.setBounds(550,510,150,30);
		button2.setBackground(mycolor2);
		button2.setContentAreaFilled(false);
		button2.setBorder(null);
		button2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		button2.addMouseListener(this);
		pan2.add(button2);
		
		
		jlogo2 = new JLabel(j3);
		jlogo2.setBounds(0,0,400,650);
		panel.add(jlogo2);
		
	
		s5 = new JLabel("Don't have an account?");
		s5.setBounds(420,505,296,40);
		s5.setForeground(Color.WHITE);
		s5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		pan2.add(s5);
		
		icon = new ImageIcon("img1.jpg");
		pan2.add(tglB);
		pan2.add(TglB);
		this.add(panel);
		this.add(pan2);
	}
	
	
	public void actionPerformed(ActionEvent ae)
				{
					String adminuser = jname.getText();
					String adminpassword = jpass.getText();
					
					if(ae.getSource() == button && check1.isSelected() && adminuser.equals("admin") && adminpassword.equals("admin")){
						
						JOptionPane.showMessageDialog(null,"You have succesfully login as Admin");
						dispose();
						adminPanel adm1 = new adminPanel(u,us);
						adm1.setVisible(true);
					}
					else if(ae.getSource() == button && check1.isSelected()){
						JOptionPane.showMessageDialog(null,"Invalid User Name or password","Warning!",2);
					}
					

					else if(ae.getSource()==button2 )
						{	
						dispose();
						sign newWindo = new sign(us);
						newWindo.setVisible(true);
						}
					else if(ae.getSource() == button && check2.isSelected()){
						
						String userName = jname.getText();
						String password = jpass.getText();
					
						int index = us.userExists(userName);
						if(index == -1){
							JOptionPane.showMessageDialog(this, "User doesn't exist!");
					}else{
						u = us.checkCredentials(index,password);
						if(u == null ){
						JOptionPane.showMessageDialog(this, "Password incorrect");
					}
					else{
								
								JOptionPane.showMessageDialog(null,"You have Succesfully log in","Thank you!",-1);
								dispose();
								UserPage ll = new UserPage(u,us);
								ll.setVisible(true);
								
								
							}
						
					}
					
				}
				}
				
				public void mouseClicked(MouseEvent me){
					if(me.getSource() == tglB){
					
						
						
						TglB.setVisible(true);
						tglB.setVisible(false);
						jpass.setEchoChar((char)0);
					}
					else if(me.getSource() == TglB){
						
						TglB.setVisible(false);
						tglB.setVisible(true);
						jpass.setEchoChar('*');	
					}
					
					else{
					}
					
				}
				public void mouseEntered(MouseEvent me){
					if(me.getSource() == button2){
						button2.setForeground(Color.RED);
						
					}
					else if(me.getSource() == button){
						button.setBackground(Color.RED);
					}
					else{
						
					}
					
				}
				public void mouseReleased(MouseEvent me){}
				public void mouseExited(MouseEvent me){
					if(me.getSource() == button2)
					{
						button2.setForeground(Color.WHITE);
					}
					else if(me.getSource() == button){
						button.setBackground(Color.WHITE);
					}
					
				}
				public void mousePressed(MouseEvent me){}
	
	
		
}