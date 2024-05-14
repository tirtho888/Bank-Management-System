package Frames;

import java.lang.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
//import Classes.*;

public class developer extends JFrame implements ActionListener
{
	JPanel panel6;
	JLabel bg,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,lR1,lR2,lR3,lZ1,lZ2,lZ3;
	JButton back,exit;
	user u;
	users us;

	
	
	public developer(user u,users us)
	{
		super("Developer");
		this.setSize(780,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(250,100);
		this.setLayout(null);
		ImageIcon iframe = new ImageIcon("Images/mm.png");
		this.setIconImage(iframe.getImage());
		
		this.u=u;
		this.us=us;
		
		
		
		/* ImageIcon deve1 = new ImageIcon("Images/111.jpg");
		Image k1 = deve1.getImage().getScaledInstance(100,180,Image.SCALE_SMOOTH);
		ImageIcon dev1 = new ImageIcon(k1);
		
		ImageIcon deve2 = new ImageIcon("Images/222.jpg");
		Image k2 = deve2.getImage().getScaledInstance(100,180,Image.SCALE_SMOOTH);
		ImageIcon dev2 = new ImageIcon(k2); */
		
		
		
		ImageIcon bgm = new ImageIcon("Images/sky.jpg");
		
		
		
		panel6 = new JPanel();
		panel6.setSize(780,600);
		
		panel6.setLayout(null);
		
		bg = new JLabel(bgm);
		bg.setBounds(0,0,780,600);
		
		/* l24 = new JLabel(dev2);
		l24.setBounds(30,60,140,180);
		panel6.add(l24); */
		l25 = new JLabel("Tirtho Biswas");
		l25.setBounds(100,100,250,30);
		l25.setForeground(Color.WHITE);
		l25.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(l25);
		l26 = new JLabel("ID: 23-54066-3");
		l26.setBounds(100,123,180,30);
		l26.setForeground(Color.WHITE);
		l26.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(l26);
		l27 = new JLabel("Sec: K");
		l27.setBounds(100,146,100,30);
		l27.setForeground(Color.WHITE);
		l27.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(l27);
		
		/* l28 = new JLabel(dev1);
		l28.setBounds(30,265,140,180);
		panel6.add(l28); */
		l29 = new JLabel("Md. Azizur Rahim");
		l29.setBounds(100,290,250,30);
		l29.setForeground(Color.WHITE);
		l29.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(l29);
		l30 = new JLabel("ID: 23-54123-3");
		l30.setBounds(100,313,180,30);
		l30.setForeground(Color.WHITE);
		l30.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(l30);
		l31 = new JLabel("Sec: K");
		l31.setBounds(100,336,100,30);
		l31.setForeground(Color.WHITE);
		l31.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(l31);
		lR1 = new JLabel("MD. Saidur Rahman Rohan");
		lR1.setBounds(300,100,300,30);
		lR1.setForeground(Color.WHITE);
		lR1.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(lR1);
		lR2 = new JLabel("ID: 23-53891-3");
		lR2.setBounds(300,123,180,30);
		lR2.setForeground(Color.WHITE);
		lR2.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(lR2);
		lR3 = new JLabel("Sec: K");
		lR3.setBounds(300,146,100,30);
		lR3.setForeground(Color.WHITE);
		lR3.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(lR3);
		lZ1 = new JLabel("Tanjim Islam Zinnia");
		lZ1.setBounds(300,290,250,30);
		lZ1.setForeground(Color.WHITE);
		lZ1.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(lZ1);
		lZ2 = new JLabel("ID: 23-53550-3");
		lZ2.setBounds(300,313,180,30);
		lZ2.setForeground(Color.WHITE);
		lZ2.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(lZ2);
		lZ3 = new JLabel("Sec: K");
		lZ3.setBounds(300,336,100,30);
		lZ3.setForeground(Color.WHITE);
		lZ3.setFont(new Font("Cambria",Font.BOLD,17));
		panel6.add(lZ3);

		back = new JButton(new ImageIcon("Images/left-arrow.png"));
		back.setBounds(0,470,100,100);
		back.setContentAreaFilled(false);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setBorder(null);
		back.addActionListener(this);
		panel6.add(back);
		
		exit = new JButton(new ImageIcon("Images/logout.png"));
		exit.setBounds(600,470,100,100);
		exit.setContentAreaFilled(false);
		exit.setBorder(null);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.addActionListener(this);
		panel6.add(exit);
	
	
	
	
		panel6.add(bg);
		this.add(panel6);
	
	
	}
	
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==back){
			
			dispose();
			UserPage up = new UserPage(u,us);
			up.setVisible(true);
		}
		
		else if(ae.getSource()==exit){
			dispose();
		}
		
	}
	
	
	
	
	
}