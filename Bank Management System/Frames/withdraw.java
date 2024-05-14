package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
//import Classes.*;

public class withdraw extends JFrame implements ActionListener,MouseListener
{
	
	JPanel panel;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField tf1;
	JButton confirm,back,exit;
	ImageIcon icon,backI,exitI;
	Color color1,color2;
	user u;
	users us;
	
	
	
	
	public withdraw(user u,users us)
	{
		super("withdraw Money");
		this.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.u=u;
		this.us=us;
		
		icon = new ImageIcon("Images/check.png");
		backI = new ImageIcon("Images/back.png");
		exitI = new ImageIcon("Images/exit.png");
		
		color1 = new Color(107,80,28);
		color2 = new Color(82,193,194);
		
		panel = new JPanel();
		panel.setBackground(color1);
		panel.setLayout(null);
		
		
		l1 = new JLabel("Enter Amount for withdraw");
		l1.setBounds(50,130,300,40);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Segoe UI",Font.PLAIN,20));
		panel.add(l1);
		
		tf1 = new JTextField();
		tf1.setBounds(300,130,160,40);
		tf1.setFont(new Font("Segoe UI",Font.PLAIN,18));
		tf1.setBackground(Color.CYAN);
		panel.add(tf1);
		
		l2 = new JLabel("Account Holder Name:");
		l2.setBounds(50,70,300,40);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Segoe UI",Font.PLAIN,18));
		panel.add(l2);
		l3 = new JLabel(u.getUserName());
		l3.setBounds(300,70,300,40);
		l3.setForeground(Color.YELLOW);
		l3.setFont(new Font("Segoe UI",Font.ITALIC,19));
		panel.add(l3);
		
		
		confirm = new JButton(" Confirm",icon);
		confirm.setBounds(190,300,250,50);
		confirm.setBackground(color2);
		confirm.setBorder(new LineBorder(Color.RED));
		confirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
		confirm.setForeground(Color.WHITE);
		confirm.setFont(new Font("Segoe UI",Font.PLAIN,20));
		confirm.addMouseListener(this);
		confirm.addActionListener(this);
		panel.add(confirm);
		
		
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
		String tk = tf1.getText();
		
		if(ae.getSource()==confirm && tk.isEmpty()){
			JOptionPane.showMessageDialog(null,"Invalid amount");
		}
		
		else if(ae.getSource()==confirm){
			JOptionPane.showMessageDialog(null,"Taka	  "+tk+"	  Withdraw Succes","Withdraw!",-1);

		}
		
		else if(ae.getSource()==back)
		{
			dispose();
			UserPage up = new UserPage(u,us);
			up.setVisible(true);
		}
		else if(ae.getSource()==exit){
			dispose();
		}
		else{
			
		}
	}
	
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==confirm){
		confirm.setBackground(Color.RED);
	}
	}
	
	public void mouseClicked(MouseEvent me){
	
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource()==confirm){
			confirm.setBackground(color2);
		}
		
	}
	
	/*public static void main(String[] args){
		withdraw dd = new withdraw(u,us);
		dd.setVisible(true);
	}*/
	
}