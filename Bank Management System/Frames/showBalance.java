package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
//import Classes.*;

public class showBalance extends JFrame implements ActionListener
{
	
	JPanel panel;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton back,exit;
	ImageIcon icon,backI,exitI;
	Color color1,color2,color3;
	JTextField tf1;
	user u;
	users us;
	
	
	
	public showBalance(user u,users us)
	{
		super("View Balance");
		this.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.u=u;
		this.us=us;
		
		//icon = new ImageIcon("Images/check.png");
		backI = new ImageIcon("Images/back.png");
		exitI = new ImageIcon("Images/exit.png");
		
		color1 = new Color(107,80,28);
		color2 = new Color(82,193,194);
		color3 = new Color(88,19,94);
		
		panel = new JPanel();
		panel.setBackground(color1);
		panel.setLayout(null);
		
		
		l1 = new JLabel("Welcome");
		l1.setBounds(250,15,300,40);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Segoe UI",Font.BOLD,22));
		panel.add(l1);
		
		l3 = new JLabel("Account Holder Name:");
		l3.setBounds(50,140,300,40);
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Segoe UI",Font.PLAIN,18));
		panel.add(l3);
		l4 = new JLabel(u.getUserName());
		l4.setBounds(300,140,300,40);
		l4.setForeground(Color.YELLOW);
		l4.setFont(new Font("Segoe UI",Font.ITALIC,19));
		panel.add(l4);
		
		l2 = new JLabel("Balance:  ");
		l2.setBounds(50,220,350,40);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Segoe UI",Font.PLAIN,20));
		panel.add(l2);
		
		tf1= new JTextField("500.0  ৳");
		tf1.setBounds(200,220,200,40);
		tf1.setBackground(color3);
		tf1.setEditable(false);
		tf1.setHorizontalAlignment(JLabel.CENTER);
		tf1.setForeground(Color.WHITE);
		tf1.setFont(new Font("Segoe UI",Font.PLAIN,20));
		tf1.setBorder(null);
		panel.add(tf1);
		
		
		
		
		back = new JButton(" ",backI);
		back.setBounds(0,360,120,100);
		back.setContentAreaFilled(false);
		back.setBorder(null);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.addActionListener(this);
		panel.add(back);
		
		exit = new JButton("",exitI);
		exit.setBounds(440,360,120,100);
		exit.setContentAreaFilled(false);
		exit.setBorder(null);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.addActionListener(this);
		panel.add(exit);
		
		
		
		
		
		
		
		
		
		
		this.add(panel);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==back){
			dispose();
			UserPage up = new UserPage(u,us);
			up.setVisible(true);
		}
		else if(ae.getSource()==exit){
		dispose();
		}
	}
	
	
	/*public static void main(String[] args){
		showBalance sB= new showBalance();
		sB.setVisible(true);
	}*/
}