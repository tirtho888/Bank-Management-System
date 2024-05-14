package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
//import Classes.*;



public class UserProfile extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel bglab,userLab,lab1,lab2,lab3,lab4,lab5,lab6,l1,ll2,ftn,dobl,usl,maillab,pinlab,addlab;
	JButton back,edit,pedit,btn4,btn5,btn6,btn7;
	JTextField txt1,txt2,txt3,txt4,txt5;
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8;
	Font font1,font2;
	Color cl1,cl2;
	users us;
	user u;

	
	public UserProfile(user u,users us)
	{
		super("Banking System User Profile");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(350,100);
		this.setResizable(false);
		
		this.u=u;
		this.us=us;

		
		img1 = new ImageIcon("Images/solid.jpg");
		
		font1 = new Font("Raleway",Font.PLAIN,18);
		font2 = new Font("Raleway",Font.BOLD,21);
		
		panel = new JPanel();
		panel.setSize(600,700);
		panel.setLayout(null);
		
		bglab = new JLabel(img1);
		bglab.setBounds(0,0,600,700);
		
		
		lab1 = new JLabel("Your Bio Data");
		lab1.setBounds(200,20,250,40);
		lab1.setFont(new Font("Raleway",Font.BOLD,23));
		lab1.setForeground(Color.BLACK);
		panel.add(lab1);
		
		lab2 = new JLabel("User Name:	");
		lab2.setBounds(40,310,500,40);
		lab2.setFont(font1);
		lab2.setForeground(Color.BLACK);
		panel.add(lab2);
		
		ll2 = new JLabel(u.getName());
		ll2.setBounds(180,310,400,40);
		ll2.setFont(new Font("Raleway",Font.BOLD,20));
		ll2.setForeground(Color.YELLOW);
		panel.add(ll2);
		
		lab3 = new JLabel("Father's Name:  ");
		lab3.setBounds(40,160,500,40);
		lab3.setFont(font1);
		lab3.setForeground(Color.BLACK);
		panel.add(lab3);
		ftn = new JLabel(u.getFatherName());
		ftn.setBounds(180,160,400,40);
		ftn.setFont(new Font("Raleway",Font.BOLD,20));
		ftn.setForeground(Color.YELLOW);
		panel.add(ftn);
		
		
		lab4 = new JLabel("Address:		");
		lab4.setBounds(40,210,500,40);
		lab4.setFont(font1);
		lab4.setForeground(Color.BLACK);
		panel.add(lab4);
		addlab = new JLabel(u.getAddress());
		addlab.setBounds(180,210,400,40);
		addlab.setFont(new Font("Raleway",Font.BOLD,20));
		addlab.setForeground(Color.YELLOW);
		panel.add(addlab);
		
		lab5 = new JLabel("E-mail:		");
		lab5.setBounds(40,260,500,40);
		lab5.setFont(font1);
		lab5.setForeground(Color.BLACK);
		panel.add(lab5);
		maillab = new JLabel(u.getMail());
		maillab.setBounds(180,260,400,40);
		maillab.setFont(new Font("Raleway",Font.BOLD,20));
		maillab.setForeground(Color.YELLOW);
		panel.add(maillab);
		
		lab6 = new JLabel("Name:		");
		lab6.setBounds(40,110,500,40);
		lab6.setFont(font1);
		lab6.setForeground(Color.BLACK);
		panel.add(lab6);
		usl = new JLabel(u.getUserName());
		usl.setBounds(180,110,400,40);
		usl.setFont(new Font("Raleway",Font.BOLD,20));
		usl.setForeground(Color.YELLOW);
		panel.add(usl);
		
		
		l1 = new JLabel("PIN:		");
		l1.setBounds(40,360,500,40);
		l1.setFont(font1);
		l1.setForeground(Color.BLACK);
		panel.add(l1);
		pinlab = new JLabel(u.getUserPass());
		pinlab.setBounds(180,360,400,40);
		pinlab.setFont(new Font("Raleway",Font.BOLD,20));
		pinlab.setForeground(Color.YELLOW);
		panel.add(pinlab);
		
		
		back = new JButton("Back");
		back.setBounds(40,450,100,30);
		back.addActionListener(this);
		panel.add(back);
		
		pedit = new JButton("Edit Profile");
		pedit.setBounds(400,450,120,30);
		pedit.addActionListener(this);
		panel.add(pedit);
		
		
		panel.add(bglab);
		this.add(panel);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==back){
			dispose();
			UserPage ups = new UserPage(u,us);
			ups.setVisible(true);
		}
		
		else if(ae.getSource()==pedit){
			dispose();
			editProfile ep = new editProfile(u,us);
			ep.setVisible(true);
		}
	}
	
	
/*	public static void main(String[] args){
		UserProfile up = new UserProfile(u,us);
		up.setVisible(true);
	}*/
}
