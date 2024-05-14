package Frames;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import Classes.*;

public class adminPanel extends JFrame implements ActionListener {

    ImageIcon icon, logo;
    JLabel label1, imgLabel,info;
    Font font1, font2;
    JButton btn1, btn2, btn3, btn4, nBtn;
    Cursor cursor;
	JPanel panel;
	user u;
	users us;


		public adminPanel(user u,users us)
	{
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Admin Panel");
        this.setSize(650, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		this.u=u;
		this.us=us;
		
		//this.f1=f1;
		
		logo = new ImageIcon("Images/personalization.png");
		Image i1 = logo.getImage().getScaledInstance(400,400,Image.SCALE_SMOOTH);
		ImageIcon logo2 = new ImageIcon(i1);
        imgLabel = new JLabel(logo2);
        imgLabel.setBounds(127, 20, logo2.getIconWidth(), logo2.getIconHeight());
        this.add(imgLabel);
		
		font1 = new Font("Tahoma", Font.BOLD, 60);
        font2 = new Font("Segoe UI Black", Font.PLAIN, 25);
		
		panel = new JPanel();
		panel.setSize(650,700);
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		
		
		label1 = new JLabel("Admin Panel");
        label1.setBounds(123, 420, 433, 50);
        label1.setFont(font1);
        panel.add(label1);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("User Data");
        btn1.setBounds(150, 510, 350, 50);
        btn1.setFont(font2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
		btn1.addActionListener(this);
        panel.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(299, 581, 270, 50);
        btn2.setFont(font2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
		btn2.addActionListener(this);
        panel.add(btn2);

        btn3 = new JButton("Exit");
        btn3.setBounds(64, 581, 207, 50);
        btn3.setFont(font2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00000"));
		btn3.addActionListener(this);
        panel.add(btn3);

        /*btn4 = new JButton("Admin Password");
        btn4.setBounds(299, 510, 270, 50);
        btn4.setFont(font2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        panel.add(btn4);*/
		
		//info = new JLabel("Info: "+s1+" "+s2);
		//info.setBounds(50,50,350,40);
		//panel.add(info);
		
		
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn3){
			dispose();
		}
		else if(ae.getSource()==btn2){
			
			dispose();
			frame f1 = new frame(us);
			f1.setVisible(true);
		}
		else if(ae.getSource()==btn1){
			dispose();
			UserData ud = new UserData(u,us);
			ud.setVisible(true);
		}
		
	}
	

}

