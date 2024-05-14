package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
//import Classes.*;


public class UserPage extends JFrame implements ActionListener,MouseListener
{
	JPanel panel;
	JLabel bglab,userLab,lab1,lab2,lab3,lab4,lab5,lab6;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	JTextField txt1,txt2,txt3,txt4,txt5;
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8;
	Font font1;
	Color cl1,cl2;
	users us;
	user u;
	
	
	
	public UserPage(user u,users us)
	{
		super("Banking System User Panel");
		this.setSize(600,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(350,50);
		this.setResizable(false);
		
		this.u=u;
		this.us=us;
		
		img1 = new ImageIcon("Images/kllzz.jpg");
		Image i1 = img1.getImage().getScaledInstance(600,700,Image.SCALE_SMOOTH);
		ImageIcon i2 = new ImageIcon(i1);
		img2 = new ImageIcon("Images/donation.png");
		img3 = new ImageIcon("Images/withdraw.png");
		img4 = new ImageIcon("Images/coding.png");
		img5 = new ImageIcon("Images/website.png");
		img6 = new ImageIcon("Images/back.png");
		img7 = new ImageIcon("Images/profile.png");
		
		
		font1 = new Font("Arial",Font.BOLD,19);
		
		cl1 = new Color(206,225,255);
		cl2 = new Color(106,255,214);
		
		panel = new JPanel();
		panel.setSize(600,700);
		panel.setLayout(null);
		
		bglab = new JLabel(i2);
		bglab.setBounds(0,0,600,700);
		
		
		lab1 = new JLabel("User: ");
		lab1.setBounds(345,10,300,40);
		lab1.setForeground(Color.WHITE);
		lab1.setFont(font1);
		panel.add(lab1);
		
		lab2 = new JLabel(u.getUserName());
		lab2.setBounds(410,10,300,40);
		lab2.setForeground(Color.YELLOW);
		lab2.setFont(new Font("Arial",Font.BOLD,20));
		panel.add(lab2);
		
		
		btn1 = new JButton("  Deposite",img2);
		btn1.setBounds(30,250,220,50);
		btn1.setFont(new Font("Arial",Font.BOLD,20));
		btn1.setBorder(new LineBorder(Color.YELLOW));
		btn1.setBackground(cl1);
		btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn1.addActionListener(this);
		btn1.addMouseListener(this);
		panel.add(btn1);
		
		btn2 = new JButton("  Withdraw",img3);
		btn2.setBounds(335,250,220,50);
		btn2.setFont(new Font("Arial",Font.BOLD,20));
		btn2.setBackground(cl2);;
		btn2.setBorder(new LineBorder(Color.WHITE));
		btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn2.addActionListener(this);
		btn2.addMouseListener(this);
		panel.add(btn2);
		
		btn3 = new JButton(" View Balance",img5);
		btn3.setBounds(30,350,220,50);
		btn3.setFont(new Font("Arial",Font.BOLD,20));
		btn3.setBorder(new LineBorder(Color.YELLOW));
		btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn3.setBackground(cl2);
		btn3.addMouseListener(this);
		btn3.addActionListener(this);
		panel.add(btn3);
		
		btn7 = new JButton(" Profile",img7);
		btn7.setBounds(335,350,220,50);
		btn7.setBackground(cl1);
		btn7.setFont(new Font("Arial",Font.BOLD,20));
		btn7.setBorder(new LineBorder(Color.WHITE));
		btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn7.addActionListener(this);
		btn7.addMouseListener(this);
		panel.add(btn7);
		
		btn4 = new JButton("  Developer",img4);
		btn4.setBounds(0,5,220,50);
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(cl1);
		btn4.setContentAreaFilled(false);
		btn4.setBorder(null);
		btn4.setOpaque(false);
		btn4.setFont(new Font("Arial",Font.BOLD,20));
		btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn4.addActionListener(this);
		btn4.addMouseListener(this);
		panel.add(btn4);
		
		btn5 = new JButton(img6);//back button
		btn5.setBounds(0,500,150,200);
		btn5.setOpaque(false);
		btn5.setBorder(null);
		btn5.setContentAreaFilled(false);
		btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn5.addActionListener(this);
		panel.add(btn5);
		
		btn6 = new JButton("Sign Out");
		btn6.setBounds(440,500,150,200);
		btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn6.setContentAreaFilled(false);
		btn6.setBorder(null);
		btn6.setOpaque(false);
		btn6.setFont(new Font("Segoe UI",Font.BOLD,18));
		btn6.setForeground(Color.WHITE);
		btn6.addActionListener(this);
		btn6.addMouseListener(this);
		panel.add(btn6);
		
		
		
		
		
		
		
		
		panel.add(bglab);
		this.add(panel);
		
	}
	
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource()==btn5){
			
			dispose();
			frame ff = new frame(us);
			ff.setVisible(true);
			
		}
		else if(ae.getSource()==btn6){
			
			dispose();
			frame ff = new frame(us);
			ff.setVisible(true);
			
		}
		else if(ae.getSource()==btn7){
			dispose();
			UserProfile upp = new UserProfile(u,us);
			upp.setVisible(true);
		}
		
		else if(ae.getSource()==btn4){
			dispose();
			developer dd = new developer(u,us);
			dd.setVisible(true);
		}
		else if(ae.getSource()==btn1){
			dispose();
			deposit ddt = new deposit(u,us);
			ddt.setVisible(true);
		}
		else if(ae.getSource()==btn2){
			dispose();
			withdraw ww = new withdraw(u,us);
			ww.setVisible(true);
		}
		else if(ae.getSource()==btn3){
			dispose();
			showBalance sb = new showBalance(u,us);
			sb.setVisible(true);
		}
		
		else{
			
		}
		
	}
	
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==btn1)
	{
		btn1.setBackground(Color.RED);
	}
	else if(me.getSource()==btn2)
	{
		btn2.setBackground(Color.RED);
	
	}
	else if(me.getSource()==btn3)
	{
		btn3.setBackground(Color.RED);
	
	}
	else if(me.getSource()==btn4)
	{
		btn4.setForeground(Color.RED);
	
	}
	else if(me.getSource()==btn6)
	{
		btn6.setForeground(Color.RED);
	
	}
	else if(me.getSource()==btn7)
	{
		btn7.setBackground(Color.RED);
	
	}
	}
	
	public void mouseClicked(MouseEvent me){
	
	}
	public void mouseExited(MouseEvent me){
		
		if(me.getSource()==btn1)
	{
		btn1.setBackground(cl1);
	}
	else if(me.getSource()==btn2)
	{
		btn2.setBackground(cl2);
	
	}
	else if(me.getSource()==btn3)
	{
		btn3.setBackground(cl2);
	
	}
	else if(me.getSource()==btn4)
	{
		btn4.setForeground(Color.WHITE);
	
	}
	else if(me.getSource()==btn6)
	{
		btn6.setForeground(Color.WHITE);
	
	}
	else if(me.getSource()==btn7)
	{
		btn7.setBackground(cl1);
	
	}
		
	}
	
	
	/*public static void main(String[] args)
	{
		
		//UserPage up = new UserPage(Account acc,UserSigned usd);
		//up.setVisible(true);
		
	}*/

	
	
	
}